package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

/**
 * @author JuanTous 
 * generate random address
 *
 */
public class AddressRandom {

	@Keyword
	public String getRandomAddress() {
		String streetNumber = getRandomNumber(1, 100).toString()
		String streetName = getRandomWord(5, 10) // generate a random word with 5-10 characters
		String city = getRandomWord(5, 10) // generate a random word with 5-10 characters
		String state = getRandomState() // generate a random US state (you can modify this to generate a random state from a different country)
		String zipCode = getRandomZipCode() // generate a random 5-digit zip code

		return "$streetNumber $streetName, $city, $state $zipCode"
	}

	// helper methods to generate random data

	private String getRandomWord(int minChars, int maxChars) {
		int numChars = new Random().nextInt(maxChars - minChars + 1) + minChars
		String randomWord = ""
		for (int i = 0; i < numChars; i++) {
			int randomInt = new Random().nextInt(26)
			char randomChar = (char) ('a'.codePointAt(0) + randomInt)
			randomWord += randomChar
		}
		return randomWord
	}

	private String getRandomState() {
		String[] states = [
			"AL",
			"AK",
			"AZ",
			"AR",
			"CA",
			"CO",
			"CT",
			"DE",
			"FL",
			"GA",
			"HI",
			"ID",
			"IL",
			"IN",
			"IA",
			"KS",
			"KY",
			"LA",
			"ME",
			"MD",
			"MA",
			"MI",
			"MN",
			"MS",
			"MO",
			"MT",
			"NE",
			"NV",
			"NH",
			"NJ",
			"NM",
			"NY",
			"NC",
			"ND",
			"OH",
			"OK",
			"OR",
			"PA",
			"RI",
			"SC",
			"SD",
			"TN",
			"TX",
			"UT",
			"VT",
			"VA",
			"WA",
			"WV",
			"WI",
			"WY"
		]
		return states[new Random().nextInt(states.length)]
	}

	private String getRandomZipCode() {
		return new Random().nextInt(90000) + 10000
	}

	private int getRandomNumber(int min, int max) {
		return new Random().nextInt(max - min + 1) + min
	}
}
