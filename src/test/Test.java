import org.junit.runner.RunWith;
import org.obsidian.ceimp.Application;
import org.obsidian.ceimp.bean.InsertClassNumBean;
import org.obsidian.ceimp.bean.InsertMajorBean;
import org.obsidian.ceimp.bean.InsertUserBasicBean;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2017/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private ClassNumService classNumService;

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private UserInfoService userInfoService;

    @org.junit.Test
    public void test() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        List<String> schoolList = new ArrayList<>();
        schoolList.add("信息与电子工程学院");
        schoolList.add("理学院");
        schoolList.add("中德工程师学院");
        List<School> schools = schoolService.getAll();
        for(School school:schools){
            if(schoolList.contains(school.getName())){
                schoolList.remove(school.getName());
            }
        }
        if(!schoolList.isEmpty()){
            schoolService.insertSchoolList(schoolList);
        }

        List<InsertMajorBean> insertMajorBeanList = new ArrayList<>();
        insertMajorBeanList.add(new InsertMajorBean("信息与电子工程学院","软件工程","2015"));
        insertMajorBeanList.add(new InsertMajorBean("中德工程师学院","瓜皮工程","2015"));
        insertMajorBeanList.add(new InsertMajorBean("中德工程师学院","瓜皮工程","2016"));
        insertMajorBeanList.add(new InsertMajorBean("信息与电子工程学院","软件工程","2016"));
        List<InsertMajorBean> insertMajorBeans = majorService.getInsertMajorBeanList();
        for(InsertMajorBean bean:insertMajorBeans){
            if(insertMajorBeanList.contains(bean)){
                insertMajorBeanList.remove(bean);
            }
        }
        if(!insertMajorBeanList.isEmpty()){
            majorService.insertMajorList(insertMajorBeanList);
        }

        List<InsertClassNumBean> insertClassNumBeanList = new ArrayList<>();
        insertClassNumBeanList.add(new InsertClassNumBean("中德工程师学院","瓜皮工程","2015","151"));
        insertClassNumBeanList.add(new InsertClassNumBean("信息与电子工程学院","软件工程","2015","151"));
        List<InsertClassNumBean> insertClassNumBeans = classNumService.getInsertClassNumBeanList();
        for(InsertClassNumBean bean:insertClassNumBeans){
            if(insertClassNumBeanList.contains(bean)){
                insertClassNumBeanList.remove(bean);
            }
        }
        if(!insertClassNumBeanList.isEmpty()){
            classNumService.insertClassNumList(insertClassNumBeanList);
        }

        List<InsertUserBasicBean> insertUserBasicBeanList = new ArrayList<>();
        insertUserBasicBeanList.add(new InsertUserBasicBean("1170299223", MD5Util.getInstance().EncoderByMd5("888666"),"伟哥","女","2017年09月"));
        insertUserBasicBeanList.add(new InsertUserBasicBean("1170299233", MD5Util.getInstance().EncoderByMd5("888666"),"伟哥","男","2017年09月"));
        List<InsertUserBasicBean> insertUserBasicBeans = userBasicService.getInsertUserBasicBeanList();
        for(InsertUserBasicBean bean:insertUserBasicBeans){
            if(insertUserBasicBeanList.contains(bean)){
                insertUserBasicBeanList.remove(bean);
            }
        }
        if(!insertUserBasicBeanList.isEmpty()){
            userBasicService.insertUserBasicBeanList(insertUserBasicBeanList);
        }
    }
}