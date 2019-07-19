$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/A08019DIRP_C2B.02.14/workspace/cucumber/src/resources/java/cucumber4.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "users must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the below credentials",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "abc",
        "",
        "abc123"
      ],
      "line": 7
    },
    {
      "cells": [
        "xyz",
        "",
        "xyz12"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "users must be in the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumber4_stepdef.users_must_be_registered()"
});
formatter.result({
  "duration": 155905700,
  "status": "passed"
});
formatter.match({
  "location": "cucumber4_stepdef.user_enters_the_below_credentials(DataTable)"
});
formatter.result({
  "duration": 3460800,
  "status": "passed"
});
formatter.match({
  "location": "cucumber4_stepdef.users_must_be_in_the_home_page()"
});
formatter.result({
  "duration": 192900,
  "status": "passed"
});
});