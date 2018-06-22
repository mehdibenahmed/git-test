import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/div_CURA Healthcare Service'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/div_col-sm-8'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_username'), '')

WebUI.doubleClick(findTestObject('Page_CURA Healthcare Service/input_username'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_username'), 'John Doe')

WebUI.doubleClick(findTestObject('Page_CURA Healthcare Service/input_form-control'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 'Seoul CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Apply for hospital readm'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/label_None'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/span_glyphicon glyphicon-calen'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_26'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_comment'), 'ee')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

