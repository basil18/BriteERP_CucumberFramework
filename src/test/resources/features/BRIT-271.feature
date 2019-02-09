@regression @rfq @brit-271
  Feature: As a POS Manager, I should be able to
    'Create' new 'Request for Quotation'

    Background: User should be logged in and at Request for Quotation page
      Given the "manager" is logged in
       And the user should be on Requests for Quotation page
       And the Create button is visible
       And the user clicks Create button

      Scenario: BRIT-274: Verify that 'Create' button is visible and
        when clicked, 'Create' button takes the user to a a new page
          Then the user should be on Requests for Quotation / New page
           And the title should be New - Odoo

      Scenario: BRIT-275: Verify that system presents pre-determined
        options for order creation
          Then the following <labels> and <elements> should be visible
              | <labels>          | <elements>    |
              | Vendor            | dropdown box  |
              | Vendor Reference  | input box     |
              | Order Date        | dropdown box  |
           And the system should display the following
              | Table for Products |
              | Text box for notes |
              | Untaxed amount     |
              | Taxes              |
              | Total              |
           But the system should not display the following
              | Deliveries & Invoices |

      Scenario: BRIT-276: Verify that 'Vendor' dropdown box contains
        vendor information previously created
          Given the Vendor dropdown box is displayed
           And the Vendor dropdown box is empty by default
          When the user clicks Vendor dropdown box
          Then the Vendors list should match the database

      Scenario: BRIT-278: Verify that 'Order Date' dropdown displays
        the date and time the order creation is initiated per format
          Given the Order Date dropdown box is displayed
           And the Order Date dropdown box displays the date and time by default
           And the date and time is displayed per documentation
            # MM/DD/YYYY 24:59:59
          When the Order Date dropdown box is clicked
          Then the Calendar is generated
           And the dates on the Calendar are clickable
           And the Order Date changes if another date on Calendar is clicked

      Scenario: BRIT-279: Verify that 'Vendor Reference' text input is
        available and accepts user input
          Given the Vendor Reference text input is displayed
          Then the Vendor Reference text input should be blank by default
           And the Vendor Reference text input accepts user input
          When the user sends input to the Vendor Reference text input
           And clicks on another element
          Then the Vendor Reference text input should display the input by user

      Scenario: BRIT-281: Verify that 'Products' section is visible by default
        and pre-determined columns are displayed
          Given the Products table is displayed
          Then the following columns should be displayed
            | Product         |
            | Description     |
            | Scheduled Date  |
            | Quantity        |
            | Unit Price      |
            | Taxes           |
            | Subtotal        |