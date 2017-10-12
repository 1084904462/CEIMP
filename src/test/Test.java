import org.junit.runner.RunWith;
import org.obsidian.ceimp.Application;
import org.obsidian.ceimp.util.WordUtil;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by BillChen on 2017/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @org.junit.Test
    public void test(){
        String inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\模板.docx";
        String outputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\伟哥奖学金.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("a","2016");
        textMap.put("b","2017");
        textMap.put("c","信息与电子工程学院");
        textMap.put("d","软件工程666");
        textMap.put("e","伟哥");
        textMap.put("f","1150233233");
        textMap.put("g","男");
        textMap.put("h","汉族");
        textMap.put("z","共青团员");
        textMap.put("j","无职务");
        textMap.put("k","15");
        textMap.put("l","70");
        textMap.put("m","15");
        textMap.put("n","100");
        textMap.put("o","1");
        textMap.put("p","省政府奖学金");
        textMap.put("q","本人贼6,我说的是大实话，不信你去问伟哥阿姆斯特朗回旋加速器，他会告诉你真正的事实");
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
    }

    @org.junit.Test
    public void test1(){
        String inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\三好学生模板.docx";
        String outputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\伟哥三好学生.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("a","2016");
        textMap.put("b","2017");
        textMap.put("school","信息与电子工程学院");
        textMap.put("d","软件工程666");
        textMap.put("e","伟哥");
        textMap.put("f","1150233233");
        textMap.put("g","男");
        textMap.put("h","汉族");
        textMap.put("z","共青团员");
        textMap.put("j","无职务");
        textMap.put("k","15");
        textMap.put("l","70");
        textMap.put("m","15");
        textMap.put("n","100");
        textMap.put("o","1");
        textMap.put("p","省政府奖学金");
        textMap.put("q","本人贼6,我说的是大实话，不信你去问伟哥阿姆斯特朗回旋加速器，他会告诉你真正的事实");
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
    }
}