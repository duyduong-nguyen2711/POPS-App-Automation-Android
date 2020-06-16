$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Demo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Update user info",
  "description": "",
  "id": "update-user-info",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12087372300,
  "status": "passed"
});
formatter.before({
  "duration": 36399376400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User open POPS app and navigate to Setting Page",
  "description": "",
  "id": "update-user-info;user-open-pops-app-and-navigate-to-setting-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is at Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User should see tutorial and click Got It",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User navigate to \"Account\"",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.stayAtHomePage()"
});
formatter.result({
  "duration": 140172500,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.confirmTutorial()"
});
formatter.result({
  "duration": 310561900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account",
      "offset": 18
    }
  ],
  "location": "CommonSteps.navigateToPage(String)"
});
formatter.result({
  "duration": 12750551400,
  "status": "passed"
});
formatter.after({
  "duration": 1079279400,
  "status": "passed"
});
