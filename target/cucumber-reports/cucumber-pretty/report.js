$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Demo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Update user info",
  "description": "",
  "id": "update-user-info",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12551559600,
  "status": "passed"
});
formatter.before({
  "duration": 8078954400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User open POPS app and navigate to Setting Page",
  "description": "",
  "id": "update-user-info;user-open-pops-app-and-navigate-to-setting-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is at Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User should see tutorial and click Got It",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User navigate to \"Account\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User open Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User open Sign Up page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User sign up with incorrect info",
  "rows": [
    {
      "cells": [
        "Automation test",
        "popsautomationtest",
        "123456",
        "Invalid email. Please check if your email has been entered correctly"
      ],
      "line": 13
    },
    {
      "cells": [
        "Automation test",
        "popsautomationtest@gmail",
        "123456",
        "Invalid email. Please check if your email has been entered correctly"
      ],
      "line": 14
    },
    {
      "cells": [
        "Automation test",
        "popsautomationtest@gmail.com",
        "1",
        "Please enter a password with at least 6 characters"
      ],
      "line": 15
    },
    {
      "cells": [
        "Automation test",
        "duyduong.nguyen@pops.vn",
        "123456",
        "This account was exist in system"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.stayAtHomePage()"
});
formatter.result({
  "duration": 209083500,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.confirmTutorial()"
});
formatter.result({
  "duration": 36358729800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account",
      "offset": 18
    }
  ],
  "location": "CommonSteps.navigateToPage(String)"
});
formatter.result({
  "duration": 2734323700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.openLoginPage()"
});
formatter.result({
  "duration": 35483273600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.openSignUpPage()"
});
formatter.result({
  "duration": 1334776100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.signUpWithIncorrectInfo(DataTable)"
});
formatter.result({
  "duration": 63231934000,
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 4, Size: 4\r\n\tat java.util.ArrayList.rangeCheck(ArrayList.java:657)\r\n\tat java.util.ArrayList.get(ArrayList.java:433)\r\n\tat Suite.StepDefs.LoginSteps.signUpWithIncorrectInfo(LoginSteps.java:60)\r\n\tat ✽.And User sign up with incorrect info(Demo.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 12404900,
  "error_message": "org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CA--DUONGNGUYEN\u0027, ip: \u0027192.168.90.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {appActivity: com.popsworldwide.popsapp.M..., appPackage: com.popsworldwide.popsapp.s..., databaseEnabled: false, desired: {appActivity: com.popsworldwide.popsapp.M..., appPackage: com.popsworldwide.popsapp.s..., deviceName: sdk_gphone_x86, platformName: android, platformVersion: R, udid: emulator-5554}, deviceApiLevel: 29, deviceManufacturer: Google, deviceModel: sdk_gphone_x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 10, statBarHeight: 63, takesScreenshot: true, udid: emulator-5554, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: 2d39f1a7-b2d0-48fe-8d9a-f4a840341b8e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:45)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:452)\r\n\tat Suite.StepDefs.Hook.afterScenario(Hook.java:38)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat Suite.TestRunner.flowSteps(TestRunner.java:30)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:110)\r\n",
  "status": "failed"
});
