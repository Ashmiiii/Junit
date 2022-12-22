package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\ashmi\\OneDrive\\Desktop\\ExcelWrite.xlsx");
	//FileInputStream f1 = new FileInputStream(f);
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("Excel");
    Row r = s.createRow(0);
    Cell cell = r.createCell(0);
    cell.setCellValue("Ashmitha");
    
    FileOutputStream o = new FileOutputStream(f);
    w.write(o);
    o.close();
}
}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	