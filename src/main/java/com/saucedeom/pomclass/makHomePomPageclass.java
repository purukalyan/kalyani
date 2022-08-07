package com.saucedeom.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class makHomePomPageclass
{
	WebDriver driver;
	//Bag
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") WebElement Bagaddtocart;
		public void BagAddToCart()
		{
			Bagaddtocart.click();
		}
		
		//Bike Lite
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") WebElement BikeliteAddtocart;
		public void BikeliteAddToCart()
		{
			BikeliteAddtocart.click();
		}
		
		//Bolt T-shirt
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") WebElement BoltTshirtAddtocart;
		public void BoltTShirtAddToCart()
		{
			BoltTshirtAddtocart.click();
		}
		
		//Jacket
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") WebElement JacketAddtocart;
		public void jacketAddToCart()
		{
			JacketAddtocart.click();
		}
		
		//Onesis--id="add-to-cart-sauce-labs-onesie" 
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") WebElement OnesisAddtocart;
		public void onesisAddToCart()
		{
			OnesisAddtocart.click();
		}
		
		//Red T-Shirt
		@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement RedTshirAddtocart;
		public void redtshirtAddToCart()
		{
			RedTshirAddtocart.click();
		}
		
		
		//Setting tab
		@FindBy(xpath = "//button[text()='Open Menu']")WebElement MainMenusetting;
		public void menmenusetting()
		{
			MainMenusetting.click();	
		}
		
		//All Item tab
		@FindBy(xpath = "//a[text()='All Items']")WebElement AllItemTab;
		public void allitemtab()
		{
			AllItemTab.click();	
		}
		
		//About Us tab
		@FindBy(xpath = "//a[text()='About']")WebElement AboutTab;
		public void Abouttab()
		{
			AboutTab.click();	
		}
		
		//LogOut Tab
		@FindBy(xpath = "//a[text()='Logout']")WebElement LogOutTab;
		public void logouttab()
		{
			LogOutTab.click();	
		}
		
		//Add to cart container 
		@FindBy(xpath = "//div[@id='shopping_cart_container']") WebElement AddTocartContainer;
		public void addtocartcontainer()
		{
			AddTocartContainer.click();	
		}
		
		//Filter container 
		@FindBy(xpath = "//select[@class='product_sort_container']") WebElement FilterContainer ;
		public void filtercontainer()
		{
			FilterContainer.click();
		}
		
		
		
		public makHomePomPageclass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

}
