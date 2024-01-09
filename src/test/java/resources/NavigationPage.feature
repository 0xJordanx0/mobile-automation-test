Feature: Use The Navigation Page
  Background:
    Given User is on the navigation page

  Scenario Outline: Enter some value
    When User enters the value as "<value>"
    Then User should be able to see the value printed on the screen
    Examples:
      | value
      | tester