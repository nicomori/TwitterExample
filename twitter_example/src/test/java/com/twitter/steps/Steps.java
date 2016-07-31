package com.twitter.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.twitter.pages.DashboardPage;
import com.twitter.pages.LoginPage;
import com.twitter.utils.SelectorBrowser;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private static WebDriver driver;
	private LoginPage loginPage = new LoginPage(driver);
	private DashboardPage dashboardPage;

	@Given("I access to the browser \"(.*)?\" and the path \"(.*)?\"")
	public void accessTheBrowser(String browser, String project_location) {
		driver = SelectorBrowser.openBowserWithCapabilities(browser,
				project_location);
	}

	@When("I access to the \"(.*)?\"")
	public void accessToTheURL(String url) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.accessToTheURL(url);
		Assert.assertTrue(loginPage.getButtonLogin().isDisplayed());
	}

	@And("I press in the button login")
	public void validTheCorrectDeploy() {
		loginPage.pressInLogin();
	}

	@And("in the field username I access the \"(.*)?\"")
	public void accessUserName(String userName) {
		loginPage.accessUserName(userName);
	}

	@And("in the field password I access the \"(.*)?\"")
	public void accessPassword(String password) {
		loginPage.accessPassword(password);
	}

	@And("I press in the button access")
	public void pressButtonSubmit() {
		dashboardPage = loginPage.pressButtonSubmit();
	}

	@Then("I verify the correct access to the dashboard")
	public void verifyAccess() {
		Assert.assertTrue(dashboardPage.getTabInicio().isDisplayed());
		Assert.assertTrue(dashboardPage.getTabNotifications().isDisplayed());
	}

	@After
	public void ejemplo() {
		driver.quit();
	}
}