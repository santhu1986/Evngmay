package com.selenium.master;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library
{

	 Properties Pr;
 FileInputStream Fis;
  WebDriver driver;
String Expval,Actval;

public String openApp(String Url) 
{
	String Expval="Ranford Bank";
	driver=new FirefoxDriver();
		driver.get(Url);
	
	String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();	
			System.out.println(Actval);
	if (Expval.equalsIgnoreCase(Actval)) 
	{
	System.out.println("Application is launched");
	return "pass";
	}
	else
	{
		System.out.println("Application not opened");
		return "fail";
	}
}
public String AdmLgn(String Un,String Pwd)
{
	Expval="Welcome to Admin";
	driver.manage().window().maximize();
	driver.findElement(By.id("txtuId")).sendKeys(Un);
	driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	driver.findElement(By.id("login")).click();
	
	Actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	System.out.println(Actval);
	//driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
if (Expval.equalsIgnoreCase(Actval)) 
{
System.out.println("adminhome is displayed");
return "pass";
}
else
{
	System.out.println("adminhome is not displayed");
return "fail";
}
	}

public String Role(String RN,String RT)
{
	Expval="Sucessfully";
	
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(RN);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	
	String Actval=driver.switchTo().alert().getText();
	
	System.out.println(Actval);
	
	
      driver.switchTo().alert().accept();
      driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();  
      if (Actval.contains(Expval)) 
      {
    	  System.out.println("Role Created");
    	 
		
	}
      else{
    	  System.out.println("role not created");
       }
 return Actval;     
}
}