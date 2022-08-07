package com.saucedeom.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class makVerifyhomepagefuncti 
{
	
	
	@FindBy(css = "#first-name")WebElement FirstName;
	public void firstname()
	{
		FirstName.sendKeys("Makarand");
	}
	
	@FindBy(css="#last-name") WebElement LastName ;
	public void lastname()
	{
		LastName.sendKeys("Kendre");
	}
	
	@FindBy(css = "#postal-code") WebElement PostalCode;
	public void postalcode()
	{
		PostalCode.sendKeys("413515");
	}
	@FindBy(css = "#continue") WebElement ContinueBtn;
	public void clickonContinuebtn()
	{
		ContinueBtn.click();
	}

	@FindBy(css="#finish") WebElement FinishBtn;
	public void CLickonFinishBtn()
	{
		FinishBtn.click();
	}
	
	@FindBy(css="#back-to-products") WebElement BackToHomepagebtn;
	private WebDriver driver;
	public void clickonbacktohomebtm()
	{
		BackToHomepagebtn.click();
	}
	
	
	public void AddToCartPagePOM(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}

}
