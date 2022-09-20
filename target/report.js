$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/FaceBook.feature");
formatter.feature({
  "name": "validation of Login functionality in facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validation of Login with  invalid Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters  invalid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters invalid  password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "logan",
        "kumar"
      ]
    },
    {
      "cells": [
        "kumar",
        "logan"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user lanch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsFb.user_lanch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify Error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsFb.user_verify_Error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of Login with  invalid Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters  invalid username \"logan\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsFb.user_enters_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid  password \"kumar\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsFb.user_enters_invalid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFb.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user lanch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsFb.user_lanch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify Error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsFb.user_verify_Error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of Login with  invalid Details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters  invalid username \"kumar\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsFb.user_enters_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid  password \"logan\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsFb.user_enters_invalid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFb.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
});