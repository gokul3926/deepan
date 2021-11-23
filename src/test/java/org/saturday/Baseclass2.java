package org.saturday;

import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass2 {
	
		static WebDriver driver;
		
		public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		}
		
	
			public static void enterText(WebElement element,String text) {
				element.sendKeys(text);
			}
			public static void buttonClick(WebElement element) {
				element.click();
			}
			
		    public static String gettingTittle() {
			   String title = driver.getTitle();
			   return title;
		    }
		    
		    public static String gettingCurrentUrl() {
		    	String currentUrl = driver.getCurrentUrl();
		    	return currentUrl;
		    }
		    
		    public static String gettingText(WebElement element) {
		    	String text = element.getText();
		    	return text;
		    }
		    	
		    public static String gettingAttribute(WebElement element,String value) {
		    	String attribute = element.getAttribute(value);
		    	return attribute;
		    }
		    
		    public static void selectionByIndex(WebElement element,int index) {
		    	Select a = new Select(element);
		    	a.selectByIndex(index);
		    }
		    	
		    public static void selectByVisibleText(WebElement element,String text) {
		    	Select a = new Select(element);
		    	a.selectByVisibleText(text);
		    }
		
		    public static void selectionByValue(WebElement element,String text ) {
		    	Select a = new Select(element);
		    	a.selectByValue(text);
		    }
		    
		    public static void checkMultiSelect (WebElement element ,Boolean text) {
		    	Select a = new Select(element);
		    	a.isMultiple();
		    }
		    public static void deSelectAll(WebElement element) {
		    	Select a = new Select(element);
		    	a.deselectAll();
		    }
		    public static String excelRead(int rowindex,int cellindex) throws IOException {
		    	File f = new File("D:\\Temp\\pojo.xlsx");
		    	FileInputStream stream = new FileInputStream(f);
		    	Workbook w = new XSSFWorkbook(stream);
		    	Sheet sheet = w.getSheet("sample");
		    	Row row = sheet.getRow(rowindex);
		    	Cell cell = row.getCell(cellindex);
		    	int cellType = cell.getCellType();
		    	if(cellType ==1) {
		    		String stringCellValue = cell.getStringCellValue();
		    		return stringCellValue;
		    		
		    	}
		    	else if(DateUtil.isCellDateFormatted(cell)) {
		    		Date dateCellValue = cell.getDateCellValue();
		    	    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		    	    String format = s.format(dateCellValue);
		    	    return format;
		    	       	    
		    	}
		    	
		    	else {
		    		double numericCellValue = cell.getNumericCellValue();
		    		long l =(long)numericCellValue;
		    		String valueof = String.valueOf(l);
		    		return valueof;
				   
		    	}}
		    	
		    	public static void excelWrite(String path,String sheetname,int rowindex,int cellindex,String value) throws IOException {
		    		File f = new File(path);
		    		FileOutputStream stream = new FileOutputStream(f);
		    		Workbook w = new XSSFWorkbook();
		    		Sheet createSheet1 = w.createSheet(sheetname);
		    		Row createRow = createSheet1.createRow(rowindex);
		    		Cell createCell = createRow.createCell(rowindex);
		    		createCell.setCellValue(value);
		    		w.write(stream);
		    	}}




