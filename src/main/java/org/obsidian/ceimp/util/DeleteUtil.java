package org.obsidian.ceimp.util;

import java.io.File;
import java.util.List;

/**
 * Created by BillChen on 2017/10/15.
 */
public class DeleteUtil {
    private static final DeleteUtil instance = new DeleteUtil();

    private DeleteUtil(){}

    public static DeleteUtil getInstance(){
        return instance;
    }

    /**
     * 删除文件，包括单张奖学金word以及奖学金解压包
     * @param inputUrl 文件路径
     */
    public void delete(String inputUrl){
        File file = new File(inputUrl);
        if(file.exists() && file.isFile()){
            file.delete();
        }
    }

    public void deleteAll(List<String> inputUrlList){
        for(int i=0;i<inputUrlList.size();i++){
            this.delete(inputUrlList.get(i));
        }
    }
}
