package org.obsidian.ceimp.util;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by BillChen on 2017/10/12.
 */
public class ZipUtil {
    private static final ZipUtil instance = new ZipUtil();

    private ZipUtil(){}

    public static ZipUtil getInstance(){
        return instance;
    }

    public void zip(List<String> zipInputUrlList, String zipOutputUrl, HttpServletResponse response,String scholarshipName) throws IOException{
        this.zipAllWord(zipInputUrlList,zipOutputUrl);
        String fileName = UrlUtil.getInstance().getZipFileName(scholarshipName);
        DownloadUtil.getInstance().download(zipOutputUrl,response,fileName);
        DeleteUtil.getInstance().delete(zipOutputUrl);
    }

    private void zipAllWord(List<String> zipInputUrlList,String zipOutputUrl) throws IOException{
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try{
            File zipFile = new File(zipOutputUrl);
            File[] sourceFiles = new File[zipInputUrlList.size()];
            for(int i=0;i<zipInputUrlList.size();i++){
                sourceFiles[i] = new File(zipInputUrlList.get(i));
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
