import org.junit.runner.RunWith;
import org.obsidian.ceimp.Application;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.ExcelUtil;
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
    private ClassNumService classNumService;

    @org.junit.Test
    public void test(){
        List<InsertClassNumBean> list = new ArrayList<>();
        list.add(new InsertClassNumBean(1L,"通信工程","2015","151"));
        list.add(new InsertClassNumBean(1L,"物联网工程","2016","161"));
        classNumService.insertClassNumList(list);
    }
}