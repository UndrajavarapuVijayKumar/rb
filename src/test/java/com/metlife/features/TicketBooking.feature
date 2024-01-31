@all @booking
Feature: Ticket Booking
  This file covers the following scenarios
  1.No Bussess Found
  2.One Bus Found
  3.Multiple Busses Found
@negative @sanity
  Scenario: No Busses Found
    Given I Log into redbus.in as a user
    When I update the source as "Jaipur"
    And I update the destination as "Chennai"
    And I choose the date as 4th of next month
    And I click on search Busses
    Then I should get the message "Oops! No buses found."
@positive @smoke
  Scenario Outline: One Bus Found
    Given I Log into redbus.in as a user
    When I update the source as "<src>"
    And I update the destination as "<dest>"
    And I choose the date as 4th of next month
    And I click on search Busses
    Then I should see one bus available
    Examples:
    |src|dest|
    |chennai|coimbatore|
    |Hyderabad|jaipur  |
    |Hyderabad|Thiruvananthapuram|

  #feature file consists of Gherkin code