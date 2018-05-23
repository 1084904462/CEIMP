import org.junit.runner.RunWith;
import org.obsidian.ceimp.Application;
import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.dao.*;
import org.obsidian.ceimp.service.BasicScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by BillChen on 2017/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @Autowired
    private BasicScholarshipService service;

    @Autowired
    private UserBasicMapper userBasicMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private NgMapper ngMapper;

    @Autowired
    private NisMapper nisMapper;

    @Autowired
    private PgsMapper pgsMapper;

    @Autowired
    private SsMapper ssMapper;

    @Autowired
    private TasMapper tasMapper;

    @org.junit.Test
    public void test(){
        BasicScholarshipBean bean = service.getBean("tas",1L,2018);
        System.out.println(bean);
    }
}