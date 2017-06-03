package com.tutk.kalayvsaas.v3.jenkins;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class LoadStringTable {

	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFRow r;
	ArrayList<String> resultlist = new ArrayList<String>();

	public ArrayList<String> LoadStingTable(String sheetname, int casenum) {
		try {
			workbook = new HSSFWorkbook(
					new FileInputStream("C:\\StringTable.xls"));
			sheet = workbook.getSheet(sheetname);
			resultlist = new ArrayList<String>();
			for (int j = 0; j < sheet.getRow(casenum).getPhysicalNumberOfCells(); j++) {

				resultlist.add(sheet.getRow(casenum).getCell(j).toString());
			}

			workbook.close();
		} catch (IOException e) {
			;
		}
		return resultlist;
	}

	public static void main(String[] args) {

	}

}
