$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactUs.feature");
formatter.feature({
  "line": 2,
  "name": "Contact Us page",
  "description": "As an end user\r\nI want a contact us page\r\nSo that I can find more about QAWorks exciting services!!",
  "id": "contact-us-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Valid Submission",
  "description": "",
  "id": "contact-us-page;valid-submission",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on \"QAWorks_site\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Contact tab on menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be able to contact QAWorks by entering \"\u003cname\u003e\", \"\u003cemail\u003e\" and \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "contact-us-page;valid-submission;",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "message"
      ],
      "line": 12,
      "id": "contact-us-page;valid-submission;;1"
    },
    {
      "cells": [
        "j.Bloggs",
        "j.Bloggs@qaworks.com",
        "please contact me I want to find out more"
      ],
      "line": 13,
      "id": "contact-us-page;valid-submission;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Valid Submission",
  "description": "",
  "id": "contact-us-page;valid-submission;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on \"QAWorks_site\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Contact tab on menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be able to contact QAWorks by entering \"j.Bloggs\", \"j.Bloggs@qaworks.com\" and \"please contact me I want to find out more\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "QAWorks_site",
      "offset": 9
    }
  ],
  "location": "Contact_Us_Step_def.i_am_on(String)"
});
formatter.result({
  "duration": 11120881864,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Us_Step_def.i_click_on_Contact_tab_on_menu()"
});
formatter.result({
  "duration": 373028687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "j.Bloggs",
      "offset": 49
    },
    {
      "val": "j.Bloggs@qaworks.com",
      "offset": 61
    },
    {
      "val": "please contact me I want to find out more",
      "offset": 88
    }
  ],
  "location": "Contact_Us_Step_def.i_should_be_able_to_contact_QAWorks_by_entering_and(String,String,String)"
});
formatter.result({
  "duration": 2950331176,
  "status": "passed"
});
});