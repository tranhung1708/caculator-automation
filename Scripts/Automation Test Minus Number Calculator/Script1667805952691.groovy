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

Windows.startApplicationWithTitle('C:\\Windows\\System32\\calc.exe', 'Calculator')

Windows.click(findWindowsObject('Object Repository/Button Nine'))

Windows.click(findWindowsObject('Object Repository/Button Four'))

Windows.click(findWindowsObject('Object Repository/Button Minus'))

Windows.click(findWindowsObject('Object Repository/Button Six'))

Windows.click(findWindowsObject('Object Repository/Button Equals'))

String result = Windows.getText(findWindowsObject('Object Repository/Display Result'))

def extractInts( String input ) {
	input.findAll( /-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )*.toInteger()
}

if (extractInts(result)[0] == 88) {
	System.out.println("Hoàn thành")
} else {
	Windows.click(findWindowsObject('ERROR'))
}

Windows.closeApplication()