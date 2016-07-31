$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/twitterTest.feature");
formatter.feature({
  "line": 2,
  "name": "Twitter - interview Nicolas Mori",
  "description": "",
  "id": "twitter---interview-nicolas-mori",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@twiterSimpleTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Access to twitter and write a post.",
  "description": "",
  "id": "twitter---interview-nicolas-mori;access-to-twitter-and-write-a-post.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I access to the browser \"\u003cbrowser\u003e\" and the path \"\u003cproject_location\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I access to the \"\u003curl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I press in the button login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "in the field username I access the \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "in the field password I access the \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I press in the button access",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the correct access to the dashboard",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "twitter---interview-nicolas-mori;access-to-twitter-and-write-a-post.;",
  "rows": [
    {
      "cells": [
        "browser",
        "username",
        "password",
        "url",
        "project_location"
      ],
      "line": 15,
      "id": "twitter---interview-nicolas-mori;access-to-twitter-and-write-a-post.;;1"
    },
    {
      "cells": [
        "chrome",
        "nicolas.mori+1@gmail.com",
        "a4610b",
        "https://twitter.com/?lang\u003des",
        "/Users/nico/Documents/workspace/twitter_example/"
      ],
      "line": 16,
      "id": "twitter---interview-nicolas-mori;access-to-twitter-and-write-a-post.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Access to twitter and write a post.",
  "description": "",
  "id": "twitter---interview-nicolas-mori;access-to-twitter-and-write-a-post.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@twiterSimpleTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I access to the browser \"chrome\" and the path \"/Users/nico/Documents/workspace/twitter_example/\"",
  "matchedColumns": [
    0,
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I access to the \"https://twitter.com/?lang\u003des\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I press in the button login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "in the field username I access the \"nicolas.mori+1@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "in the field password I access the \"a4610b\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I press in the button access",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the correct access to the dashboard",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 25
    },
    {
      "val": "/Users/nico/Documents/workspace/twitter_example/",
      "offset": 47
    }
  ],
  "location": "Steps.accessTheBrowser(String,String)"
});
formatter.result({
  "duration": 2032189100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://twitter.com/?lang\u003des",
      "offset": 17
    }
  ],
  "location": "Steps.accessToTheURL(String)"
});
formatter.result({
  "duration": 3885075555,
  "status": "passed"
});
formatter.match({
  "location": "Steps.validTheCorrectDeploy()"
});
formatter.result({
  "duration": 123415511,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nicolas.mori+1@gmail.com",
      "offset": 36
    }
  ],
  "location": "Steps.accessUserName(String)"
});
formatter.result({
  "duration": 267578742,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a4610b",
      "offset": 36
    }
  ],
  "location": "Steps.accessPassword(String)"
});
formatter.result({
  "duration": 88131299,
  "status": "passed"
});
formatter.match({
  "location": "Steps.pressButtonSubmit()"
});
formatter.result({
  "duration": 2479747351,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verifyAccess()"
});
formatter.result({
  "duration": 64331856,
  "status": "passed"
});
formatter.after({
  "duration": 82790931,
  "status": "passed"
});
});