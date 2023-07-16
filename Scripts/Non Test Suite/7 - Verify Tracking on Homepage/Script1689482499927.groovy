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

WebUI.verifyElementPresent(findTestObject('SIACargo Website/Tracking/Tracking Active'), 0)

WebUI.scrollToElement(findTestObject('SIACargo Website/Tracking/Tracking Active'), 0)

WebUI.verifyElementPresent(findTestObject('SIACargo Tracking/Page_Tracking  Singapore Airlines Cargo  In_2e5191/p_You can search for a maximum of 10 AWB numbers'), 
    0)

WebUI.verifyElementPresent(findTestObject('SIACargo Tracking/Page_Tracking  Singapore Airlines Cargo  In_2e5191/input_Tracking_awbInput'), 
    0)

