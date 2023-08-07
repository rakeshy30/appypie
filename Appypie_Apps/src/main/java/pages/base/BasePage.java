package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.SeleniumDriver;

//super class: contain common driver reference which we shared inn all these classes
public class BasePage {

	public static WebDriver driver;
	private static WebElement mouseOverElement;

	public BasePage() {

		driver = SeleniumDriver.getDriver();
	}

	public void mouseOver(String locator) {

		if (locator.endsWith("_XPATH")) {

			mouseOverElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {

			mouseOverElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));

		} else if (locator.endsWith("_CSS")) {

			mouseOverElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));

		} else if (locator.endsWith("_LINK")) {

			mouseOverElement = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator)));

		}

		new Actions(driver).moveToElement(mouseOverElement).perform();
	}

	public void click(String locator) {
		if (locator.endsWith("_XPATH")) {

			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_ID")) {

			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).click();

		} else if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).click();

		} else if (locator.endsWith("_LINK")) {

			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).click();

		}
	}

	public boolean isElementpresent(String locator) {

		try {
			if (locator.endsWith("_XPATH")) {

				driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
			} else if (locator.endsWith("_ID")) {

				driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));

			} else if (locator.endsWith("_CSS")) {

				driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));

			} else if (locator.endsWith("_LINK")) {

				driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator)));

			}
			return true;
			// close try block
		} catch (Throwable t) {

			return false;
		}

	}

	public void type(String locator, String value) {

		if (locator.endsWith("_XPATH")) {

			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_ID")) {

			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);

		} else if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);

		} else if (locator.endsWith("_LINK")) {

			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);

		}

	}

}
