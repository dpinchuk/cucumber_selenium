Feature: Testing site Home page

  @darksky_search_temperature
  Scenario: Search for the current temperature of the region and comparison with the range of low and high values
    Given Goto
    When Clear search text field
    And Enter address or zipcode into the search field "07432"
    And Click on search magnifying glass
    And Verify current temperature is between low and high value