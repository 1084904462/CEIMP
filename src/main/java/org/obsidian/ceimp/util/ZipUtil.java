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

    public void zip(String inputUrl,String outputUrl,String awardName,List<String> fileNameList) throws IOException{
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try{
            File zipFile = new File(outputUrl + "\\" + awardName + ".zip");
            File[] sourceFiles = new File[fileNameList.size()];
            for(int i=0;i<fileNameList.size();i++){
                sourceFiles[i] = new File(inputUrl + "\\" + fileNameList.get(i) + ".docx");
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

//    public void zip(String url,String zipFilePath, String fileName) throws IOException {
//        File sourceFile = new File(url);
//        FileInputStream fis = null;
//        BufferedInputStream bis = null;
//        FileOutputStream fos = null;
//        ZipOutputStream zos = null;
//        try {
//            File zipFile = new File(zipFilePath + "/" + fileName +".zip");
//            if(zipFile.exists()){
//                System.out.println(zipFilePath + "目录下存在名字为:" + fileName +".zip" +"打包文件.");
//            }else{
//                File[] sourceFiles = sourceFile.listFiles();
//                if(null == sourceFiles || sourceFiles.length<1){
//                    System.out.println("待压缩的文件目录：" + url + "里面不存在文件，无需压缩.");
//                }else{
//                    fos = new FileOutputStream(zipFile);
//                    zos = new ZipOutputStream(new BufferedOutputStream(fos));
//                    byte[] bufs = new byte[1024*10];
//                    for(int i=0;i<sourceFiles.length;i++){
//                        //创建ZIP实体，并添加进压缩包
//                        ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getName());
//                        zos.putNextEntry(zipEntry);
//                        //读取待压缩的文件并写进压缩包里
//                        fis = new FileInputStream(sourceFiles[i]);
//                        bis = new BufferedInputStream(fis, 1024*10);
//                        int read = 0;
//                        while((read=bis.read(bufs, 0, 1024*10)) != -1){
//                            zos.write(bufs,0,read);
//                        }
//                    }
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        } finally{
//            //关闭流
//            try {
//                if(null != bis) bis.close();
//                if(null != zos) zos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
