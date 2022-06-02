package com.selenium.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	
	WebDriver driver;
	
    @BeforeTest
	public void Login() throws InterruptedException 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2");
		
		
		//Admin Login
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.login();
		
	}
    @Test
    public void Rolecre() throws InterruptedException, IOException
    {
    	
    	//To get test data file
    	
    	FileInputStream Fis=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Role.xlsx");
    	
    	//WorkBook
    	
    	XSSFWorkbook WB=new XSSFWorkbook(Fis);
    	
    	//Sheets
    	
    	XSSFSheet WS=WB.getSheet("Rdata");
    	
    	//Row count
    	
    	int Rcount=WS.getLastRowNum();
    	System.out.println(Rcount);
    	
    	//Multiple Iterations----Loop
    	
    	for (int i=1;i<=Rcount;i++) 
    	{
    		//Rows
    		
    		XSSFRow WR=WS.getRow(i);
    		
    		//cells
    		
    		XSSFCell WC=WR.getCell(0);
    		XSSFCell WC1=WR.getCell(1);
    		
    		XSSFCell WC2=WR.createCell(2);
    		
    		//cell values
    		
    		String Rname=WC.getStringCellValue();
    		String RType=WC1.getStringCellValue();


	
	   //Role
		
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		//New Role
		
		RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
		RD.NewRole();
		
		//New Role Creation
		
		RoleCreation RC=PageFactory.initElements(driver,RoleCreation.class);
		RC.Rcreation(Rname,RType);
		Thread.sleep(3000);
		//Alert
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//Home
		
		RD.Home();
			
    }	
    }
}
	/*
	 * @DataProvider
	 * 
	 * public Object [][] Rdata() { Object[][] Obj=new Object[3][2];
	 * 
	 * Obj[0][0]="Tellersc"; Obj[0][1]="E";
	 * 
	 * Obj[1][0]="ManagerSC"; Obj[1][1]="E";
	 * 
	 * Obj[2][0]="Gmanager"; Obj[2][1]="E";
	 * 
	 * return Obj;
	 * 
	 * }
	 * 
	 */	
	