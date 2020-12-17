package com.testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.base.TestBase;
import com.pages.HomePage;


public class HomePageTest extends TestBase {
	Logger log = Logger.getLogger(HomePageTest.class);
    HomePage homepage;

	public HomePageTest() {
		super();
	}

	

	@BeforeClass
	public void setup() {
		initialisation();
		homepage = new HomePage(driver);

	}

	@Test(priority=1)
		
		public void verifyHomePageTitleTest(){
	    	
		homepage.serchFirstIphone12();
	

}
}
