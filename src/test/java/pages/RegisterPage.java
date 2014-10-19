package pages;

import org.testng.Assert;

public class RegisterPage extends Page {

	public RegisterPage verifyUsnTest(String firstName, String lastName,
			String password, String confPassword, String day, String year,
			String phone, String email) {
		System.out.println(CONFIG.getProperty("testSite"));

		driver.get(CONFIG.getProperty("testSite"));
		click("GMAIL");
		click("CREATE");
		input("FIRSTNAME", firstName);
		input("LASTNAME", lastName);
		input("PASSWORD", password);
		input("CONFPASSWORD", confPassword);
		input("DAY", day);
		input("YEAR", year);
		input("MOBILE", phone);
		input("EMAIL", email);
		click("MONTHSEL");
		click("MONTH");
		click("GENDERSEL");
		click("GENDERMALE");
		click("SKIPCAPTCHA");
		click("IAGREE");
		click("NEXT");

		String expectedErrorMsg = "You can't leave this empty.";
		String actualErrorMsg = getText("BLANK_USN_ERROR");

		Assert.assertEquals(expectedErrorMsg, actualErrorMsg);

		return new RegisterPage();

	}

}
