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
  "comments": [
    {
      "line": 5,
      "value": "#When Navigate to Orange Everyday bank account"
    },
    {
      "line": 6,
      "value": "#now filling the form"
    },
    {
      "line": 7,
      "value": "#And Click on Open Now button"
    }
  ],
  "line": 8,
  "name": "Fill the form Details",
  "rows": [
    {
      "cells": [
        "country",
        "INDIA"
      ],
      "line": 9
    },
    {
      "comments": [
        {
          "line": 10,
          "value": "#|title|Mr|"
        }
      ],
      "cells": [
        "givenName",
        "John"
      ],
      "line": 11
    },
    {
      "cells": [
        "familyName",
        "Smith"
      ],
      "line": 12
    },
    {
      "cells": [
        "emailAddress",
        "jsmith@test.com"
      ],
      "line": 13
    },
    {
      "cells": [
        "mobile",
        "0465789765"
      ],
      "line": 14
    },
    {
      "cells": [
        "dateOfBirth(dd/mm/yyyy)",
        "19/03/1995"
      ],
      "line": 15
    },
    {
      "cells": [
        "placeOfBirth",
        "QueensLand"
      ],
      "line": 16
    },
    {
      "cells": [
        "address",
        "65 Keehner Entrance , MARTIN WA 6110"
      ],
      "line": 17
    },
    {
      "cells": [
        "SecurityQues",
        "queen"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Validate the Success Message",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewCustomer.launch_the_ING_browser()"
});
formatter.result({
  "duration": 76546169957,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.fill_the_form_Details(DataTable)"
});
formatter.result({
  "duration": 15308707418,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.click_on_Continue_button()"
});
formatter.result({
  "duration": 172499465,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustomer.validate_the_Success_Message()"
});
formatter.result({
  "duration": 30206,
  "status": "passed"
});
});