package browserfactory

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory


public class FormUtils {
	WebDriver miDriver
	WebElement element;
	Actions action;


	/**
	 * @param Dinamyc Click 
	 * [Very hard to do it] 
	 * [guess why?] -> R/ Driver instance ≠ Selenium
	 * @return
	 */
	@Keyword
	def clickOnOptionElement(String gender) {
		miDriver = DriverFactory.getWebDriver()
		element = miDriver.findElement(By.xpath("//*[contains(text(),'$gender')]"))
		element.click()
	}

	@Keyword
	def clickOnOption(String gender) {
		element = miDriver.findElement(By.xpath("//*[contains(text(),'$gender')]"))
		action = new Actions(miDriver)
		action.moveToElement(element).click().perform()
	}
}
