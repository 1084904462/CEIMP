package org.obsidian.ceimp.util;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.obsidian.ceimp.bean.ExcelScholarshipBean;
import org.obsidian.ceimp.bean.ExcelUserBean;
import org.springframework.web.multipart.MultipartFile;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2018/5/25.
 */
public class ExcelUtil {
    private SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月");
    private DecimalFormat df = new DecimalFormat("#.##");

    private static final ExcelUtil instance = new ExcelUtil();

    private ExcelUtil(){}

    public static ExcelUtil getInstance(){
        return instance;
    }

    public List<ExcelUserBean> readUser(MultipartFile file) throws Exception {
        List<ExcelUserBean> list = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
        XSSFSheet sheet = null;
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum，获取最后一行的行标,j=1表示忽略第一行表头
                XSSFRow row = sheet.getRow(j);
                if (row != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum，是获取最后一个不为空的列是第几个
                        if (row.getCell(k) != null) { // getCell 获取单元格数据
                            sb.append(this.getXCellVal(row.getCell(k))).append(" ");
                        }
                    }
                    list.add(new ExcelUserBean(sb.toString().split(" ")));
                }
            }
        }
        return list;
    }

    public List<ExcelScholarshipBean> readScholarship(MultipartFile file) throws Exception{
        List<ExcelScholarshipBean> list = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
        XSSFSheet sheet = null;
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum，获取最后一行的行标,j=1表示忽略第一行表头
                XSSFRow row = sheet.getRow(j);
                if (row != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum，是获取最后一个不为空的列是第几个
                        if (row.getCell(k) != null) { // getCell 获取单元格数据
                            sb.append(this.getXCellVal(row.getCell(k))).append(" ");
                        }
                    }
                    list.add(new ExcelScholarshipBean(sb.toString().split(" ")));
                }
            }
        }
        return list;
    }

    private String getXCellVal(XSSFCell cell) {
        String val = "";
        switch (cell.getCellType()) {
            case XSSFCell.CELL_TYPE_NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    val = fmt.format(cell.getDateCellValue()); //日期型
                } else {
                    val = df.format(cell.getNumericCellValue()); //数字型
                }
                break;
            case XSSFCell.CELL_TYPE_STRING: //文本类型
                val = cell.getStringCellValue();
                break;
            case XSSFCell.CELL_TYPE_BOOLEAN: //布尔型
                val = String.valueOf(cell.getBooleanCellValue());
                break;
            case XSSFCell.CELL_TYPE_BLANK: //空白
                val = cell.getStringCellValue();
                break;
            case XSSFCell.CELL_TYPE_ERROR: //错误
                val = "错误";
                break;
            case XSSFCell.CELL_TYPE_FORMULA: //公式
                try {
                    val = String.valueOf(df.format(cell.getNumericCellValue()));
                } catch (IllegalStateException e) {
                    val = String.valueOf(df.format(cell.getStringCellValue()));
                }
                break;
            default:
                val = cell.getRichStringCellValue().toString();
        }
        return val;
    }
}
