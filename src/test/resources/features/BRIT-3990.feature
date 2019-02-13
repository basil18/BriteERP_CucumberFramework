#Acceptance Criteria:
	# # Verify that 'Purchases' tab visible from the top navigation tab
	# # Verify that 'Requests for Quotation' becomes available and clickable on the left navigation tab
	# # Verify that quotation requests are listed on the main screen
	# # Verify that each request has the following information displayed:
	# ## Reference (unique Purchase Order (PO) number)
	# ## Order Date (format: DD/MM/YYYY 24:59:59)
	# ## Vendor (name of the vendor)
	# ## Scheduled Date (format: DD/MM/YYYY 24:59:59)
	# ## Source Document
	# ## Untaxed (total amount, before taxes)
	# ## Total (total amount, with taxes)
	# ## Status (RFQ, RFQ Sent, Purchase Order, Cancelled)"
	# # Verify that total untaxed and total (taxed) amounts are displayed below the table.

@BRIT-3990 @McLean @Purchases @regression
Feature: As a POS Manager, I should be able to see all 'Requests for Quotation'
  within 'Purchases' page

  Scenario Outline: Verify that 'Purchases' tab is visible and clickable
  from the top navigation tab
    Given the user opens URL
    And the user selects BriteErpDemo database
    And the user enters valid <email> and <password>
    And the user clicks Log in
    Then the system should display Purchases tab on top navigation bar
    When the user clicks on Purchases
    Then the user should be on the Purchases page

    Examples:
      | <email>                  | <password> |
      | in_pos_manager2@info.com | KjKtfgrs31 |
      | in_pos_user2@info.com    | KjKtfgrs38 |

  Scenario: Verify that 'Requests for Quotation' is availabLe and clickable on the left navigation bar
    Given the "user" is logged in
    When the user clicks on Purchases
    Then the user should be on the Purchases page
    And the 'Requests for Quotation' should be displayed on the Left Navigation Bar
    When the user clicks on 'Requests for Quotation'
    Then the 'Requests for Quotation' should be displayed on the main panel

  Scenario: Verify that each request has the given pre-determined information displayed
    Given the "user" is logged in
    And the user goes to Purchases page
    Then the user is on Requests for Quotation page
    And the Requests for Quotation table is displayed
    And tge Requests for Quotation table has headings
      | Reference       |
      | Order Date      |
      | Vendor          |
      | Scheduled Date  |
      | Source Document |
      | Untaxed         |
      | Total           |
      | Status          |

  Scenario: Verify that total untaxed and total (taxed) amounts are displayed below the table
    Given the "user" is logged in
    And the user goes to Purchases page
    And the user is on Requests for Quotation page
    And the Requests for Quotation table is displayed
    Then the Requests for Quotation table has total amounts displayed
      | Untaxed |
      | Taxed   |