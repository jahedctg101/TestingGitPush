$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazon_Product_Verification.feature");
formatter.feature({
  "name": "Amazon Product List Verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Amazon Product List",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the Amazon Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.amazon_product_page_Verification.i_am_in_the_amazon_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change the delivery location",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.amazon_product_page_Verification.i_change_the_delivery_location()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d97.0.4692.99)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-GHGPJID\u0027, ip: \u0027192.168.0.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 97.0.4692.99, chrome: {chromedriverVersion: 97.0.4692.71 (adefa7837d02a..., userDataDir: C:\\Users\\Dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:64308}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1748aa3b6252715d8a5fb32d43211091\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat pages.Homepage.clickOnDelivery(Homepage.java:22)\r\n\tat stepDefinations.amazon_product_page_Verification.i_change_the_delivery_location(amazon_product_page_Verification.java:30)\r\n\tat ✽.I change the delivery location(file:///C:/Batch2021-JUNE-SDET/JAVA/workspace/amazonProduct_List/src/test/resources/features/amazon_Product_Verification.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I seacrh Product",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.amazon_product_page_Verification.i_seacrh_Product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Product page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.amazon_product_page_Verification.verify_Product_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});