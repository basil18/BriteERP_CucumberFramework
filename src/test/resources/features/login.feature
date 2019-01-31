@temp
  Feature: Login tests
    Background: user / manager should go to home page
      Given the user goes to url
      When the user cliks on BriteErpDemo button
      Then the title should be Login | Website localhost
      And the database should be BriteErpDemo


        @manager @smoke
      Scenario: Positive login test
        When the manager enters valid email address
        And the manager enters valid password
        And the manager clicks Log in button
        Then the title should be #Inbox - Odoo


