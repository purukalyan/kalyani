package com.saucedeom.testclass;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedeom.utilitypackage.TakesScreenshot1;

public class TC001Verifyloginfunctionality extends TestBaseClas

{

	@Test		
	public void loginFuntionality() throws IOException
	{ 
		//screenshot
	   TakesScreenshot1.takeScreenshot(driver);
	    
		//validation
        String expectedTitle = "Swag Labs";	   //given	
		
		String actualTitle = driver.getTitle();  //actual
		Assert.assertEquals(expectedTitle , actualTitle);

}
}