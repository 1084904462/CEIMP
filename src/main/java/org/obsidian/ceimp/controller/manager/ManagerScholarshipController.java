package org.obsidian.ceimp.controller.manager;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.ScholarshipService;
import org.obsidian.ceimp.util.TimeUtil;
import org.obsidian.ceimp.util.UrlUtil;
import org.obsidian.ceimp.util.ZipUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Controller
public class ManagerScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private OpinionService opinionService;

    /**
     * showScholarshipBean
     * 根据subName从数据库中表scholarship查询奖学金名称
     * 根据session中managerLogBean的schoolId查询数据库中表major对应所有年级
     * 默认年份为当前年份
     *
     * ScholarshipFormBeanList
     * 根据subName判断从ng、nis、pgs、ss、tas哪张表查询数据，根据yearScope判断查询哪年，获得userIdList
     * 关联表major、class_num、user_basic根据userIdList查询major、classNum、account、username
     * 根据grade判断查询表major中的grade为哪个年级
     * 根据subName查询表scholarship中奖学金名称scholarshipName
     * @param subName 奖学金名称缩写
     * @return
     */
    @GetMapping("/manager/scholarship/{subName}")
    public String showScholarship(@PathVariable("subName") String subName, HttpSession session, Model model){
        logger.info("subName:" + subName);
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        ShowScholarshipBean showScholarshipBean = scholarshipService.getShowScholarshipBean(subName,managerLogBean.getSchoolId());
        logger.info(showScholarshipBean);
        model.addAttribute("showScholarshipBean",showScholarshipBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<ScholarshipFormBean> scholarshipFormBeanList = scholarshipService.getScholarshipFormBeanList(subName,yearScope,showScholarshipBean.getGrade().get(0));
        logger.info(scholarshipFormBeanList);
        model.addAttribute("scholarshipFormBeanList",scholarshipFormBeanList);
        return "manager/showScholarship";
    }

    /**
     * 根据subName从数据库表scholarship中查询对应的奖学金名称scholarshipName(查询结果为模板名称model_name分割'模板'前面的字)
     * 根据subName和zipInfoBeanList获取需要打包的所有奖学金文件路劲zipInputUrlList
     * 根据scholarshipName获取打包后生成的zip文件路径
     * @param subName 奖学金名称缩写
     * @param zipInfoBeanList 包含学号account、姓名username、奖学金名称scholarshipName
     * @param response 将打包文件通过response返回给客户端
     * @throws IOException
     */
    @PostMapping("/manager/scholarship/zip/{subName}")
    public void getScholarshipZip(@PathVariable("subName") String subName, List<ZipInfoBean> zipInfoBeanList, HttpServletResponse response) throws IOException {
        logger.info("subName:" + subName + " zipInfoBeanList:" + zipInfoBeanList);
        String scholarshipName = scholarshipService.selectScholarshipNameBySubName(subName);
        logger.info("scholarshipName:" + scholarshipName);
        List<String> zipInputUrlList = UrlUtil.getInstance().getZipInputUrlList(subName,zipInfoBeanList);
        logger.info("zipInputUrlList:" + zipInputUrlList);
        String zipOutputUrl = UrlUtil.getInstance().getZipOutputUrl(scholarshipName);
        logger.info("zipOutputUrl:" + zipOutputUrl);
        ZipUtil.getInstance().zip(zipInputUrlList,zipOutputUrl,response,scholarshipName);
    }

    /**
     * 默认只能删除当前正在进行的综测所属的奖学金
     * 根据subName对应的数据库表ng、nis、pgs、ss、tas中删除userAccountBeanList中account对应的奖学金记录
     * @param subName 奖学金名称缩写
     * @param userAccountBeanList 包含用户学号account
     * @return
     */
    @PostMapping("/manager/scholarship/delete/{subName}")
    @ResponseBody
    public String deleteScholarship(@PathVariable("subName") String subName,@RequestBody List<UserAccountBean> userAccountBeanList){
        logger.info("subName:" + subName + " userAccountBeanList:" + userAccountBeanList);
        int yearScope = TimeUtil.getInstance().getThisYear();
        Integer isDelete = scholarshipService.deleteBySubNameAndUserAccountBeanListAndYearScope(subName,userAccountBeanList,yearScope);
        StatusBean statusBean = new StatusBean();
        if(isDelete != 0){
            statusBean.setStatus("删除成功");
        }
        else{
            statusBean.setStatus("删除失败");
        }
        return JSON.toJSONString(statusBean);
    }


    /**
     * 从session中获取对应的managerId
     * 默认只能查询当前综测的意见
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/manager/scholarship/opinion")
    public String pageScholarshipOpinion(HttpSession session,Model model){
        Long managerId = ((ManagerLogBean)session.getAttribute("managerLogBean")).getManagerId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        ScholarshipOpinionBean scholarshipOpinionBean = opinionService.selectByManagerIdAndYearScope(managerId,yearScope);
        logger.info(scholarshipOpinionBean);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinionBean);
        return "user/scholarship/opinion";
    }


    /**
     * 从session中获取managerId
     * 默认只能修改本次综测的奖学金意见
     * @param session
     * @param scholarshipOpinionBean
     * @return
     */
    @PostMapping("/manager/scholarship/opinion")
    @ResponseBody
    public String updateScholarshipOpinion(HttpSession session,@RequestBody ScholarshipOpinionBean scholarshipOpinionBean){
        logger.info(scholarshipOpinionBean);
        Long managerId = ((ManagerLogBean)session.getAttribute("managerLogBean")).getManagerId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        opinionService.updateByManagerIdAndYearScopeAndScholarshipOpinionBean(managerId,yearScope,scholarshipOpinionBean);
        ScholarshipOpinionBean newScholarshipOpinionBean = opinionService.selectByManagerIdAndYearScope(managerId,yearScope);
        logger.info(newScholarshipOpinionBean);
        return JSON.toJSONString(newScholarshipOpinionBean);
    }


}
