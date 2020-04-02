package com.poitest;

import com.jc.model.Schools;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Change
 */
public class UploadExcel {
    public static boolean uploadExcel(@RequestParam MultipartFile file, HttpServletRequest request) throws IOException {

        if (!file.isEmpty()) {
            String filePath = file.getOriginalFilename();
            //windows
            String savePath = request.getSession().getServletContext().getRealPath(filePath);

            //linux
            //String savePath = "/home/odcuser/webapps/file";

            File targetFile = new File(savePath);

            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }

            file.transferTo(targetFile);
            return true;
        }

        return false;
    }


    public static List<Schools> readExcel() throws Exception {
        String fileName = "F:\\nun\\一体机调试汇总表.xlsx";
        InputStream is = new FileInputStream(new File(fileName));
        Workbook hssfWorkbook = null;
        if (fileName.endsWith("xlsx")) {
            hssfWorkbook = new XSSFWorkbook(is);//Excel 2007
        } else if (fileName.endsWith("xls")) {
            hssfWorkbook = new HSSFWorkbook(is);//Excel 2003
        }
        List<Schools> list = new ArrayList<Schools>();
        // 循环工作表Sheet
        for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
            Sheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                Row hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow != null || hssfRow.toString().length() < 0) {
                    hssfRow.getCell(28);
                    DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); //HH表示24小时制；
                    Schools schools = new Schools(Integer.valueOf((int) Double.parseDouble(hssfRow.getCell(0).toString())), Integer.valueOf((int) Double.parseDouble(hssfRow.getCell(1).toString())), hssfRow.getCell(2).toString(), hssfRow.getCell(3).toString(), hssfRow.getCell(4).toString(), hssfRow.getCell(5).toString(), hssfRow.getCell(6).toString(), hssfRow.getCell(7).toString(), hssfRow.getCell(8).toString(), Integer.valueOf((int) Double.parseDouble(hssfRow.getCell(9).toString())), hssfRow.getCell(10).toString(), hssfRow.getCell(11).toString(), hssfRow.getCell(12).toString(), hssfRow.getCell(13).toString(), hssfRow.getCell(14).toString(), hssfRow.getCell(15).toString(), hssfRow.getCell(16).toString(), hssfRow.getCell(17).toString(), hssfRow.getCell(18).toString(), hssfRow.getCell(19).toString(), hssfRow.getCell(20).toString(), hssfRow.getCell(21).toString(), hssfRow.getCell(22).toString(), hssfRow.getCell(23).toString(), hssfRow.getCell(24).toString(), hssfRow.getCell(25).toString(), hssfRow.getCell(26).toString(), hssfRow.getCell(27).toString(), dFormat.format(hssfRow.getCell(28).getDateCellValue()));

//                    System.out.println(schools.toString());
                    list.add(schools);
                }
            }
        }
        //write2Docx(list);
//        schoolListInsertall(list);
        return list;
    }

    public static void main(String[] args) throws Exception {
        for (Schools schools : readExcel()) {
            System.out.println(schools);
        }

    }

    private static void schoolListInsertall(List<Schools> list) {
        for (Schools schools : list) {
            System.out.println(schools.toString());
        }
    }

//    public static void main(String[] args) throws Exception{
//        readExcel();
//    }


//    public static void write2Docx(List<Schools> list)throws Exception{
//        XWPFDocument document= new XWPFDocument();
//        File file = new File("D:\\Offer\\邮件3.docx");
//        if(file.getParentFile().exists()) {//存放fileName文件的父目录存在
//            try {
//                file.createNewFile();//则创建fileName这个文件
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }else {//如果存放fileName文件的父目录不存在
//            file.mkdirs(); //则创建整个父目录E:\eclipse-workspace\TheService1\src
//            try {
//                file.createNewFile();//并且在已创建好的父目录底下创建这个fileName文件
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//        FileOutputStream out = new FileOutputStream(file);
//        //段落
//        XWPFParagraph firstParagraph = document.createParagraph();
//        firstParagraph.setAlignment(ParagraphAlignment.LEFT);
//        //设置段落居中
//        XWPFRun run = firstParagraph.createRun();
//        int a = 0;
//        for (ExcelBean excel : list) {
//            run.setText("邮编：" + excel.getTrs3());
//            run.addCarriageReturn();
//            run.setText("" + excel.getTrs1());
//            run.addCarriageReturn();
//            run.setText("" + excel.getTrs2());
//            run.addCarriageReturn();
//            run.setText("办公室车管负责人：收");
//            run.addCarriageReturn();
//            if ((a+1)%4!=0) {
//                run.addCarriageReturn();
//                run.addCarriageReturn();
//            }
//            a++;
//        }
//        run.setColor("000000");//字体颜色
//        run.setFontSize(16);//字体大小
//        document.write(out);
//        out.close();
//    }
}
