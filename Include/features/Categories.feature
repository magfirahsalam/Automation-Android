@Categories
Feature: Categories

  @ctgrs1
  Scenario: User search with available product name
    Given user open apps
    When user input available product name
    Then user can find the available product name

  @ctgrs2
  Scenario: User search with unavailable product name
    Given user already open application
    When user input unavailable product name
    Then user cannot find the unavailable product

  @ctgrs3
  Scenario: User search with blank product name
    Given user open app
    When user does not input product name
    Then user cannot find blank product

  @ctgrs4
  Scenario: User search with input space only
    Given user open  application seconhand
    When user  input prodcut name with double space
    Then user can find the random product contain double space

  @ctgrs5
  Scenario: user search product by categories
    Given user already open app secondhand
    When user select category
    Then user can find the product by the category

