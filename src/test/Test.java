import org.junit.runner.RunWith;
import org.obsidian.ceimp.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

<<<<<<< HEAD
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

=======
>>>>>>> 9f8828d10b68c88672596658108f4d0d0fc9e677
/**
 * Created by BillChen on 2017/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @org.junit.Test
    public void test(){

    }

    @org.junit.Test
    public void t6() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        managerService.insertManager("123","123");
    }
}