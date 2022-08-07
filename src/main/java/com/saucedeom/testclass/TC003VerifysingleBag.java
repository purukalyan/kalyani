package com.saucedeom.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedeom.pomclass.Homepompage;

public class TC003VerifysingleBag extends TestBaseClas
{
	@Test
	public void bagProductAddTOCartFunctionality()
	{  
	    //homePage
	    Homepompage hp = new Homepompage(driver);
	    hp.clickOnBagButton();
	    
	   String actaulCount =  hp.getTextFromCartButton();
	    
	   String expectedCount = "1";
	   
	  Assert.assertEquals(actaulCount,expectedCount);
	
	 
		
	

}
}
