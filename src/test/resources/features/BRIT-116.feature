@regression @rfq @brit-116
  Feature: As a POS Manager, I should be able to see all 'Requests for Quotation'
    within 'Purchases' page

    Scenario: BRIT-119: Verify that 'Purchases' tab is visible and clickable
      from the top navigation tab
      Given the user goes to url
       And the user enters valid email address
       And the user enters valid password
       And the user clicks Log in button
      Then the Purchases button is visible
      When the Purchases button is clicked
      Then the title should be Requests for Quotation - Odoo

    Scenario: BRIT-120: Verify that 'Requests for Quotation' is
      available and clickable on the left navigation tab
      Given the "manager" is logged in
      When the Purchases button is clicked
      Then the Requests for Quotation button is displayed on the side navigation bar
       And the user should be on Requests for Quotation page
       And the title should be Requests for Quotation - Odoo

    Scenario: BRIT-121: Verify that each request has the listed information displayed
      Given the "manager" is logged in
       And the user should be on Requests for Quotation page
       And the title should be Requests for Quotation - Odoo
      Then the page should display the table
       And the table should have the following rows
            | Reference       |
            | Order Date      |
            | Vendor          |
            | Scheduled Date  |
            | Source Document |
            | Untaxed         |
            | Total           |
            | Status          |

    Scenario: BRIT-122: Verify that total untaxed and total (taxed) amounts are displayed
      Given the "manager" is logged in
       And the title should be Requests for Quotation - Odoo
       And the user should be on Requests for Quotation page
      Then the page should display the table
       And the Untaxed total is displayed
       And the Total is displayed