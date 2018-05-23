package org.obsidian.ceimp.controller.manager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.TimeUtil;
import org.obsidian.ceimp.util.UrlUtil;
import org.obsidian.ceimp.util.ZipUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/18.
 */
@Controller
@RequestMapping("/manager/scholarship")
public class ManagerScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private BasicScholarshipService basicScholarshipService;

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private OpinionService opinionService;

    /**
     * showScholarshipBean
     * 根据subName从数据库中表scholarship查询奖学金名称
     * 根据session中managerLogBean的schoolId查询数据库中表major对应所有年级
     * 默认年份为当前年份
     *
     * scholarshipFormBeanList
     * 根据subName判断从ng、nis、pgs、ss、tas哪张表查询数据，根据yearScope判断查询哪年，获得userIdList
     * 关联表major、class_num、user_basic根据userIdList查询major、classNum、account、username
     * 根据grade判断查询表major中的grade为哪个年级
     * 根据subName查询表scholarship中奖学金名称scholarshipName
     * @param subName 奖学金名称缩写
     * @return
     */
    @GetMapping("/{subName}")
    public String pageScholarship(@PathVariable("subName") String subName, HttpSession session, Model model){
        logger.debug("subName:" + subName);
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        ShowScholarshipBean showScholarshipBean = scholarshipService.getShowScholarshipBean(subName,managerLogBean.getSchoolId());
        model.addAttribute("showScholarshipBean",showScholarshipBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<ScholarshipFormBean> scholarshipFormBeanList = scholarshipService.getScholarshipFormBeanList(subName,yearScope,showScholarshipBean.getGrade().get(0));
        model.addAttribute("scholarshipFormBeanList",scholarshipFormBeanList);
        return "manager/showScholarship";
    }

    /**
     * 根据subName、grade、yearScope获取scholarshipFormBeanList
     * @param subName
     * @param grade
     * @return
     */
    @GetMapping("/{subName}/{grade}")
    @ResponseBody
    public String showScholarshipByGrade(@PathVariable("subName")String subName,@PathVariable("grade")String grade){
        logger.debug("subName:" + subName + " grade:" + grade);
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(scholarshipService.getScholarshipFormBeanList(subName,yearScope,grade));
    }

    /**
     * 根据subName从数据库表scholarship中查询对应的奖学金名称scholarshipName(查询结果为模板名称model_name分割'模板'前面的字)
     * 根据subName和zipInfoBeanList获取需要打包的所有奖学金文件路径zipInputUrlList
     * 根据scholarshipName获取打包后生成的zip文件路径
     * @param subName 奖学金名称缩写
     * @param yearScope 年份
     * @param request 从中获取zipInfoBeanList，包含学号account、姓名username、奖学金名称scholarshipName
     * @throws IOException
     */
    @PostMapping("/zip/{subName}/{yearScope}")
    public ResponseEntity<byte[]> generateScholarshipZip(@PathVariable("subName") String subName, @PathVariable("yearScope")Integer yearScope, HttpServletRequest request) throws IOException {
        String jsonStr=request.getParameter("zipInfoBeanList");
        List<ZipInfoBean> zipInfoBeanList = new ArrayList<>(JSONArray.parseArray(jsonStr, ZipInfoBean.class));
        if(zipInfoBeanList.size() == 1){
            UserBasic userBasic = userBasicService.selectByAccount(zipInfoBeanList.get(0).getAccount());
            BasicScholarshipBean bean = basicScholarshipService.getBean(subName,userBasic.getUserId(),yearScope);
            return basicScholarshipService.generateWord(subName,bean);
        }
        else{
            List<String> zipInputUrlList = UrlUtil.getInstance().getZipInputUrlList(zipInfoBeanList);
            String scholarshipName = scholarshipService.getScholarshipName(subName);
            String zipOutputUrl = UrlUtil.getInstance().getZipOutputUrl(scholarshipName);
            List<String> modelNameList = scholarshipService.getModelNameList(subName,scholarshipName,zipInfoBeanList,yearScope);
            List<Map<String,String>> textMapList = scholarshipService.getTextMapList(subName,zipInfoBeanList,yearScope);
            return ZipUtil.getInstance().zip(modelNameList,textMapList,zipInputUrlList,zipOutputUrl);
        }
    }

    /**
     * 默认只能删除当前正在进行的综测所属的奖学金
     * 根据subName对应的数据库表ng、nis、pgs、ss、tas中删除userAccountBeanList中account对应的奖学金记录
     * @param subName 奖学金名称缩写
     * @param userAccountBeanList 包含用户学号account
     * @return
     */
    @PostMapping("/delete/{subName}")
    @ResponseBody
    public String deleteScholarship(@PathVariable("subName") String subName,@RequestBody List<UserAccountBean> userAccountBeanList){
        logger.debug("subName:" + subName + " userAccountBeanList:" + userAccountBeanList);
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(scholarshipService.deleteAll(subName,userAccountBeanList,yearScope)!=0?new StatusBean("删除成功"):new StatusBean("删除失败"));
    }


    /**
     * 从session中获取对应的managerId
     * 默认只能查询当前综测的意见
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/opinion")
    public String pageScholarshipOpinion(HttpSession session, Model model){
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<String> gradeList = majorService.getLastThree(managerLogBean.getSchoolId());
        ScholarshipOpinionBean scholarshipOpinionBean = opinionService.getBean(managerLogBean.getSchoolId(),gradeList.get(0),yearScope);
        model.addAttribute("gradeList",gradeList);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinionBean);
        return "manager/writeOpinion";
    }

    /**
     * 根据grade返回对应年级的奖学金意见
     * @param grade
     * @param session
     * @return
     */
    @GetMapping("/opinion/{grade}")
    @ResponseBody
    public String showScholarshipOpinionByGrade(@PathVariable("grade") String grade,HttpSession session){
        logger.debug("grade:" + grade);
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(opinionService.getBean(managerLogBean.getSchoolId(),grade,yearScope));
    }


    /**
     * 从session中获取managerId
     * 默认只能修改本次综测的奖学金意见
     * @param session
     * @param scholarshipOpinionBean
     * @return
     */
    @PostMapping("/opinion")
    @ResponseBody
    public String updateScholarshipOpinion(HttpSession session, @RequestBody ScholarshipOpinionBean scholarshipOpinionBean){
        logger.debug(scholarshipOpinionBean);
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(opinionService.update(managerLogBean.getSchoolId(),yearScope,scholarshipOpinionBean));
    }


    /**
     * 从session中获取schoolId
     * 默认只能修改本学院用户的国家助学金意见
     * 默认只能修改当前综测的国家助学金意见
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/opinion/ng")
    public String pageNgOpinion(HttpSession session,Model model){
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<String> gradeList = majorService.getLastThree(managerLogBean.getSchoolId());
        List<NgOpinionFormBean> ngOpinionFormBeanList = opinionService.getNgOpinionFormBeanList(managerLogBean.getSchoolId(),gradeList.get(0),yearScope);
        model.addAttribute("gradeList",gradeList);
        model.addAttribute("ngOpinionFormBeanList",ngOpinionFormBeanList);
        return "manager/writeNgOpinion";
    }

    @GetMapping("/opinion/ng/{grade}")
    @ResponseBody
    public String showNgOpinionByGrade(@PathVariable("grade") String grade,HttpSession session){
        logger.debug("grade:" + grade);
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(opinionService.getNgOpinionFormBeanList(managerLogBean.getSchoolId(),grade,yearScope));
    }

    /**
     * 通过ngOpinionUpdateBean里的opinion和userAccountList更新对应用户的国家助学金意见
     * @param ngOpinionUpdateBean
     * @return
     */
    @PostMapping("/opinion/ng")
    @ResponseBody
    public String updateNgOpinion(@RequestBody NgOpinionUpdateBean ngOpinionUpdateBean){
        logger.debug(ngOpinionUpdateBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(opinionService.updateNgOpinion(ngOpinionUpdateBean,yearScope));
    }
}
