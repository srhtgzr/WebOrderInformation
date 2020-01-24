@smoke_test
Feature:View All Orders Page

  Background: open login page and login
    Given user is on the login page
    When user login as an authorized user

  @tableTitle
  Scenario: Verify table title
    Then user verifies that table title is "List of All Orders"

  @CheckUncheck
  Scenario: user checks and uncheck all orders
    Then user checks all orders and uncheck them

  @VerifyTableHeaders
  Scenario: Verify table headers
    Then user verifies table headers as follows
      | Name        |
      | Product     |
      | #           |
      | Date        |
      | Street      |
      | City        |
      | State       |
      | Zip         |
      | Card        |
      | Card Number |
      | Exp         |

  @DeleteOrder
  Scenario: Verify order delete
    Then user checks order count
    Then user deletes "1"
    Then user checks new order count
    Then user verifies that order deleted



