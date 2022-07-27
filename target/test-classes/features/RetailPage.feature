@retailPageFeature
Feature: Retail Page Feature

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username and password
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company    | website                       | taxID | paymentMethod |
      | tekschool1 | http://tek-school.com/retail/ | 40500 | Cheque Test   |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @test2
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | KeyBnk   | 552201224 |      2028 | AleeBaBa    |    1444524321 |
    And User click on Continue button1
    Then User should see a success message

  @test3
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email                       | telephone    |
      | Habib    | Elham    | HabibIlham@gmail.com | 444-505-6666 |
    And User click on continue button2
    Then User should see a message 'Success: Your account has been successfully updated.'
