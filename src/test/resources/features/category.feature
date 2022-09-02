Feature: Check Category Pages

  As customer
  I want to be able to view the list of available product from a certain category

  @Start
  Scenario: Check Category Pages
    Given a main page is displayed
    When the user choose the category apparel
    Then the list of available products is displayed


