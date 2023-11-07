@offers
Feature: Offers

  @OFR000
  Scenario: Seller create product for offer
    Given Seller already login and on the homepage
    When Seller create the product
		Then Product is created and ready to be offered

  @OFR001
  Scenario: Buyer offer to buy product
    Given Buyer sucessfully login and landed on homepage
    When User search product
    And User select product
		And User click tertarik button
		And User input harga tawar
		And User click kirim button
		Then offer submitted awaiting seller respond
		
	@OFR002
	Scenario: Seller accepting buyer offer
		Given Buyer offer product
		When User tap acount icon
		And User tap product list icon
		And User tap Diminati tab
		And Select offer notification from buyer
		And User click Terima button
		Then Offer status become accepted
		
	@OFR003
	Scenario: Seller rejecting buyer offer
		Given Buyer offered a product
		When User tap navbar acount icon
		And User tap the product list icon
		And User tap Diminati to switch tab
		And Select the offer notification from buyer
		And User click on Tolak button
		Then Offer status become rejected
		
	@OFR004
	Scenario: Seller change offer status to finished
		Given Seller accept buyer offer
		When User click status button
		And User select finished status
		And User click the kirim button
		Then Offer status changed to sold
		
	@OFR005
	Scenario: Seller change offer status to cancelled
		Given Seller accepted buyer offer
		When User click on status button
		And User select cancel transaction status
		And User click button kirim
		Then Offer status changed to cancelled