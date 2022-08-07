package com.saucedeom.pomclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 
{

	@BeforeMethod
	public void setUpMethod()       //pre-conditions
	{
		System.out.println("browser open, url open, loginActivity");
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		System.out.println("Login functionality is verify-TC passed");
	}
	
	@AfterMethod
	public void tearDownMethod()    //post-conditions
	{
		System.out.println("logOutActivity, Browser Close");
	}

//	@Test
//	public void method1()
//	{
//	System.out.println("hi");
//	}


}
