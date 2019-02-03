@smoke @regression @login
  Feature: Login tests

    Background: user / manager should go to home page
      Given the user goes to url
      When the user clicks on BriteErpDemo button
      Then the title should be Login | Website localhost
       And the database should be BriteErpDemo

        @manager
      Scenario: Manager: Positive login test
        When the manager enters valid email address
         And the manager enters valid password
         And the manager clicks Log in button
        Then the title should be Odoo

        @manager
      Scenario: Manager: Negative login - wrong username
        When the manager enters wrong email address
         And the manager enters valid password
         And the manager clicks Log in button
        Then the title should be Login | Website localhost

        @manager
      Scenario: Manager: Negative login - wrong password
        When the manager enters valid email address
         And the manager enters wrong password
         And the manager clicks Log in button
        Then the title should be Login | Website localhost

        @manager
      Scenario: Manager: Negative login - missing username
        When the manager doesn't enter an email address
         And the manager enters valid password
         And the manager clicks Log in button
        Then the title should be Login | Website localhost

        @manager
      Scenario: Manager: Negative login - missing password
        When the manager enters valid email address
         And the manager doesn't enter a password
         And the manager clicks Log in button
        Then the title should be Login | Website localhost

        @manager
      Scenario: Manager: Negative login - missing username and password
        When the manager doesn't enter an email address
         And the manager doesn't enter a password
         And the manager clicks Log in button
        Then the title should be Login | Website localhost

        @user
      Scenario: User: Positive login test
        When the user enters valid email address
         And the user enters valid password
         And the user clicks Log in button
        Then the title should be Odoo

        @user
      Scenario: User: Negative login - wrong username
        When the user enters wrong email address
         And the user enters valid password
         And the user clicks Log in button
        Then the title should be Login | Website localhost

        @user
      Scenario: User: Negative login - wrong password
        When the user enters valid email address
         And the user enters wrong password
         And the user clicks Log in button
        Then the title should be Login | Website localhost

        @user
      Scenario: User: Negative login - missing username
        When the user doesn't enter an email address
         And the user enters valid password
         And the user clicks Log in button
        Then the title should be Login | Website localhost

        @user
      Scenario: User: Negative login - missing password
        When the user enters valid email address
         And the user doesn't enter a password
         And the user clicks Log in button
        Then the title should be Login | Website localhost

        @user
      Scenario: User: Negative login - missing username and password
        When the user doesn't enter an email address
         And the user doesn't enter a password
         And the user clicks Log in button
        Then the title should be Login | Website localhost

## TODO
  # add more positive scenarios to not only verify the title
  # but also verify the logged in user's credentials to be on the page