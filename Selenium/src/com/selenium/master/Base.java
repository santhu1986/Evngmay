package com.selenium.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base {
  
	
	Library LB=new Library();
	
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
  LB.AdmLgn("Admin","Mq$ystems@");
  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
  LB.admlgt();
  Thread.sleep(3000);
  }

  @BeforeSuite
  public void beforeSuite() throws InterruptedException 
  {
	LB.openApp("http://122.175.8.158/ranford2"); 
	Thread.sleep(3000);
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Appc();
  }

}
