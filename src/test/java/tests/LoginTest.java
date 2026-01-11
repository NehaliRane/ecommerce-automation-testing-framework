package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;


public class LoginTest extends BaseTest {
	
	@Test

	public void validLoginTest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("test@gmail.com","password123");
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Automation"));
	}

}
