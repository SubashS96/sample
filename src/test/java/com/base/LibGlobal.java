package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void writeData(String sheet,int row,int cell, String data) throws IOException {
		
		File F = new File("C:\\Users\\91630\\eclipse-workspace\\frameworkclass\\Excel\\Employee Details.xlsx");
		FileInputStream Fin = new FileInputStream(F);
		Workbook w = new XSSFWorkbook(Fin);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(data);
		FileOutputStream Fout = new FileOutputStream(F);
		w.write(Fout);
		
	}
	public String getData(String sheet,int row, int cell) throws IOException {
		String value = null;
		
		File F = new File("C:\\Users\\91630\\eclipse-workspace\\frameworkclass\\Excel\\Employee Details.xlsx");
		FileInputStream Fin = new FileInputStream(F);
		Workbook w = new XSSFWorkbook(Fin);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		if (type==1) {
			value = c.getStringCellValue();
			return value;
		}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
				value = sim.format(dateCellValue);
				return value;
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
				return value;
			}
			}
		return value;
			
		}

	public void updateData(String sheet,int row, int cell, String oldData, String newData) throws IOException {
		
		File F = new File("C:\\Users\\91630\\eclipse-workspace\\frameworkclass\\Excel\\Employee Details.xlsx");
		FileInputStream Fin = new FileInputStream(F);
		Workbook w = new XSSFWorkbook(Fin);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String data = c.getStringCellValue();
		if (data.equals(oldData)) {
			c.setCellValue(newData);
		}
		FileOutputStream Fout = new FileOutputStream(F);
		w.write(Fout);
	}
	
	public static void closeWindow() {
		driver.close();
	}
	
	public static void closeAllWindows() {
		driver.quit();
	}
		
	public String getAttributevalue(WebElement element) {
		String data = element.getAttribute("value");
		return data;

	}	
		
	public static void loadurl(String Data) {
		driver.get(Data);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public WebElement findlocatorbyid(String Attributename) {
		WebElement element = driver.findElement(By.id(Attributename));
		return element;
	}
	public WebElement findlocatorbbyname(String Attributename) {
		WebElement element = driver.findElement(By.name(Attributename));
		return element;
	}
	public WebElement findlocatorbyclass(String Attributename) {
		WebElement element = driver.findElement(By.className(Attributename));
		return element;
	}
	public WebElement findlocatorbyxpath(String Attributename) {
		WebElement element = driver.findElement(By.xpath(Attributename));
		return element;
	}
	public void type(WebElement element,String Data) {
		element.sendKeys(Data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	public String getenteredUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	public String getattributevalue(WebElement element, String Attributename) {
		String Data = element.getAttribute(Attributename);
		return Data;
	}
	public String getattributevalue(WebElement element) {
		String Data = element.getAttribute("Value");
		return Data;
	}
	public void selectoptionbytext(WebElement element, String Data) {
		Select s = new Select(element);
		s.selectByVisibleText(Data);
	}
	public void selectoptionbyindex(WebElement element, String Index) {
		Select s = new Select(element);
		s.selectByVisibleText(Index);
	}
	public void selectoptionbyattribue(WebElement element, String Attributename) {
		Select s = new Select(element);
		s.selectByVisibleText(Attributename);
	}
//	public void typeJS(WebElement element, String Data) {
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0]", set attribute ('value','"+data+"'),element);
//	}
	public void deselectoptionbytext(WebElement element, String Data) {
		Select s = new Select(element);
		s.deselectByVisibleText(Data);
	}
	public void deselectoptionbyindex(WebElement element, String Index) {
		Select s = new Select(element);
		s.deselectByVisibleText(Index);
	}
	public void deselectoptionbyattribue(WebElement element, String Attributename) {
		Select s = new Select(element);
		s.deselectByVisibleText(Attributename);
	}
	public void deselectall(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}
//	public String getallselectedoptions(WebElement element) {
//		Select s = new Select(element);
//		List<WebElement> Data = s.getAllSelectedOptions();
//		return Data;
//	}
//	public String getfirstselectedoptions(WebElement element) {
//		Select s = new Select(element);
//		WebElement data = s.getFirstSelectedOption();
//		return data;
//	}
	
	
	
	
	

	

}
