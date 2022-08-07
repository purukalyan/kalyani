package com.saucedeom.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedeom.pomclass.Homepompage;

public class TC002VerifyHomepage extends TestBaseClas
{
    @Test
    public void logOutFunctionality()
    {
        
        	
		//homePage
		//logOutActivity
		
        Homepompage hp = new Homepompage(driver);
		hp.clickOnSettingButton();
		System.out.println("Click on SettingButton");
		hp.clickOnLogOutButton();
		System.out.println("Click on LogOutButton");
		
		System.out.println("Applying the validation");
		
		//loginpage
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle , actualTitle);
        
		
	

}
}




