@F0001

Feature: Login
  As user, I want to be able to login into restful booker
  to test web services


  Scenario: Login Home page
    When user is on the restful booker login page
    Then user verify the home page subtitles
    And user verifies that "API Docs" links


  Scenario: Login Home page
    When user is on the restful booker login page
    Then user verify the home page subtitles
    And user verifies that "Website" links displayed


  @data_table_map
  Scenario: Login as (data table example)
    When user is on the restful booker login page
    Then user log in with following credentials
      | link1 | API Docs |
      | link2 | Website  |

  @data_table_array
  Scenario Outline: DDT example, Login as <role>
    When user is on the restful booker login page
    Then user logs website as "<links>"

    Examples: roles
      | links    |
      | API Docs |
      | Website  |


  @login_with_ddt
  Scenario Outline: DDT example with credentials
    When user is on the restful booker login page
    Then user enters "<link>" then get "<value>" link

    Examples:
      | link  | value    |
      | link1 | API Docs |
      | link2 | Website  |


  @login_with_ddt_2
  Scenario Outline: Login and verify page title is correct
    When user is on the restful booker login page
    Then user navigates to "<link>"
    Then verify title should be "<title>"

    Examples: drivers
      | link     | title               |
      | API Docs | Restful-booker      |
      | Website  | MW Test Consultancy |


  @login_ddt_3
  Scenario Outline: Login and verify table values
    When user is on the restful booker login page
    Then user navigates to "<link>"
    Then verify title should be "<title>"
    Then click on "<navItem>"
    Then verify table values "<first>" , "<second>" , "<third>"

    Examples: drivers
      | link     | title          | navItem       | first     | second   | third    |
      | API Docs | Restful-booker | GetBookingIds | firstname | lastname | checkin |

