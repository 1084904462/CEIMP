package org.obsidian.ceimp.controller.manager;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.SchoolService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.DownloadUtil;
import org.obsidian.ceimp.util.ExcelUtil;
import org.obsidian.ceimp.util.TimeUtil;
import org.obsidian.ceimp.util.UrlUtil;
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

    /**
     * 进入重置密码页面
     * @return 重置密码页面
     */
    @GetMapping("/resetPassword")
    public String pageResetPassword(){
        return "manager/resetPassword";
    }

    /**
     * 管理员重置用户密码为888888
     * @param userAccountBean
     * @return 重置密码成功
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/resetPassword")
    @ResponseBody
    public String resetPassword(@RequestBody UserAccountBean userAccountBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.debug(userAccountBean);
        String password = "888888";
        return JSON.toJSONString(managerService.resetPassword(userAccountBean,password));
    }

    /**
     * 默认只能搜索本学院用户
     * 先去除searchKey中的空格及转义字符
     * 再截取中文、数字，并在两头添加'%'
     * @param searchBean
     * @param session 从session中的managerLogBean获取schoolId
     * @return
     */
    @PostMapping("/search")
    @ResponseBody
    public String searchUser(@RequestBody SearchBean searchBean,HttpSession session){
        logger.debug("searchKey:" + searchBean.getSearchKey());
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(userBasicService.searchUser(searchBean,managerLogBean.getSchoolId(),yearScope));
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
     * 进入新增管理员页面
     * @param model
     * @return
     */
    @GetMapping("/insertManager")
    public String pageInsertManager(Model model){
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
    public String insertManager(@RequestBody InsertManagerBean insertManagerBean){
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
     * 检查是否有对应学院，没有->插入该学院，有->下一步
     * 检查是否有对应专业与年级，没有->插入该专业与年级，有->下一步
     * 检查是否有对应班级号，没有->插入该班级号，有->下一步
     * 检查是否有对应用户，没有->插入该用户，有下一步
     * 插入该用户当前综测的相关信息
     * @return
     */
    @PostMapping("/upload/user")
    @ResponseBody
    public String uploadUser(@RequestParam("userExcel") MultipartFile file) throws Exception {
        List<ExcelUserBean> list = ExcelUtil.getInstance().readUser(file);
        return JSON.toJSONString(userBasicService.insert(list));
    }

    /**
     * 上传奖学金名单
     * @return
     */
    @PostMapping("/upload/scholarship")
    @ResponseBody
    public String uploadScholarship(@RequestParam("scholarshipExcel") MultipartFile file) throws Exception{
        List<ExcelScholarshipBean> list = ExcelUtil.getInstance().readScholarship(file);
        return JSON.toJSONString(awardService.insert(list));
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
