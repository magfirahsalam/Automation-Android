@updateproduct
Feature: update product

  @prd004
  Scenario: seller success update product
    Given user success login
    When user click daftar jual
    And user choose product
    And user change product name
    And user change product price
    And user change product lokasi
    And user click button perbarui product
    Then product is updated

  @prd005
  Scenario: seller not success update product
    Given seller has login
    When user tap daftar jual
    And seler choose product
    And user input product name blank
    And user input product price blank
    And user input product location blank
    And user click button terbitkan
    Then product is not update and gave popup failed message