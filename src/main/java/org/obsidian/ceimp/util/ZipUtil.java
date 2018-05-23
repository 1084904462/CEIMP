package org.obsidian.ceimp.util;

import org.springframework.http.ResponseEntity;

import java.io.*;
import java.util.List;
import java.util.Map;
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

    public ResponseEntity<byte[]> zip(List<String> modelNameList, List<Map<String,String>> textMapList, List<String> zipInputUrlList, String zipOutputUrl) throws IOException{
        WordUtil.getInstance().generateAllWord(modelNameList,zipInputUrlList,textMapList);
        this.zipAllWord(zipInputUrlList,zipOutputUrl);
        return DownloadUtil.getInstance().download(zipOutputUrl);
    }

    private void zipAllWord(List<String> zipInputUrlList,String zipOutputUrl) throws IOException{
        try{
            File zipFile = new File(zipOutputUrl);
            File[] sourceFiles = new File[zipInputUrlList.size()];
            for(int i=0;i<zipInputUrlList.size();i++){
                sourceFiles[i] = new File(zipInputUrlList.get(i));
            }
            ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)));
            byte[] bufs = new byte[1024*10];
            for (File sourceFile : sourceFiles) {
                //创建ZIP实体，并添加进压缩包
                ZipEntry zipEntry = new ZipEntry(sourceFile.getName());
                zos.putNextEntry(zipEntry);
                //读取待压缩的文件并写进压缩包里
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 1024 * 10);
                int read = 0;
                while ((read = bis.read(bufs, 0, 1024 * 10)) != -1) {
                    zos.write(bufs, 0, read);
                }
                bis.close();
            }
            zos.closeEntry();
            zos.close();
            for (File sourceFile : sourceFiles) {
                sourceFile.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
