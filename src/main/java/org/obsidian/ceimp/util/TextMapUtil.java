package org.obsidian.ceimp.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/19.
 */
public class TextMapUtil {
    private static final TextMapUtil instance = new TextMapUtil();

    private TextMapUtil(){}

    public static TextMapUtil getInstance(){
        return instance;
    }

    public Map<String,String> getNgMap(){
        Map<String,String> textMap = new HashMap<>();

        return textMap;
    }

    public Map<String,String> getNisMap(){
        Map<String,String> textMap = new HashMap<>();

        return textMap;
    }

    public Map<String,String> getPgsMap(){
        Map<String,String> textMap = new HashMap<>();

        return textMap;
    }

    public Map<String,String> getSsMap(){
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts","2016");
        textMap.put("te","2017");
        textMap.put("school","信息与电子工程学院");
        textMap.put("classId","软件工程151");
        textMap.put("username","陈伟");
        textMap.put("userId","1150299070");
        textMap.put("sex","男");
        textMap.put("nation","汉族");
        textMap.put("political","共青团员");
        textMap.put("job","无");
        textMap.put("charact","13.2");
        textMap.put("study","72.3");
        textMap.put("ability","3.5");
        textMap.put("all","79");
        textMap.put("rank","10/74");
        textMap.put("level","优秀学生一等奖学金");
        textMap.put("reason","理由BALABALA");
        textMap.put("opinion","意见BALABALA");
        return textMap;
    }

    public Map<String,String> getTasMap(){
        Map<String,String> textMap = new HashMap<>();

        return textMap;
    }
}
