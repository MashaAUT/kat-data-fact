package browserfactory

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory


/**
 * @author [juanTous]
 * 	/**
 * [selenium ancient prophets]
 *	{@latamHands #JuanTous}
 */

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
	def clickOnOptionElement(String argument) {
		miDriver = DriverFactory.getWebDriver()
		element = miDriver.findElement(By.xpath("//*[contains(text(),'$argument')]"))
		element.click()
	}

	/**
	 * @param dateNumber
	 * @return [TestNg's crown jewel]
	 * 
	 * if you have experience with tesntNg 
	 * it's not necesary to create datapicker class
	 */
	@Keyword
	def selectNumberCalendar(String dateNumber) {
		miDriver = DriverFactory.getWebDriver()
		miDriver.findElement(By.xpath("//div[@aria-disabled='false' and text()='$dateNumber']")).click()
	}


	/**
	 * @param subjects
	 * @return [code culture] 
	 * 
	 */
	@Keyword
	def String enterSubjectsText(String... subjects) {
		miDriver = DriverFactory.getWebDriver()
		for (String subject : subjects) {
			miDriver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys(subject)
			miDriver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys(Keys.ENTER)
		}
	}


	/**
	 * @param filePath
	 * @return [file input element is not visible or enabled]
	 */
	@Keyword
	def attachFile(String filePath) {
		miDriver = DriverFactory.getWebDriver()
		try {
			def fileInput = miDriver.findElement(By.xpath("//input[@type='file']"))
			fileInput.sendKeys(filePath)
		} catch (Exception e) {
			println("Error attaching file: " + e.getMessage())
		}
	}

	@Keyword
	def clickOnOption(String gender) {
		element = miDriver.findElement(By.xpath("//*[contains(text(),'$gender')]"))
		action = new Actions(miDriver)
		action.moveToElement(element).click().perform()
	}


	@Keyword
	def selectComboOptions(String month) {
		miDriver = DriverFactory.getWebDriver()
		element = miDriver.findElement(By.xpath("//*[contains(text(),'$month')]"))
		element.click()
	}

	@Keyword
	def switchToModalById(String modalId) {
		miDriver = DriverFactory.getWebDriver()
		miDriver.switchTo().frame(miDriver.findElement(By.className(modalId)))
	}
}
