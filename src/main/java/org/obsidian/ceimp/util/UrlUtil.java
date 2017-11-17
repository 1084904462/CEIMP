package org.obsidian.ceimp.util;

import org.apache.log4j.Logger;

/**
 * Created by BillChen on 2017/11/16.
 */
public class UrlUtil {
    private Logger logger = Logger.getLogger(this.getClass());

    private String MODEL_INPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "model/";
    private String WORD_OUTPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "award/";
    private String ZIP_INPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "award/";
    private String ZIP_OUTPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "zip/";

    private static String OS_NAME = System.getProperty("os.name");
    private static String DIVISE;

    private static final UrlUtil instance = new UrlUtil();

    private UrlUtil(){}

    public static UrlUtil getInstance(){
        return instance;
    }

    static{
        if(OS_NAME.matches("Windows.*")){
            DIVISE = "\\\\";
        }
        else{
            DIVISE = "/";
        }
    }

    public String getModelUrl(){
        System.out.println(this.MODEL_INPUT_URL);
        System.out.println(this.WORD_OUTPUT_URL);
        System.out.println(this.ZIP_INPUT_URL);
        System.out.println(this.ZIP_OUTPUT_URL);
        return "";
    }

    public String getWordUrl(){

        return "";
    }

    public String getZipInputUrl(){

        return "";
    }

    public String getZipOutputUrl(){

        return "";
    }
}
