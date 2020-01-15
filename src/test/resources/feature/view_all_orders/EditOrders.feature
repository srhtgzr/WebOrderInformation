Feature: Edit Orders

  Background: open login page and login
    Given user is on the login page
    When user login as an authorized user

  @EditOrder
  Scenario: editing order
    Then user clicks edit order
    Then user selects "MyMoney"
    Then user enters following information
      | Quantity: | Price per unit: | Discount: |
      | 4         | 100             | 5         |
    And click calculate button
    Then user enters address information
      | Customer name: | Street:             | City:     | State: | Zip:  |
      | Serhat Gezer   | 4185 Shirlee Lane N | Shoreview | MN     | 55126|
    Then user enters payment information
      | Card Nr:    | Expire date (mm/yy): |
      | 12341311231 | 11/20                |
    Then user selects visa card type
    And user click update button


    @ErrorMessage
    Scenario: verify error message
    Then user clicks edit order
    Then user selects "MyMoney"
    Then user enters following information
      | Quantity: | Price per unit: | Discount: |
      | 4         | 100             | 5         |
    And click calculate button
    Then user enters address information
      | Customer Name: | Street:             | City:     | State: | Zip:  |
      | Serhat Gezer   | 4185 Shirlee Lane N | Shoreview | MN     | "55126"|
    And following error message displayed "Field 'Customer name' cannot be empty."
