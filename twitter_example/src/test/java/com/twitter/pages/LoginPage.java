package com.twitter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private final WebDriver driver;
	WebElement explicitWait;

	@FindBy(name = "session[username_or_email]")
	private WebElement BOX_USERNAME;

	@FindBy(name = "session[password]")
	private WebElement BOX_PASSWORD;

	@FindBy(xpath = ".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")
	private WebElement BUTTON_SUBMIT;

	@FindBy(xpath = "//a[contains(text(),'Iniciar sesi—n')]")
	private WebElement BUTTON_LOGIN;

	By LOCATOR_BUTTON_REGISTRATION = By
			.xpath("//a[contains(text(),'Reg’strate')]");
	By LOCATOR_BUTTON_LOGIN = By
			.xpath("//a[contains(text(),'Iniciar sesi—n')]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void accessToTheURL(String url) {
		driver.get(url);

		explicitWait = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.presenceOfElementLocated(LOCATOR_BUTTON_REGISTRATION));
		explicitWait = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.presenceOfElementLocated(LOCATOR_BUTTON_LOGIN));
	}

	/**
	 * This method is created for press click into the login button into the
	 * page login.
	 * 
	 * @creator: Nicolas Mori
	 * 
	 */
	public void pressInLogin() {
		BUTTON_LOGIN.click();
	}

	/**
	 * This method is created for access the user name into the login page of
	 * twitter. 
	 * 
	 * @creator: Nicolas Mori
	 * 
	 * @parameter: String
	 * 
	 */
	public void accessUserName(String userName) {
		BOX_USERNAME.sendKeys(userName);
	}

	/**
	 * This method is created for set the password.
	 * 
	 * @creator: Nicolas Mori
	 * 
	 * @parameter: String
	 */
	public void accessPassword(String password) {
		BOX_PASSWORD.sendKeys(password);
	}

	/**
	 * This method is created for press the button submit
	 * 
	 * @creator: Nicolas Mori
	 * 
	 * @return: DashBoardPage
	 * 
	 */
	public DashboardPage pressButtonSubmit() {
		BUTTON_SUBMIT.click();
		return new DashboardPage(driver);
	}

	/**
	 * This method is created for get a WebElement
	 * 
	 * @creator: Nicolas Mori
	 * 
	 * @return: WebElement
	 */
	public WebElement getButtonLogin() {
		return driver.findElement(LOCATOR_BUTTON_LOGIN);
	}
}