package com.twitter.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SelectorBrowser {

	public static DesiredCapabilities capabilities;

	/**
	 * This method is created for initiate the browser with chrome.
	 * 
	 * @creator: Nicolas Mori
	 * 
	 * @param browser
	 * @param project_location
	 * @return WebDriver
	 */
	public static WebDriver openBowserWithCapabilities(String browser,
			String project_location) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:/DriversBrowser/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", project_location
				+ "chromedriver"); // in case the OS is Windows, you need change
									// the file name, o extension.

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}
}