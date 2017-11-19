package org.obsidian.ceimp.util;

import org.obsidian.ceimp.bean.ZipInfoBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2017/11/16.
 */
public class UrlUtil {
    private String MODEL_INPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "model/";
    private String WORD_OUTPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "award/";
    private String ZIP_INPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "award/";
    private String ZIP_OUTPUT_URL = this.getClass().getClassLoader().getResource("")
            .getPath().substring(1) + "zip/";

    private static String DIVIDE = "/";
    private static String WORD_SUFFIX = ".docx";
    private static String ZIP_SUFFIX = ".zip";

    private static final UrlUtil instance = new UrlUtil();

    private UrlUtil(){}

    public static UrlUtil getInstance(){
        return instance;
    }

    public String getModelInputUrl(String modelName){
        return MODEL_INPUT_URL + modelName + WORD_SUFFIX;
    }

    public String getWordOutputUrl(String subName,ZipInfoBean zipInfoBean){
        return WORD_OUTPUT_URL + subName + DIVIDE + zipInfoBean.getAccount()
                + zipInfoBean.getUsername() + zipInfoBean.getScholarshipName() + WORD_SUFFIX;
    }

    public List<String> getZipInputUrlList(String subName,List<ZipInfoBean> zipInfoBeanList){
        List<String> zipInputUrlList = new ArrayList<>();
        for(int i=0;i<zipInfoBeanList.size();i++){
            zipInputUrlList.add(ZIP_INPUT_URL + subName + DIVIDE + zipInfoBeanList.get(i).getAccount()
                    + zipInfoBeanList.get(i).getUsername() + zipInfoBeanList.get(i).getScholarshipName() + WORD_SUFFIX);
        }
        return zipInputUrlList;
    }

    public String getZipOutputUrl(String scholarshipName){
        return ZIP_OUTPUT_URL + scholarshipName + ZIP_SUFFIX;
    }

    public String getZipFileName(String scholarshipName){
        return scholarshipName + ZIP_SUFFIX;
    }
}
