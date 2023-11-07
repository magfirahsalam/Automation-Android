$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Categories.feature");
formatter.feature({
  "name": "Categories",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Categories"
    }
  ]
});
formatter.scenario({
  "name": "User search with available product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs1"
    }
  ]
});
formatter.step({
  "name": "user open apps",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_open_apps()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input available product name",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_input_available_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can find the available product name",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_can_find_the_available_prodcut_name()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search with unavailable product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs2"
    }
  ]
});
formatter.step({
  "name": "user already open application",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_already_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input unavailable product name",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_input_unavailable_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cannot find the unavailable product",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_cannot_find_the_unavailable_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search with blank product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs3"
    }
  ]
});
formatter.step({
  "name": "user open app",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_open_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user does not input product name",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_does_not_input_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cannot find blank product",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_cannot_find_blank_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search with input space only",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs4"
    }
  ]
});
formatter.step({
  "name": "user open  application seconhand",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_open_application_seconhand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  input prodcut name with double space",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_input_prodcut_name_with_double_space()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can find the random product contain double space",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_can_find_the_random_product_contain_double_space()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user search product by categories",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs5"
    }
  ]
});
formatter.step({
  "name": "user already open app secondhand",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_already_open_app_secondhand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select category",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_select_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can find the product by the category",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_can_find_the_product_by_the_category()"
});
formatter.result({
  "status": "passed"
});
});