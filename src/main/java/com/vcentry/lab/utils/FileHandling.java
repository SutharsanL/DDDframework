package com.vcentry.lab.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling {
public static String[][] data;
	public static String[][] getExcelData(String fileLocation,String sheetName) throws IOException {
	File f =new File(fileLocation);
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook wb= new XSSFWorkbook(fi);
	XSSFSheet s=wb.getSheet(sheetName);
	int row=s.getLastRowNum();
	data=new String[row][s.getRow(0).getLastCellNum()];
	for (int i = 1; i < row+1; i++) {
		int col=s.getRow(i).getLastCellNum();
		for (int j = 0; j < col; j++) {
			data[i-1][j]=s.getRow(i).getCell(j).getStringCellValue();
		}
	}
		return data;
	}
}
