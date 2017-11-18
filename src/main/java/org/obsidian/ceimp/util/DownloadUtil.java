package org.obsidian.ceimp.util;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * Created by BillChen on 2017/10/11.
 */
public class DownloadUtil {

    private Logger logger = Logger.getLogger(this.getClass());

    private static final DownloadUtil instance = new DownloadUtil();

    private DownloadUtil(){}

    public static DownloadUtil getInstance(){
        return instance;
    }

    /**
     * 下载文件，包括单张奖学金word以及奖学金解压包
     * @param url 文件路径
     * @param response
     * @param fileName 文件名
     * @throws IOException
     */
    public void download(String url,HttpServletResponse response,String fileName) throws IOException{
        logger.info("下载文件:" + url + "/" + fileName);
        // 读到流中
        InputStream inStream = new FileInputStream(url);// 文件的存放路径
        // 设置输出的格式
        response.reset();
        response.setContentType("bin");
        response.setHeader("Content-Disposition", "attachment;filename="
                .concat(String.valueOf(URLEncoder.encode(fileName, "UTF-8"))));
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
