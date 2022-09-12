$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/a.feature");
formatter.feature({
  "name": "To validate the travigo functionality  application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the booking functionality of an application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user should be in travigo login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionC.the_user_should_be_in_travigo_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill the location",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionC.the_user_has_to_fill_the_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to select in checkin and checkout date",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionC.the_user_has_to_select_in_checkin_and_checkout_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to select option as adults and rooms",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionC.the_user_has_to_select_option_as_adults_and_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionC.the_user_has_to_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to select rating only option and checkout the prices",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionC.the_user_has_to_select_rating_only_option_and_checkout_the_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to the booking page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionC.the_user_should_navigate_to_the_booking_page()"
});
formatter.result({
  "status": "passed"
});
});