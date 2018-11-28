$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Positive test validating login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"http://www.qaclickacademy.com/\" site",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on login link in home page to land on secure sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that user has successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "login-into-application;positive-test-validating-login;;1"
    },
    {
      "cells": [
        "test99@gmail.com",
        "123456"
      ],
      "line": 12,
      "id": "login-into-application;positive-test-validating-login;;2"
    },
    {
      "cells": [
        "syfulislam41@gmail.com",
        "pass123"
      ],
      "line": 13,
      "id": "login-into-application;positive-test-validating-login;;3"
    },
    {
      "cells": [
        "test1234@gmail.com",
        "453548345"
      ],
      "line": 14,
      "id": "login-into-application;positive-test-validating-login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Positive test validating login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"http://www.qaclickacademy.com/\" site",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on login link in home page to land on secure sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"test99@gmail.com\" and \"123456\" and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that user has successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.initializeTheBrowserWithChrome()"
});
formatter.result({
  "duration": 3217359254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.qaclickacademy.com/",
      "offset": 13
    }
  ],
  "location": "stepDefinition.navigateToSite(String)"
});
formatter.result({
  "duration": 7693252606,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.clickOnLoginLinkInHomePageToLandOnSecureSignInPage()"
});
formatter.result({
  "duration": 6788305127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test99@gmail.com",
      "offset": 13
    },
    {
      "val": "123456",
      "offset": 36
    }
  ],
  "location": "stepDefinition.userEntersAndAndLogsIn(String,String)"
});
formatter.result({
  "duration": 2708396690,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifyThatUserHasSuccessfullyLoggedIn()"
});
formatter.result({
  "duration": 18506,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.closeTheBrowser()"
});
formatter.result({
  "duration": 503237524,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Positive test validating login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"http://www.qaclickacademy.com/\" site",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on login link in home page to land on secure sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"syfulislam41@gmail.com\" and \"pass123\" and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that user has successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.initializeTheBrowserWithChrome()"
});
formatter.result({
  "duration": 3172670324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.qaclickacademy.com/",
      "offset": 13
    }
  ],
  "location": "stepDefinition.navigateToSite(String)"
});
formatter.result({
  "duration": 8497481641,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.clickOnLoginLinkInHomePageToLandOnSecureSignInPage()"
});
formatter.result({
  "duration": 6144413704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "syfulislam41@gmail.com",
      "offset": 13
    },
    {
      "val": "pass123",
      "offset": 42
    }
  ],
  "location": "stepDefinition.userEntersAndAndLogsIn(String,String)"
});
formatter.result({
  "duration": 1229398442,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifyThatUserHasSuccessfullyLoggedIn()"
});
formatter.result({
  "duration": 17478,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.closeTheBrowser()"
});
formatter.result({
  "duration": 441591949,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Positive test validating login",
  "description": "",
  "id": "login-into-application;positive-test-validating-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"http://www.qaclickacademy.com/\" site",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on login link in home page to land on secure sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"test1234@gmail.com\" and \"453548345\" and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that user has successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.initializeTheBrowserWithChrome()"
});
formatter.result({
  "duration": 3171729089,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.qaclickacademy.com/",
      "offset": 13
    }
  ],
  "location": "stepDefinition.navigateToSite(String)"
});
formatter.result({
  "duration": 7364362257,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.clickOnLoginLinkInHomePageToLandOnSecureSignInPage()"
});
formatter.result({
  "duration": 5930263700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1234@gmail.com",
      "offset": 13
    },
    {
      "val": "453548345",
      "offset": 38
    }
  ],
  "location": "stepDefinition.userEntersAndAndLogsIn(String,String)"
});
formatter.result({
  "duration": 1355434650,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifyThatUserHasSuccessfullyLoggedIn()"
});
formatter.result({
  "duration": 21077,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.closeTheBrowser()"
});
formatter.result({
  "duration": 450670689,
  "status": "passed"
});
});