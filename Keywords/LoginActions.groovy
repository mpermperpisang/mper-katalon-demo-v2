import com.kms.katalon.core.testobject.ObjectRepository as OR  // ✅ Import Object Repository
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import Config.UserData

class LoginActions {
	static void loginAsStandardUser() {
		WebUI.setText(OR.findTestObject('SauceDemo/LoginPage/UsernameField'), UserData.STANDARD_USER)
		WebUI.setText(OR.findTestObject('SauceDemo/LoginPage/PasswordField'), UserData.PASSWORD)
		WebUI.click(OR.findTestObject('SauceDemo/LoginPage/LoginButton'))
	}
}
