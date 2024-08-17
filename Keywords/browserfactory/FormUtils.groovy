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

















	/**
	 * Clicks on an option with the given gender.
	 *
	 * @param gender the gender option to click on
	 */

	/*
	 @Keyword
	 def clickOnOption01(String gender) {
	 // Define the XPath locator with a more specific and efficient way
	 String xpath = "//option[contains(text(), '$gender')]"
	 try {
	 // Use a more concise way to find the element and perform the click action
	 miDriver.findElement(By.xpath(xpath)).click()
	 } catch (NoSuchElementException e) {
	 // Handle the case when the element is not found
	 println "Error: Option '$gender' not found."
	 } catch (Exception e) {
	 // Handle any other unexpected errors
	 println "Error: Unable to click on option '$gender'. ${e.getMessage()}"
	 }
	 }
	 */
}
