Feature: SearchBar Validation

Scenario: Entering data into search box and validating the results

Given User lands on Home Page
And User pass the input into search box and press Enter
Then The relevant products should be displayed and user click on it
And user add the product to cart
