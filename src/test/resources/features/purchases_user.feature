@smoke @regression @purchases @user
  Feature: Purchases, verification of modules and basic functionality

    Background: user / manager should be logged in
      Given the "user" is logged in
      Then the title should be Odoo
      # Verify that 'Requests for Quotation' is visible by default
      When the Purchases button is clicked
      Then the title should be Requests for Quotation - Odoo

      Scenario: 'Purchase Orders' functionality is up and running (click and switch)
        When the Purchase Orders button is clicked
        Then the user should be on Purchase Orders page
         And the title should be Purchase Orders - Odoo

      Scenario: 'Vendors' functionality is up and running (click and switch)
        When the Vendors button is clicked
        Then the user should be on Vendors page
         And the title should be Vendors - Odoo

      Scenario: 'Products' functionality is up and running (click and switch)
        When the Products button is clicked
        Then the user should be on Products page
         And the title should be Products - Odoo

      Scenario: 'Incoming Products' functionality is up and running (click and switch)
        When the Incoming Products button is clicked
        Then the user should be on Incoming Products page
         And the title should be Incoming Products - Odoo

      Scenario: 'Vendor Bills' functionality is up and running (click and switch)
        When the Vendor Bills button is clicked
        Then the user should be on Vendor Bills page
         And the title should be Vendor Bills - Odoo