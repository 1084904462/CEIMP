package org.obsidian.ceimp.util;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by BillChen on 2017/10/12.
 */
public class ZipUtil {
    private Logger logger = Logger.getLogger(this.getClass());

    private static final ZipUtil instance = new ZipUtil();

    private ZipUtil(){}

    public static ZipUtil getInstance(){
        return instance;
    }

    /**
     * 将奖学金打包
     * @param inputUrl 输入路径
     * @param outputUrl 输出路径
     * @param awardName 包名
     * @param fileNameList 打包的奖学金名列表
     * @throws IOException
     */
    public void zip(String inputUrl,String outputUrl,String awardName,List<String> fileNameList) throws IOException{
        logger.info("打包文件:" + inputUrl);
        logger.info("生成解压包:" + outputUrl);
        logger.info("包名:" + awardName);
        logger.info("打包文件名:" + fileNameList);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try{
            //Windows
//            File zipFile = new File(outputUrl + "\\" + awardName + ".zip");
//            File[] sourceFiles = new File[fileNameList.size()];
//            for(int i=0;i<fileNameList.size();i++){
//                sourceFiles[i] = new File(inputUrl + "\\" + fileNameList.get(i) + ".docx");
//            }

            //Linux
            File zipFile = new File(outputUrl + "/" + awardName + ".zip");
            File[] sourceFiles = new File[fileNameList.size()];
            for(int i=0;i<fileNameList.size();i++){
                sourceFiles[i] = new File(inputUrl + "/" + fileNameList.get(i) + ".docx");
            }

            fos = new FileOutputStream(zipFile);
            zos = new ZipOutputStream(new BufferedOutputStream(fos));
            byte[] bufs = new byte[1024*10];
            for(int i=0;i<sourceFiles.length;i++){
                //创建ZIP实体，并添加进压缩包
                ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getName());
                zos.putNextEntry(zipEntry);
                //读取待压缩的文件并写进压缩包里
                fis = new FileInputStream(sourceFiles[i]);
                bis = new BufferedInputStream(fis, 1024*10);
                int read = 0;
                while((read=bis.read(bufs, 0, 1024*10)) != -1){
                    zos.write(bufs,0,read);
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            try {
                if(null != bis) bis.close();
                if(null != zos) zos.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
