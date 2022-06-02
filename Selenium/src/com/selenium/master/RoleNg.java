package com.selenium.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNg extends Base
 {   
	@Test(dataProvider="Rdata")
    public void Rol(String Rn,String Rt) 
    {
         	LB.Role(Rn,Rt);
    }
	
	@DataProvider
	
	public Object [][] Rdata()
	{
		Object[][] Obj=new Object[3][2];
		
		Obj[0][0]="Tellersc";
		Obj[0][1]="E";
		
		Obj[1][0]="ManagerSC";
		Obj[1][1]="E";
		
		Obj[2][0]="Gmanager";
		Obj[2][1]="E";
		
		return Obj;
		
	}
   }
