@test
Feature: Contact Us page
  As an end user
  I want a contact us page
  So that I can find more about QAWorks exciting services!!

  Scenario Outline: Valid Submission
    Given I am on "QAWorks_site"
    When I click on Contact tab on menu
    Then I should be able to contact QAWorks by entering "<name>", "<email>" and "<message>"
    Examples:
      | name     | email                | message                                   |
      | j.Bloggs | j.Bloggs@qaworks.com | please contact me I want to find out more |