package com.saucedeom.utilitypackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot1 
{
		
		public static void takeScreenshot(WebDriver driver) throws IOException
		{

			Date d = new Date();
			DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
			String date = d1.format(d);
			

//		     SCREEN SHOT
		  
			 TakesScreenshot ts = (TakesScreenshot)driver;
			 File SourceFile = ts.getScreenshotAs(OutputType.FILE);
			 File DestFile = new File("./ScreenshotFolder/saucedemo"+date+".jpg");
			 FileHandler.copy(SourceFile, DestFile); 
			 
	  }
	  
		}


