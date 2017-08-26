package org.obsidian.ceimp.util;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.xwpf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    /**
     * 根据模板生成新的word文档
     * 判断有$为替换，无$为插入
     * @param inputUrl  模板存放地址
     * @param outputUrl 新文档存放地址
     * @param textMap   需要替换的信息集合
     * @param tableList 需要插入的表格信息集合
     * @return  成功返回true，失败返回false
     */
    public boolean generateWord(String inputUrl, String outputUrl, Map<String,String> textMap, List<String[]> tableList){
        //模板默认生成成功
        boolean generateFlag = true;
        try {
            //获取docx解析对象
            XWPFDocument document = new XWPFDocument(POIXMLDocument.openPackage(inputUrl));
            //解析替换文本段落
            this.changeText(document,textMap);
            //解析替换表格对象
            this.changeTable(document, textMap, tableList);
            //生成新的word
            File file = new File(outputUrl);
            FileOutputStream fos = new FileOutputStream(file);
            document.write(fos);
            fos.close();
        }
        catch (IOException e){
            generateFlag = false;
            e.printStackTrace();
        }
        return generateFlag;
    }

    /**
     * 替换段落文本
     * @param document
     * @param textMap
     */
    public void changeText(XWPFDocument document,Map<String,String> textMap){
        //获取段落集合
        List<XWPFParagraph> paragraphList = document.getParagraphs();
        for(XWPFParagraph paragraph : paragraphList){
            //判断此段落是否需要进行替换
            String text = paragraph.getText();
            if(checkText(text)){
                List<XWPFRun> runList = paragraph.getRuns();
                for(XWPFRun run : runList){
                    //替换模板原来的位置
                    run.setText(changeValue(run.toString(),textMap),0);
                }
            }
        }
    }

    public void changeTable(XWPFDocument document,Map<String,String> textMap,List<String[]> tableList){
        //获取表格对象集合
        List<XWPFTable> tables = document.getTables();
        for(int i=0;i<tables.size();i++){
            //只处理行数大于等于2的表格，且不循环表头
            XWPFTable table = tables.get(i);
            if(table.getRows().size() > 1){
                //判断表格是需要替换还是需要插入，判断逻辑有$为替换，表格无$为插入
                if(checkText(table.getText())){
                    List<XWPFTableRow> rowList = table.getRows();
                    //遍历表格,并替换模板
                    this.eachTable(rowList, textMap);
                }
                else{
                    this.insertTable(table,tableList);
                }
            }
        }
    }

    /**
     * 遍历表格
     * @param rowList
     * @param textMap
     */
    public void eachTable(List<XWPFTableRow> rowList,Map<String,String> textMap){
        for(XWPFTableRow row : rowList){
            List<XWPFTableCell> cells = row.getTableCells();
            for(XWPFTableCell cell : cells){
                //判断单元格是否需要替换
                if(checkText(cell.getText())){
                    List<XWPFParagraph> paragraphs = cell.getParagraphs();
                    for(XWPFParagraph paragraph : paragraphs){
                        List<XWPFRun> runs = paragraph.getRuns();
                        for(XWPFRun run : runs){
                            run.setText(changeValue(run.toString(), textMap), 0);
                        }
                    }
                }
            }
        }
    }

    /**
     * 为表格插入数据，行数不够添加新行
     * @param table
     * @param tableList
     */
    public void insertTable(XWPFTable table, List<String[]> tableList){
        //创建行,根据需要插入的数据添加新行，不处理表头
        for(int i = 1; i < tableList.size(); i++){
            XWPFTableRow row =table.createRow();
        }
        //遍历表格插入数据
        List<XWPFTableRow> rows = table.getRows();
        for(int i = 1; i < rows.size(); i++){
            XWPFTableRow newRow = table.getRow(i);
            List<XWPFTableCell> cells = newRow.getTableCells();
            for(int j = 0; j < cells.size(); j++){
                XWPFTableCell cell = cells.get(j);
                cell.setText(tableList.get(i-1)[j]);
            }
        }
    }

    /**
     * 判断文本中时候包含$
     * @param text
     * @return
     */
    public boolean checkText(String text){
        boolean check  =  false;
        if(text.contains("$")){
            check = true;
        }
        return check;
    }

    public String changeValue(String value, Map<String, String> textMap){
        Set<Map.Entry<String, String>> textSets = textMap.entrySet();
        for (Map.Entry<String, String> textSet : textSets) {
            //匹配模板与替换值 格式${key}
            String key = "${"+textSet.getKey()+"}";
            if(value.contains(key)){
                value = textSet.getValue();
            }
        }
        //模板未匹配到区域替换为空
        if(checkText(value)){
            value = "";
        }
        return value;
    }
}

