@smoke @regression @purchases
  Feature: Purchases, verification of modules and basic functionality

    Background: user / manager should be logged in
      Given the "manager" is logged in
      Then the title should be Odoo
      # Verify that 'Requests for Quotation' is visible by default
      When the Purchases button is clicked
      Then the title should be Requests for Quotation - Odoo

      @manager
      Scenario: 'Purchase Orders' functionality is up and running (click and switch)
        When the Purchase Orders button is clicked
        Then the user should be on Purchase Orders page
         And the title should be Purchase Orders - Odoo