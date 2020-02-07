$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("INGBanking.feature");
formatter.feature({
  "line": 1,
  "name": "Banking Application",
  "description": "",
  "id": "banking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Launch HomePage",
  "description": "",
  "id": "banking-application;launch-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "clicks on Bank and Save",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on Personal Term Deposit",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Personal Term Deposit Page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "INGBankingStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 13980420549,
  "status": "passed"
});
formatter.match({
  "location": "INGBankingStepDefinition.clicks_on_bank_and_Save()"
});
formatter.result({
  "duration": 138177946,
  "status": "passed"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_click_on_personal_Term_Deposit()"
});
formatter.result({
  "duration": 5238871184,
  "status": "passed"
});
formatter.match({
  "location": "INGBankingStepDefinition.personal_term_deposit_page_is_populated()"
});
formatter.result({
  "duration": 10573394,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Launch Personal Deposit Page",
  "description": "",
  "id": "banking-application;launch-personal-deposit-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on Personal Deposit Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user clicks on OpenNow",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters with following details",
  "rows": [
    {
      "cells": [
        "INDIA",
        "Ram",
        "Dasaradh",
        "Raghuvamasha",
        "06/02/2020",
        "Ayodhya",
        "INDIA",
        "sita@gmail.com",
        "991627785",
        "6361550433",
        "AYODHYA-001",
        "Kousalya"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Open a Personal Term Deposit",
  "keyword": "Then "
});
formatter.match({
  "location": "INGBankingStepDefinition.user_is_on_personal_deposit_page()"
});
formatter.result({
  "duration": 8324523,
  "status": "passed"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_clicks_on_opennow()"
});
formatter.result({
  "duration": 20821943484,
  "status": "passed"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_enters_with_following_details(DataTable)"
});
formatter.result({
  "duration": 6653124103,
  "status": "passed"
});
formatter.match({
  "location": "INGBankingStepDefinition.open_a_personal_term_deposit()"
});
formatter.result({
  "duration": 15481,
  "status": "passed"
});
});