package org.obsidian.ceimp.util;

import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * textMap用于存放替换数据
 * textList用于存放插入表格数据
 * Created by BillChen on 2017/8/23.
 */
public class WordUtil {
    private Logger logger = Logger.getLogger(this.getClass());

    private static final WordUtil instance = new WordUtil();

    private WordUtil(){}

    public static WordUtil getInstance(){
        return instance;
    }

    /**
     *  用一个docx文档作为模板，然后替换其中的内容，再写入目标文档中
     * @param inputUrl 输入URL
     * @param outputUrl 输出URL
     * @param textMap 参数
     */
    public void generateWord(String inputUrl, String outputUrl, Map<String,String> textMap){
        try {
            InputStream is = new FileInputStream(inputUrl);
            XWPFDocument document = new XWPFDocument(is);
            //替换段落里面的变量
            this.replaceInPara(document,textMap);
            //替换表格里面的变量
            this.replaceInTable(document,textMap);
            OutputStream os = new FileOutputStream(outputUrl);
            document.write(os);
            is.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 替换段落里的变量
     * @param document 要替换的文档
     * @param textMap 参数
     */
    private void replaceInPara(XWPFDocument document, Map<String, String> textMap){
        Iterator<XWPFParagraph> iterator = document.getParagraphsIterator();
        XWPFParagraph para;
        while(iterator.hasNext()){
            para = iterator.next();
            this.replaceInPara(para,textMap);
        }
    }

    /**
     * 替换段落里面的变量
     * @param para 要替换的段落
     * @param textMap 参数
     */
    private void replaceInPara(XWPFParagraph para, Map<String, String> textMap){
        List<XWPFRun> runs;
        Matcher matcher;
        if(this.matcher(para.getParagraphText()).find()){
            runs = para.getRuns();
            for(int i=0;i<runs.size();i++){
                XWPFRun run = runs.get(i);
                String runText = run.toString();
                matcher = this.matcher(runText);
                if(matcher.find()){
                    while((matcher = this.matcher(runText)).find()){
                        runText = matcher.replaceFirst(String.valueOf(textMap.get(matcher.group(1))));
                    }
                    logger.info("pre: " + run.getText(0));
                    run.setText(runText,0);
                    logger.info("aft: " + run.getText(0));
                }
            }
        }
    }

    /**
     * 替换表格里面的变量
     * @param document 要替换的文档
     * @param textMap 参数
     */
    private void replaceInTable(XWPFDocument document, Map<String, String> textMap){
        Iterator<XWPFTable> iterator = document.getTablesIterator();
        XWPFTable table;
        List<XWPFTableRow> rows;
        List<XWPFTableCell> cells;
        List<XWPFParagraph> paras;
        while (iterator.hasNext()) {
            table = iterator.next();
            rows = table.getRows();
            for (XWPFTableRow row : rows) {
                cells = row.getTableCells();
                for (XWPFTableCell cell : cells) {
                    paras = cell.getParagraphs();
                    for (XWPFParagraph para : paras) {
                        this.replaceInPara(para, textMap);
                    }
                }
            }
        }
    }

    /**
     * 正则匹配字符串
     * @param str 匹配字符串
     * @return
     */
    private Matcher matcher(String str) {
        Pattern pattern = Pattern.compile("\\$\\{(.+?)\\}", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(str);
    }
}

