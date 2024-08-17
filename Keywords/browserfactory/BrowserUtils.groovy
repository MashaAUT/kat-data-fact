package browserfactory

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.server.DriverFactory

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class BrowserUtils {


	@Keyword
	def openBrowserWithURL(String url) {
		WebUI.openBrowser(url)
	}

	@Keyword
	def fillInput(String locator, String inputString) {
		WebElement input = WebUI.findWebElement(locator)
		WebUI.sendKeys(input, inputString)
	}
}