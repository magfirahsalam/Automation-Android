@deleteproduct
Feature: delete product

  @del001
  Scenario: user success delete product
    Given user ready login
    When user click button daftar jual
    And user select product
    And user click button delete
    And user click pesan hapus
		Then user success delete product