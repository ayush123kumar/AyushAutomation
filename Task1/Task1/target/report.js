$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage with three slides",
  "description": "",
  "id": "homepage-with-three-slides",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "checking three slides",
  "description": "",
  "id": "homepage-with-three-slides;checking-three-slides",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user click on shop Menu",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on home Menu btn",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user is on home page with three slides",
  "keyword": "Then "
});
formatter.match({
  "location": "InfoStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 47234264600,
  "status": "passed"
});
formatter.match({
  "location": "InfoStepDef.user_click_on_shop_Menu()"
});
formatter.result({
  "duration": 6344359700,
  "status": "passed"
});
formatter.match({
  "location": "InfoStepDef.user_clicks_on_home_Menu_btn()"
});
formatter.result({
  "duration": 5152466500,
  "status": "passed"
});
formatter.match({
  "location": "InfoStepDef.user_is_on_home_page_with_three_slides()"
});
formatter.result({
  "duration": 265250800,
  "status": "passed"
});
});