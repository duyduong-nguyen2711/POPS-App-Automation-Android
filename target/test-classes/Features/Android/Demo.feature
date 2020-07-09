## new feature
## Tags: optional
#
#Feature: Update user info
#
#  Scenario: User open POPS app and navigate to Setting Page
#    Given User is at Home Page
#    Then User should see tutorial and click Got It
#    When User navigate to "Account"
#    When User open Login Page
#    When User open Sign Up page
#    Then Register button should be disabled to click
#    And User sign up with incorrect info
#      | Automation test | popstest           | 123456 | Invalid email. Please check if your email has been entered correctly. |
#      | Automation test | popstest@gmail     | 123456 | Invalid email. Please check if your email has been entered correctly. |
#      | Automation test | popstest@gmail.com | 1      | Please enter a password with at least 6 characters.                   |
#      | Automation test | duyduong.nguyen@pops.vn      | 123456 | This account was exist in system                                      |
#    And User sign up with correct info
#      | Automation test | popstest | 123456   |
#    When User confirm pops up in active page
##    And User activate account successful
#    And User click activate later

Feature: Sign Up Function Feature
  As a user
  I want to ensure that Sign up feature is working well

  @smoke @test
  Scenario: user sign up successful - Mobile
    Given User is at Home Page
    Then User should see tutorial and click Got It
    When User navigate to "Account"
    When User open Login Page
    When User open Sign Up page
    Then Register button should be disabled to click
    And User sign up with incorrect info
      | Automation test | popstest                | 123456 | Invalid email. Please check if your email has been entered correctly. |
      | Automation test | popstest@gmail          | 123456 | Invalid email. Please check if your email has been entered correctly. |
      | Automation test | popstest@gmail.com      | 1      | Please enter a password with at least 6 characters.                   |
      | Automation test | duyduong.nguyen@pops.vn | 123456 | This account was exist in system                                      |
    And User sign up with correct info
      | Automation test | popstest | 123456 |
    When User confirm pops up in active page
#    And User activate account successful
    And User click activate later

