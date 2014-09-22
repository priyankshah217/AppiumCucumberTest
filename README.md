AppiumTestAutomation
====================

This is implementation of PageFactory framework with Appium for Android device.

Current framework provide basic implementation of PageFactory frame and demostrated on native android application.

The same implementation for mobile sites and Hybrid apps will be covered later.


Prerequisite
=====================
1. Android SDK
2. Appium
3. Maven (For managing dependencies)
4. Eclipse

Installation
=====================
1. Install from git
2. Run "mvn clean install" from project directory
3. Run as testNG from eclipse

Script Description
=====================
1. AppiumApiDemoAppTests:
	* apk Name: ApiDemos-debug.apk
	* apk Location: /src/test/resources
	* Type of Application: Native
	* Gesture Simulated: Swipe/Scroll

2. AppiumSelendroidAppTests:
	* apk Name: selendroid-test-app.apk
	* apk Location: /src/test/resources
	* Type of Application: Hybrid
	* Gesture Simulated: Swipe/Scroll

3. AppiumGoogleSearchMobileWebTests:
	* apk Name: N/A
	* apk Location: N/A
	* Type of Application: Mobile app

(**Tip**: Mobile web can be simulated in machine's firefox browsers and recorded script using Selenium IDE. "User Agent Overrider" plug in required to be download, which emulate mobile site in firefox browser.)
	
	
Integration with Jenkins
=====================
To be done

( **Note**: All scripts have been tested on real device (Nexus 5))
