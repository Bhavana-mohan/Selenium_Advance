package Selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo11_windowhandler2 {
	WebDriver driver;

	@Test
	public void Actions1() throws IOException  {
		
		File src= new File("C:\\Users\\training_b6b.00.07\\Desktop\\Test data.xlsx");
		FileInputStream FIS= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(FIS);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("First row number"+sh.getFirstRowNum());
		System.out.println("last row number"+sh.getLastRowNum());
		int rowCount1=sh.getLastRowNum()-sh.getFirstRowNum();
		System.out.println("no of rows"+rowCount1);
		System.out.println("Username1"+sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println("Password1"+sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println("Username2"+sh.getRow(2).getCell(0).getStringCellValue());
		System.out.println("Password2"+sh.getRow(2).getCell(1).getStringCellValue());
		for (int i=1;i<=rowCount1;i++)
		{
		System.out.println(sh.getRow(i).getCell(0).getStringCellValue()
				+"\t\t\t"+sh.getRow(i).getCell(1).getStringCellValue()+sh.getPhysicalNumberOfRows());
		}
		
		Row header=sh.getRow(0);
		Cell Header1=header.createCell(3);
		Header1.setCellValue("Status");
		sh.getRow(1).createCell(3).setCellValue(true);
		sh.getRow(2).createCell(3).setCellValue(false);
		
		FileOutputStream FSO=new FileOutputStream(src);
		wb.write(FSO);
		
		
		
		
	}
		
}

