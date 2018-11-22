Feature: Login into application

  Scenario Outline: Positive test validating login
    Given initialize the browser with chrome
    And Navigate to "http://www.qaclickacademy.com/" site
    And Click on login link in home page to land on secure sign in page
    When User enters "<username>" and "<password>" and logs in
    Then Verify that user has successfully logged in
    And close the browser
    Examples:
    |username                |password |
    |test99@gmail.com        |123456   |
    |syfulislam41@gmail.com  |pass123  |
    |test1234@gmail.com      |453548345|
