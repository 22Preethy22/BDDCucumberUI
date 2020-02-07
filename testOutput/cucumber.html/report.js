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
  "name": "Click on New Custmer button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Fill the form Details",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewCustomer.launch_the_ING_browser()"
});
formatter.result({
  "duration": 20749013689,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.navigate_to_Orange_Everyday_bank_account()"
});
formatter.result({
  "duration": 7670644147,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.click_on_Open_Now_button()"
});
formatter.result({
  "duration": 199990557,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.click_on_New_Custmer_button()"
});
formatter.result({
  "duration": 62074914112,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.fill_the_form_Details()"
});
formatter.result({
  "duration": 3031564791,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});