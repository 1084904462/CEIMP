import org.junit.runner.RunWith;
import org.obsidian.ceimp.Application;
import org.obsidian.ceimp.bean.ExcelUserBean;
import org.obsidian.ceimp.bean.InsertClassNumBean;
import org.obsidian.ceimp.bean.InsertMajorBean;
import org.obsidian.ceimp.bean.InsertUserBasicBean;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.MD5Util;
import org.obsidian.ceimp.util.TimeUtil;
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
    private UserBasicService userBasicService;

    @org.junit.Test
    public void test() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        List<ExcelUserBean> list = new ArrayList<>();
        String[] strings = new String[]{"信息与电子工程学院","软件工程","2017","151","1170299008","陈陈","女","2017年09月","13","66","21","100","1","1","66"};
        list.add(new ExcelUserBean(strings));
        String[] strings2 = new String[]{"信息与电子工程学院","软件工程","2017","152","1170299012","伟伟","男","2017年09月","12","65","0","77","10","23","66"};
        list.add(new ExcelUserBean(strings2));
        userBasicService.insert(list);


    }
}