Feature: A user can successfully find a company on the companies house website

  @test
  Scenario: Visit a page and check the page title
    Given I go to url 'https://www.gov.uk/government/organisations/companies-house'
    And I select the 'Find company information' link
    Then I should be on the 'Get information about a company' page


