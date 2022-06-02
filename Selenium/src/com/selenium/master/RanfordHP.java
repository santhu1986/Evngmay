package com.selenium.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class RanfordHP 
{

	//Element Properties
	
	@FindBy(id="txtuId")
	WebElement Uname;
	
	@FindBy(id="txtPword")
	WebElement Pswd;
	
	@FindBy(xpath="//*[@id=\'login\']")
	WebElement Lgn;
	
	
	//Element Methods
	
	public void login() 
	{
	Uname.sendKeys("Admin");
	Pswd.sendKeys("Mq$ystems@");
	Lgn.click();
    }
	
	
}
