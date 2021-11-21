package frameworkclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	//to get into the file location
	File f =  new File("C:\\Users\\91630\\eclipse-workspace\\frameworkclass\\Excel\\Employee Details.xlsx");
	//to get into the file
	FileInputStream fin = new FileInputStream(f);
	//to get into the workbook
	Workbook w = new XSSFWorkbook(fin);
	Sheet sheet2 = w.getSheet("Sheet 2");
	Row row = sheet2.getRow(2);
	Cell cell = row.getCell(2);
	String v = cell.getStringCellValue();
	if (v.contains("Subash")) {
		cell.setCellValue("karan");
		
	}
	FileOutputStream Fout = new FileOutputStream(f);
	w.write(Fout);
	System.out.println("Updated..");
}
}

	
//	Row Row1 = sheet2.createRow(1);
//	Row Row2 = sheet2.createRow(2);
//	Row Row3 = sheet2.createRow(3);
//	Row Row4 = sheet2.createRow(4);
//	Row Row5 = sheet2.createRow(5);
//	Row Row6 = sheet2.createRow(6);
//	Row Row7 = sheet2.createRow(7);
//	Row Row8 = sheet2.createRow(8);
//	Row Row9 = sheet2.createRow(9);
//	Row Row10 = sheet2.createRow(10);
//	
//	Cell Cell1 = Row1.createCell(1);
//	Cell Cell2 = Row2.createCell(2);
//	Cell Cell3 = Row3.createCell(3);
//	Cell Cell4 = Row4.createCell(4);
//	Cell Cell5 = Row5.createCell(5);
//	Cell Cell6 = Row6.createCell(6);
//	Cell Cell7 = Row7.createCell(7);
//	Cell Cell8 = Row8.createCell(8);
//	Cell Cell9 = Row9.createCell(9);
//	Cell Cell10 = Row10.createCell(10);
//	
//	Cell1.setCellValue("Subash");
//	Cell2.setCellValue("Subash");
//	Cell3.setCellValue("Subash");
//	Cell4.setCellValue("Subash");
//	Cell5.setCellValue("Subash");
//	Cell6.setCellValue("Subash");
//	Cell7.setCellValue("Subash");
//	Cell8.setCellValue("Subash");
//	Cell9.setCellValue("Subash");
//	Cell10.setCellValue("Subash");
	
//	FileOutputStream Fout = new FileOutputStream(f);
//	w.write(Fout);
//	System.out.println("Done");
//}
//}


	
	
	
	
//	//to get into the sheet
//	Sheet sheet = w.getSheet("Sheet1");
//	Row row3 = sheet.getRow(2);
//	Cell cell2 = row3.getCell(4);
//	System.out.println(cell2);
//	int cellType = cell2.getCellType();
//	System.out.println("cell type is:"+cellType);
//	//celltype = 1 means string value
//	if (cellType==1) {
//		String stringCellValue = cell2.getStringCellValue();
//		System.out.println(stringCellValue);
//		}
//		if (cellType==0) {
//			if (DateUtil.isCellDateFormatted(cell2)) {
//				Date dateCellValue = cell2.getDateCellValue();
//				SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
//				String format = d.format(dateCellValue);
//				System.out.println(format);
//			}
//			else {
//				double numericCellValue = cell2.getNumericCellValue();
//				long l = (long) numericCellValue;
//				String valueOf = String.valueOf(l);
//				System.out.println(valueOf);
//			
//			}
//			
//		}
		
	

//	//to print all contents of excel
//	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//		Row row2 = sheet.getRow(i);
//		for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
//			Cell cell1 = row2.getCell(j);
//			System.out.println(cell1);
//			}
//   }
	
//to get in to the row	
//	Row row = sheet.getRow(2);
//	//to get in to the cell
//	Cell cell = row.getCell(2);
//	//to print the value in the cell
//	System.out.println(cell);
//	//to get no of rows
//	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//	System.out.println("number of rows:"+physicalNumberOfRows);
//	//to get no of cells
//	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//	System.out.println("number of cell:"+physicalNumberOfCells);
	
	

