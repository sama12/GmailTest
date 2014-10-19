package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.Page;
import pages.RegisterPage;

public class RegistrationTest extends Page{

	@Test
	public void registerTest() {

		RegisterPage registerPage = new RegisterPage();
		RegisterPage page = registerPage.verifyUsnTest("Jhon", "Watson",
				"134Passw0rd**", "134Passw0rd**", "10", "1981", "07880502431",
				"mailme@hello.com");

	}

	@AfterMethod
	public void afterTest(){
		driver.quit();
	}
	
	
}
