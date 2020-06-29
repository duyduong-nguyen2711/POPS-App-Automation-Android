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
  "duration": 12633150900,
  "status": "passed"
});
formatter.before({
  "duration": 7658899000,
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
formatter.step({
  "line": 10,
  "name": "User open Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User open Sign Up page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Register button should be disabled to click",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User sign up with incorrect info",
  "rows": [
    {
      "cells": [
        "Automation test",
        "popsautomationtest",
        "123456",
        "Invalid email. Please check if your email has been entered correctly."
      ],
      "line": 14
    },
    {
      "cells": [
        "Automation test",
        "popsautomationtest@gmail",
        "123456",
        "Invalid email. Please check if your email has been entered correctly."
      ],
      "line": 15
    },
    {
      "cells": [
        "Automation test",
        "popsautomationtest@gmail.com",
        "1",
        "Please enter a password with at least 6 characters."
      ],
      "line": 16
    },
    {
      "cells": [
        "Automation test",
        "duyduong.nguyen@pops.vn",
        "123456",
        "This account was exist in system"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User sign up with correct info",
  "rows": [
    {
      "cells": [
        "Automation test",
        "popsautomationtest",
        "123456"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User confirm pops up in active page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User activate account successful",
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.stayAtHomePage()"
});
formatter.result({
  "duration": 131346200,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.confirmTutorial()"
});
formatter.result({
  "duration": 5692957100,
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
  "duration": 2878813699,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.openLoginPage()"
});
formatter.result({
  "duration": 36001408099,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.openSignUpPage()"
});
formatter.result({
  "duration": 1397544900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.checkRegisterButton()"
});
formatter.result({
  "duration": 1832306699,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.signUpWithIncorrectInfo(DataTable)"
});
formatter.result({
  "duration": 26117545699,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.signUpWithCorrectInfo(DataTable)"
});
formatter.result({
  "duration": 13786318600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.confirmActivePopUps()"
});
formatter.result({
  "duration": 160119699,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.activateAccount()"
});
