import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import junit.framework.Assert as Assert
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.URL)

String inputName = CustomKeywords.'utils.DataRandomFactory.getRandomName'(1, 6)

WebUI.setText(findTestObject('homepage/input-name'), inputName)

String inputLastName = CustomKeywords.'utils.DataRandomFactory.getRandomLastName'()

WebUI.setText(findTestObject('homepage/input-last-name'), inputLastName)

String inputEmail = CustomKeywords.'utils.DataRandomFactory.getRandomEmail'()

WebUI.setText(findTestObject('homepage/input-email'), inputEmail)

CustomKeywords.'browserfactory.FormUtils.clickOnOptionElement'(genero)

String phoneNumber = CustomKeywords.'utils.DataRandomFactory.getRandomPhoneNumberCol'()

WebUI.setText(findTestObject('homepage/phonenumberinput'), phoneNumber)

WebUI.click(findTestObject('datapicker/input-date-picker'))

WebUI.click(findTestObject('datapicker/comboMonthTarget'))

CustomKeywords.'browserfactory.FormUtils.clickOnOptionElement'(month)

WebUI.click(findTestObject('datapicker/cmx-year'))

CustomKeywords.'browserfactory.FormUtils.clickOnOptionElement'(year)

CustomKeywords.'browserfactory.FormUtils.selectNumberCalendar'(dia)

WebUI.scrollToPosition(500, 500)

WebUI.click(findTestObject('homepage/subject-input'))

CustomKeywords.'browserfactory.FormUtils.enterSubjectsText'('Mat', 'Bio', 'Phy')

CustomKeywords.'browserfactory.FormUtils.clickOnOptionElement'(hobbies)

CustomKeywords.'browserfactory.FormUtils.attachFile'('/home/usertty/Pictures/.ENV/.katalon/katalon-selenium01.png')

String randomAddress = CustomKeywords.'utils.AddressRandom.getRandomAddress'()

WebUI.setText(findTestObject('homepage/current-address'), randomAddress)

WebUI.click(findTestObject('homepage/state-cmx'))

CustomKeywords.'browserfactory.FormUtils.clickOnOptionElement'(state)

WebUI.click(findTestObject('homepage/city-cmx'))

CustomKeywords.'browserfactory.FormUtils.clickOnOptionElement'(city)

WebUI.click(findTestObject('homepage/submit-button'))

WebUI.click(findTestObject('modal/button-modal'))

