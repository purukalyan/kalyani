package com.saucedeom.testclass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedeom.pomclass.Loginpompage;
import com.saucedeom.utilitypackage.TakesScreenshot1;

public class TestBaseClas 
{
WebDriver driver;
	
@Parameters("browserName")
@BeforeMethod
public void setUP(String browserName) 
{
	Logger log = Logger.getLogger("SauceMavanProject1");
	if(browserName.equals("chrome"))
	{

		System.setProperty("webdriver.chrome.driver", 
				"./Driverfolder/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{	
	System.setProperty("webdriver.gecko.driver", 
				"./Driverfolder/geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	else
	{
		System.out.println("throw the error");
	}
	
	PropertyConfigurator.configure("Log4j.Properties");
		
		log.info("Browser is opened");
	
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
		
		//screenshot
		 //TakesScreenshot1.takeScreenshot(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login
		Loginpompage lp = new Loginpompage(driver);
	    lp.sendUsername();
	    log.info("Un is entered");
	    lp.sendPassword();
	    lp.clickOnLoginButton();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//logOut
		
		driver.quit();
		System.out.println("browser is closed");
	}

}



