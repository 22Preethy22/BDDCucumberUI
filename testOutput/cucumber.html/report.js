$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("in.com.hcl.INGSubmitForm.feature");
formatter.feature({
  "line": 1,
  "name": "Create New ING Customer",
  "description": "",
  "id": "create-new-ing-customer",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a new Custmer",
  "description": "",
  "id": "create-new-ing-customer;create-a-new-custmer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@UItest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "launch the ING browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to Orange Everyday bank account",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#now filling the form"
    }
  ],
  "line": 7,
  "name": "Click on Open Now button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Fill the form Details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on \"Continue\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewCustomer.launch_the_ING_browser()"
});
formatter.result({
  "duration": 38498341974,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.navigate_to_Orange_Everyday_bank_account()"
});
formatter.result({
  "duration": 8633701651,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.click_on_Open_Now_button()"
});
formatter.result({
  "duration": 185794508,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.fill_the_form_Details()"
});
formatter.result({
  "duration": 10089527726,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027singleOrJointButtons\u0027]//label[contains(text(),\u0027Single\u0027)]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LP-5CD9174BD1\u0027, ip: \u0027192.168.43.139\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\ankitasr\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:53492}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d1b085065312b36dc00a86d21d9ee1ef\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027singleOrJointButtons\u0027]//label[contains(text(),\u0027Single\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat in.com.hcl.stepdefinition.CreateNewCustomer.fill_the_form_Details(CreateNewCustomer.java:99)\r\n\tat ✽.And Fill the form Details(in.com.hcl.INGSubmitForm.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue",
      "offset": 10
    }
  ],
  "location": "CreateNewCustomer.click_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
});