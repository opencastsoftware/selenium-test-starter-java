Feature: Visit a page and click on a link

  @test
  Scenario: Visit a page and check the page title
    Given I go to url 'https://www.gov.uk/government/organisations/companies-house'
    And I select the 'Find company information' on the menu bar
    Then I should be on the 'Get information about a company' page


