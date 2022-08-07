package com.saucedeom.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedeom.pomclass.Homepompage;

public class TC004VerifyMultipleProduct extends TestBaseClas
{

	@Test
	public void mutipleProductAddToCartFunctionality() throws InterruptedException
	{
		   
	    //homePage
	    Homepompage hp = new Homepompage(driver);
	    hp.clickAllProduct();
	    
	    String actualCount = hp.getTextFromCartButton();
		String expectedCount = "5";
		
		Assert.assertEquals(actualCount, expectedCount);
	
		

}
}