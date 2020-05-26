Feature: Application Login

Scenario: Home Page default login
Given User in on landing page
When User login into appliction with username and password
Then Home page is populated
And Cads are display