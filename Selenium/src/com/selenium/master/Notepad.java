package com.selenium.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
		//Instance Class
		
		Library LB=new Library();
		
		LB.openApp("http://122.175.8.158/ranford2");
		
		LB.AdmLgn("Admin","Mq$ystems@");
		
		//To get Test Data File Path
		
		String Fpath="C:\\Users\\LENOVO\\SeleniumWorkspace\\Selenium\\src\\com\\selenium\\testdata\\Role.txt";
		
		//Results File Path
		
		String Rpath="C:\\Users\\LENOVO\\SeleniumWorkspace\\Selenium\\src\\com\\selenium\\results\\Res_Role.txt";
		String SD;
		
		//To Get Test Data File
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		
		//Writing Header Into Results
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
        BW.newLine();
        
        //while Loop   -----  Conditional Loop
        
        while((SD=BR.readLine())!=null)
        {
			System.out.println(SD);
			
			
			//Split
			
		String 	SR[]=SD.split("###");
			
		    String Rname=SR[0];
			String Rtyp=SR[1];
			
			String Res=LB.Role(Rname,Rtyp);
			
			System.out.println(Res);
			
			
			
			//Results 
			
			BW.write(SD+"$^$*&&"+Res);
			BW.newLine();
			
        }
      BW.close();
      BR.close();
}
}