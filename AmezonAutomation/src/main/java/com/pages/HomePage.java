package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement serchTextBox;

	@FindBy(xpath= "//span[@id='nav-search-submit-text']")
	private WebElement serchSubmitText;

	
	@FindBy(xpath= "//div[@id='anonCarousel1']/ol/li[1]")
	private WebElement serchFirstIphone12;
	
	
	// initialising the page object
		public HomePage(WebDriver driver) {
			
		//this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		// Actions
		public String validateLoginPageTitle(WebDriver driver) {
			return driver.getTitle();
		}

		public void serchFirstIphone12() {
			serchTextBox.click();
			serchTextBox.sendKeys("iphone12");
			serchSubmitText.click();
			serchFirstIphone12.click();
		}

		


}
