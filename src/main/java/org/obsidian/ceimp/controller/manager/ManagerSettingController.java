package org.obsidian.ceimp.controller.manager;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;


/**
 * Created by Administrator on 2017/11/20.
 */
@Controller
@RequestMapping("/manager/settings")
public class ManagerSettingController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private AwardService awardService;

    @Autowired
    private MajorService majorService;

    /**
     * 进入重置密码页面
     * @return 重置密码页面
     */
    @GetMapping("/resetPassword")
    public String pageResetPassword(HttpSession session, Model model){
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        List<String> gradeList = majorService.getLastThree(managerLogBean.getSchoolId());
        int yearScope = TimeUtil.getInstance().getThisYear();
        String grade = gradeList.isEmpty()? "":gradeList.get(0);
        List<UserSearchBean> userSearchBeanList = userBasicService.getUserSearchBeanList(managerLogBean.getSchoolId(),grade,yearScope);
        model.addAttribute("gradeList",gradeList);
        model.addAttribute("userSearchBeanList",userSearchBeanList);
        return "manager/resetPassword";
    }

    @GetMapping("/resetPassword/{grade}")
    @ResponseBody
    public String showResetPasswordByGrade(@PathVariable("grade") String grade,HttpSession session){
        logger.debug("grade:" + grade);
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(userBasicService.getUserSearchBeanList(managerLogBean.getSchoolId(),grade,yearScope));
    }

    /**
     * 管理员重置用户密码为888888
     * @param userAccountListBean
     * @return 重置密码成功
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/resetPassword")
    @ResponseBody
    public String resetPassword(@RequestBody UserAccountListBean userAccountListBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String password = MD5Util.getInstance().EncoderByMd5("888888");
        return JSON.toJSONString(managerService.resetPassword(userAccountListBean,password));
    }

    /**
     * 删除用户
     * @param userAccountListBean
     * @return
     */
    @PostMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(@RequestBody UserAccountListBean userAccountListBean){
        return JSON.toJSONString(userBasicService.deleteUser(userAccountListBean));
    }

    /**
     * 管理员修改自己的密码
     * @param passwordBean 新密码，确认密码
     * @param session 从session中的managerLogBean获取managerId
     * @return 修改结果
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/changePassword")
    @ResponseBody
    public String changePassword(PasswordBean passwordBean, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        return JSON.toJSONString(managerService.changePassword(managerLogBean.getManagerId(),passwordBean));
    }

    /**
     * 进入新增学院页面
     * @return
     */
    @GetMapping("/insertSchool")
    public String pageInsertSchool(HttpSession session){
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(managerLogBean.getManagerType() != 1){
            return "redirect:/manager/index";
        }
        return "manager/insertSchool";
    }

    /**
     * 新增学院
     * @param schoolName
     * @return
     */
    @PostMapping("/insertSchool")
    @ResponseBody
    public String insertSchool(@RequestBody String schoolName){
        return JSON.toJSONString(schoolService.insert(schoolName));
    }


    /**
     * 进入新增管理员页面
     * @param model
     * @return
     */
    @GetMapping("/insertManager")
    public String pageInsertManager(HttpSession session,Model model){
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(managerLogBean.getManagerType() != 1){
            return "redirect:/manager/index";
        }
        List<School> schoolList = schoolService.getAll();
        model.addAttribute("schoolList",schoolList);
        return "manager/insertManager";
    }

    /**
     * 新增管理员
     * @return
     */
    @PostMapping("/insertManager")
    @ResponseBody
    public String insertManager(@RequestBody InsertManagerBean insertManagerBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return JSON.toJSONString(managerService.insert(insertManagerBean));
    }

    /**
     * 进入上传Excel页面
     * @return
     */
    @GetMapping("/upload")
    public String pageUpload(){
        return "manager/upload";
    }

    /**
     * 上传用户名单
     * 有点复杂
     * 检查是否有对应专业与年级，没有->插入该专业与年级，有->下一步
     * 检查是否有对应班级号，没有->插入该班级号，有->下一步
     * 检查是否有对应用户，没有->插入该用户，有下一步
     * 插入该用户当前综测的相关信息
     * @return
     */
    @PostMapping("/upload/user")
    @ResponseBody
    public String uploadUser(HttpSession session,@RequestParam("userExcel") MultipartFile file) throws Exception {
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        List<ExcelUserBean> list = ExcelUtil.getInstance().readUser(file);
        return JSON.toJSONString(userBasicService.insert(managerLogBean.getSchoolId(),list));
    }

    /**
     * 上传奖学金名单
     * @return
     */
    @PostMapping("/upload/scholarship")
    @ResponseBody
    public String uploadScholarship(HttpSession session,@RequestParam("scholarshipExcel") MultipartFile file) throws Exception{
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        List<ExcelScholarshipBean> list = ExcelUtil.getInstance().readScholarship(file);
        return JSON.toJSONString(awardService.insert(managerLogBean.getSchoolId(),list));
    }

    /**
     * 下载用户名单示例
     * @return
     * @throws IOException
     */
    @PostMapping("/download/userExcel")
    public ResponseEntity<byte[]> downloadUserExcel() throws IOException {
        String inputUrl = UrlUtil.getInstance().getExcelInputUrl("用户");
        return DownloadUtil.getInstance().download(inputUrl);
    }

    /**
     * 下载奖学金名单示例
     * @return
     * @throws IOException
     */
    @PostMapping("/download/scholarshipExcel")
    public ResponseEntity<byte[]> downloadScholarshipExcel() throws IOException {
        String inputUrl = UrlUtil.getInstance().getExcelInputUrl("奖学金");
        return DownloadUtil.getInstance().download(inputUrl);
    }
}
