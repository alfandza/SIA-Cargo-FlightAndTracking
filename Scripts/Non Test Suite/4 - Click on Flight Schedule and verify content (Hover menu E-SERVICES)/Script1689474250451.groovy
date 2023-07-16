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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'siacargo.siacargokeyword.urlNavigation'()

CustomKeywords.'siacargo.siacargokeyword.hoverEService'()

WebUI.click(findTestObject('SIACargo Flight Schedule/Page_Singapore Airlines Cargo  International Airfreight Services/a_Flight Schedule'))

WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Flight Schedule_origin'), 
    0)

WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Origin_destination'), 
    0)

WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Destination_fromFlightDate'), 
    0)

WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/button_SEARCH'), 
    0)

