$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/project001_features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user, I want to be able to login into restful booker\n  to test web services",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@F0001"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login and verify table values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login_ddt_3"
    }
  ]
});
formatter.step({
  "name": "user is on the restful booker login page",
  "keyword": "When "
});
formatter.step({
  "name": "user navigates to \"\u003clink\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify title should be \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click on \"\u003cnavItem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify table values \"\u003cfirst\u003e\" , \"\u003csecond\u003e\" , \"\u003cthird\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "drivers",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "link",
        "title",
        "navItem",
        "first",
        "second",
        "third"
      ]
    },
    {
      "cells": [
        "API Docs",
        "Restful-booker",
        "GetBookingIds",
        "firstname",
        "lastname",
        "checkin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login and verify table values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@F0001"
    },
    {
      "name": "@login_ddt_3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the restful booker login page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user navigates to \"API Docs\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify title should be \"Restful-booker\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on \"GetBookingIds\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify table values \"firstname\" , \"lastname\" , \"checkin\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});