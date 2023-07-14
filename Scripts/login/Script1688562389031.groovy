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

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/Login/01_inputText_username'), 'Admin')
WebUI.setText(findTestObject('Object Repository/Login/02_inputText_password'), 'admin123')
WebUI.click(findTestObject('Object Repository/Login/03_clickButton'))
WebUI.click(findTestObject('Object Repository/Tab Admin/01_clickTabAdmin'))
WebUI.click(findTestObject('Object Repository/Tab Admin/02_clickButtonAdd'))
WebUI.click(findTestObject('Object Repository/Tab Admin/03_clickPaneluserRole'))
WebUI.click(findTestObject('Object Repository/Tab Admin/04_chooseUserrole', [('UserRole'):'ESS'] ) )
WebUI.click(findTestObject('Object Repository/Tab Admin/05_clickPanelstatus'))
WebUI.click(findTestObject('Object Repository/Tab Admin/06_clickChooseStatus', [('Status'):'Enabled'] ) )