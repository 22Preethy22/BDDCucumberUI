$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/hcl/demo/feature/UITest.feature");
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
  "name": "Fill the form Details",
  "rows": [
    {
      "cells": [
        "nationality",
        "title",
        "givenName",
        "familyName",
        "emailAddress",
        "mobile",
        "dateOfBirth(dd/mm/yyyy)",
        "placeOfBirth",
        "countryOfBirth",
        "address",
        "SecurityQues"
      ],
      "line": 6
    },
    {
      "cells": [
        "India",
        "Mr",
        "Smith",
        "jsmith@test.com",
        "jsmith@test.com",
        "0403422132",
        "05/12/1992",
        "QueensLand",
        "India",
        "65 Keehner Entrance , MARTIN WA 6110",
        "queen"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Validate the Success Message",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewCustomer.launch_the_ING_browser()"
});
formatter.result({
  "duration": 15993664202,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.fill_the_form_Details(DataTable)"
});
formatter.result({
  "duration": 1895787072,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.extractInterfaces(EventFiringWebDriver.java:120)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.access$300(EventFiringWebDriver.java:69)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement.\u003cinit\u003e(EventFiringWebDriver.java:397)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement.\u003cinit\u003e(EventFiringWebDriver.java:389)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.createWebElement(EventFiringWebDriver.java:327)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:196)\r\n\tat com.hcl.demo.utilities.Utility.selectRadioButtonResponse(Utility.java:15)\r\n\tat com.hcl.demo.pages.CreateEveryDayNewCustomerPage.fillDetailsInOrangeEverydayPage(CreateEveryDayNewCustomerPage.java:166)\r\n\tat com.hcl.demo.stepdefinition.CreateNewCustomer.fill_the_form_Details(CreateNewCustomer.java:54)\r\n\tat ✽.When Fill the form Details(src/test/java/com/hcl/demo/feature/UITest.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateNewCustomer.click_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewCustomer.validate_the_Success_Message()"
});
formatter.result({
  "status": "skipped"
});
});