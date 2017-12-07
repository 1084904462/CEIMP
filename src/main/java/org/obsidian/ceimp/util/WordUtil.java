package org.obsidian.ceimp.util;

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
    private static final WordUtil instance = new WordUtil();

    private WordUtil(){}

    public static WordUtil getInstance(){
        return instance;
    }

    public void generateAllWord(List<String> modelNameList,List<String> zipInputUrlList, List<Map<String,String>> textMapList){
        for(int i=0;i<modelNameList.size();i++){
            this.generateWord(modelNameList.get(i),zipInputUrlList.get(i),textMapList.get(i));
        }
    }
    /**
     *  用一个docx文档作为模板，然后替换其中的内容，再写入目标文档中
     * @param inputUrl 输入URL
     * @param outputUrl 输出URL
     * @param textMap 需要替换的内容
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
                    if(matcher.group(1).equals("applyReason") || matcher.group(1).equals("opinion") ||
                            matcher.group(1).equals("reason") || matcher.group(1).equals("recommendReason")){
                        String[] strings = textMap.get(matcher.group(1)).split("\\s+");
                        run.setText(strings[0],0);
                        if(strings.length > 1){
                            for(int j=1;j<strings.length;j++){
                                run.addBreak();
                                run.setText("    " + strings[j],j);
                            }
                        }
                    }
                    else{
                        run.setText(matcher.replaceFirst(String.valueOf(textMap.get(matcher.group(1)))),0);
                    }
//                    while((matcher = this.matcher(runText)).find()){
//                        runText = matcher.replaceFirst(String.valueOf(textMap.get(matcher.group(1))));
//                    }
//                    run.setText(runText,0);
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

