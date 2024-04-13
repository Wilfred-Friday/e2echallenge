Feature: E2E Automation Challenge
  Scenario Outline: Create a user account, log in and deleted it from the platform
    Given the user is on the home page
    When  the user navigates to the signup page
    Then  the user should see the 'New User Signup!' message

    When  the user fills in the signup form with "<name>", "<email>"
    And   the user submits the signup form
    Then  the user should see the tag 'ENTER ACCOUNT INFORMATION' message

    When  the user completes the account information form with "<password>", "<date>", "<month>", "<year>", "<firstname>", "<lastname>", "<company>", "<address1>", "<address2>", "<country>", "<state>", "<city>", "<zipcode>", "<mobilephone>"
    And   the user submits the account information form
    Then  the user should see the a new tag 'ACCOUNT CREATED!' message

    When  the user continues should see the tag 'Logged in as TestingName' message
    And   the user logs out from the account
    Then  the user loggedOut should see a 'Login to your account' message

    When  the user logs back in with valid credentials "<email>", "<password>"
    Then  the user should see again the 'Logged in as TestingName' message

    When  the user deletes the account
    Then  the user should see the text 'ACCOUNT DELETED!' message

    Examples:
      | name        | email              | password | date | month | year | firstname | lastname | company | address1  | address2  | country | state   | city    | zipcode | mobilephone |
      | TestingName | f1testing@gmail.com| ps123    | 20   | 11    | 1991 | Sergio    | Perez    | Ferrari | Testing 1 | Testing 2 | India   | Testing | Testing | 12345   | 12309189    |