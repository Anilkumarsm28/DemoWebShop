package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import PomPage.RegisterPage;

public class RegisterPageTest extends BaseTest{
	@Test
	public void registerTest() {
		RegisterPage register=new RegisterPage(driver);
		
		assertTrue(true, "RegisterLink is not Clicking");
		register.getRegisterLink().click();
		assertTrue(true, "RegisterLink is not Clicking");

		assertTrue(true, "RaddiButton is not checking");
		register.getRadioButton().click();
		assertTrue(true, "RaddiButton is not checking");

		assertTrue(true, "FirstName TextField is not clicking");
		register.getFirstNameTextField().sendKeys("Anilkumar");
		assertTrue(true, "FirstName TextField is not clicking");

		assertTrue(true, "LastName TextField is not clicking");
		register.getLastNameTextField().sendKeys("SM");
		assertTrue(true, "LastName TextField is not clicking");
	
		register.getEmailTextField().sendKeys("anilkumarsm28@gmail.com");
		assertTrue(true, "Email TextField is not clicking");
	
		register.getPasswordTextField().sendKeys("Password@12345");
		assertTrue(true, "Password TextField is not clicking");

		register.getConfPassTextField().sendKeys("Password@12345");
		assertTrue(true, "ConfPass TextField is not clicking");

		register.getRegisterButton().click();
		assertTrue(true, "Register Button is not clicking");

	}

}
