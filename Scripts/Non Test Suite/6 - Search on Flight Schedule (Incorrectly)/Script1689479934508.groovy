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

CustomKeywords.'siacargo.siacargokeyword.clickFlightSchedulePage'()

WebUI.setText(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Flight Schedule_origin'), 
    origin)

WebUI.sendKeys(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Flight Schedule_origin'), 
    Keys.chord(Keys.ENTER))

WebUI.getAttribute(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Flight Schedule_origin'), 
    'value')

WebUI.setText(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Origin_destination'), 
    destination)

WebUI.sendKeys(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Origin_destination'), 
    Keys.chord(Keys.ENTER))

WebUI.getAttribute(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Origin_destination'), 
    'value')

WebUI.comment('Date variable must be 01 - 28/29/30/31 depending on last month date')

WebUI.comment('Month must be correctly written (January - December)')

WebUI.comment('Year must be correctly written (ex = 2023)')

if (date != '') {
    WebUI.click(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Destination_fromFlightDate'))

    String checkM = WebUI.getText(findTestObject('SIACargo Flight Schedule/Date Selection/Month Check'))

    String checkY = WebUI.getText(findTestObject('SIACargo Flight Schedule/Date Selection/Year Check'))

    if ((((checkM == month) && (checkY == year)) && (date != '')) || (((month == '') && (year == '')) && (date != ''))) {
        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date', [('date') : date]))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date Weekend', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date Weekend', [('date') : date]))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today', [('date') : date]))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today Weekend', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today Weekend', [('date') : date]))
        }
    } else if ((checkM != month) && (checkY == year)) {
        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Months'))

        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Choose Month', [('month') : month]))
    } else if ((checkM == month) && (checkY != year)) {
        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Years'))

        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Choose Year', [('year') : year]))
    } else if ((checkM != month) && (checkY != year)) {
        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Months'))

        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Choose Month', [('month') : month]))

        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Years'))

        WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Choose Year', [('year') : year]))

        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date', [('date') : date]))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date Weekend', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date Weekend', [('date') : date]))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today', [('date') : date]))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today Weekend', [('date') : date]), 
            2, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('SIACargo Flight Schedule/Date Selection/Date Today Weekend', [('date') : date]))
        }
    }
}

WebUI.click(findTestObject('Object Repository/SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/button_SEARCH'))

String checkValOrigin = WebUI.getAttribute(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Flight Schedule_origin'), 
    'value')

String checkValDest = WebUI.getAttribute(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Origin_destination'), 
    'value')

if (checkValOrigin == '') {
    WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Error Option/No Data Origin'), 5)
}

if (checkValDest == '') {
    WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Error Option/No Data Destination'), 5)
}

if (date == '') {
    WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Error Option/No Date'), 5)
}

if (WebUI.verifyElementPresent(findTestObject('SIACargo Flight Schedule/Error Option/Data Table'), 3, FailureHandling.OPTIONAL)) {
    int x = 2

    int i = 1

    while (x > 1) {
        if (flightNumber == '') {
            break
        }
        
        if (WebUI.verifyElementNotPresent(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/FlightDesc', 
                [('i') : i]), 2, FailureHandling.OPTIONAL)) {
            break
        }
        
        String flightNumCheck = WebUI.getText(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/FlightDesc', 
                [('i') : i]))

        if (flightNumCheck.contains(flightNumber)) {
            WebUI.scrollToElement(findTestObject('SIACargo Flight Schedule/Page_Flight Schedule  Singapore Airlines Ca_b65577/FlightDesc', 
                    [('i') : i]), 5)

            i++
        } else {
            i++
        }
    }
}

