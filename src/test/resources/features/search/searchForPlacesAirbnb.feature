Feature: Search for a places on Airbnb

  Scenario: Search for a place to stay on Airbnb with filters
    Given Picps is on the Airbnb homepage
    When he search for "Los Angeles" and 2 adult guests
    And he select the price range 600000 - 650000 as filter
    Then he should see a place with the conditions he is looking for
