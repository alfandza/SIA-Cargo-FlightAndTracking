package siacargo

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

public class siacargokeyword {

	@Keyword
	def urlNavigation() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.URL)

		WebUI.maximizeWindow()

		WebUI.verifyElementPresent(findTestObject('Object Repository/SIACargo Website/Image Homepage Check'), 5)

		WebUI.click(findTestObject('Object Repository/SIACargo Website/Accept Cookies'), FailureHandling.OPTIONAL)
	}

	@Keyword
	def hoverEService() {
		WebUI.mouseOver(findTestObject('SIACargo Website/Page_Singapore Airlines Cargo  International Airfreight Services/a_E-Services'))

		WebUI.verifyElementPresent(findTestObject('SIACargo Website/Page_Singapore Airlines Cargo  International Airfreight Services/ul_Flight ScheduleTrackingeTimetableeAWB'),
				0)

		WebUI.verifyElementPresent(findTestObject('SIACargo Website/Page_Singapore Airlines Cargo  International Airfreight Services/a_Flight Schedule'),
				0)

		WebUI.verifyElementPresent(findTestObject('SIACargo Website/Page_Singapore Airlines Cargo  International Airfreight Services/a_Tracking'),
				0)
	}

	@Keyword
	def clickTrackingPage() {
		hoverEService()
		WebUI.click(findTestObject('Object Repository/SIACargo Tracking/Page_Singapore Airlines Cargo  International Airfreight Services/a_Tracking'))

		WebUI.verifyElementPresent(findTestObject('SIACargo Tracking/Page_Tracking  Singapore Airlines Cargo  In_2e5191/p_You can search for a maximum of 10 AWB numbers'),
				0)

		WebUI.verifyElementPresent(findTestObject('SIACargo Tracking/Page_Tracking  Singapore Airlines Cargo  In_2e5191/input_Tracking_awbInput'),
				0)
	}

	@Keyword
	def clickFlightSchedulePage() {
		hoverEService()
		WebUI.click(findTestObject('SIACargo Flight Schedule/Page_Singapore Airlines Cargo  International Airfreight Services/a_Flight Schedule'))

		WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Flight Schedule_origin'),
				0)

		WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Origin_destination'),
				0)

		WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Destination_fromFlightDate'),
				0)

		WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/button_SEARCH'),
				0)
	}
}
