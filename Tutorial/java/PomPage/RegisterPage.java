package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLink;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement RadioButton;

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement FirstNameTextField;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement LastNameTextField;

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement EmailTextField;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement PasswordTextField;

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfPassTextField() {
		return ConfPassTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement ConfPassTextField;

	@FindBy(id = "register-button")
	private WebElement RegisterButton;
}
