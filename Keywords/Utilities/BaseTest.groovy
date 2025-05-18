package Utilities

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import Config.TestConfig

class BaseTest {
	static void setUp() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(TestConfig.BASE_URL)  // ✅ Use BASE_URL
	}

	static void tearDown() {
		WebUI.closeBrowser()
	}
}
