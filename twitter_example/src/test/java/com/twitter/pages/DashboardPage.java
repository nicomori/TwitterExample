package com.twitter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

	private final WebDriver driver;
	WebElement explicitWait;

	By LOCATOR_TAB_INICIO = By.xpath("//span[contains(text(),'Inicio')]");

	By LOCATOR_TAB_NOTIFICACIONES = By
			.xpath("//span[contains(text(),'Notificaciones')]");

	By LOCATOR_BUTTON_TWITTEAR = By
			.xpath("//span[contains(text(),'Twittear')]");
	

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

		explicitWait = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.presenceOfElementLocated(LOCATOR_TAB_INICIO));
		explicitWait = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.presenceOfElementLocated(LOCATOR_TAB_NOTIFICACIONES));
		explicitWait = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.presenceOfElementLocated(LOCATOR_BUTTON_TWITTEAR));
	}

	/**
	 * This method is created for get a WebElement 
	 * 
	 * @creator: Nicolas Mori
	 * 
	 * @return: WebElement 
	 */
	public WebElement getTabInicio() {
		return driver.findElement(LOCATOR_TAB_INICIO);
	}
	
	/**
	 * This method is created for get a WebElement 
	 * 
	 * @creator: Nicolas Mori
	 * 
	 * @return: WebElement 
	 * 
	 */
	public WebElement getTabNotifications() {
		return driver.findElement(LOCATOR_TAB_NOTIFICACIONES);
	}
}