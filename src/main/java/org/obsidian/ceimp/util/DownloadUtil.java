package org.obsidian.ceimp.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * Created by BillChen on 2017/10/11.
 */
public class DownloadUtil {
    private static final DownloadUtil instance = new DownloadUtil();

    private DownloadUtil(){}

    public static DownloadUtil getInstance(){
        return instance;
    }

    /**
     * 下载文件
     * @return
     * @throws IOException
     */
    public ResponseEntity<byte[]> download(String url) throws IOException{
        File file = new File(url);
        InputStream is = new FileInputStream(file);
        byte[] body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + String.valueOf(URLEncoder.encode(file.getName(),"UTF-8")));
        HttpStatus statusCode = HttpStatus.OK;
        is.close();
        if(file.exists()){
            file.delete();
        }
        return new ResponseEntity<byte[]>(body, headers, statusCode);
    }
}
