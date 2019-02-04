@smoke @regression @purchases
  Feature: Purchases, verification of modules and basic functionality
    @todo
    Scenario: user / manager should be logged in
      Given the "manager" is logged in
      Then the title should be Odoo
      When the Purchases button is clicked
      Then the title should be Requests for Quotation - Odoo
