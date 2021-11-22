Feature: wishlist validation

Scenario: Add Product To wishlist

Given user land on website main page
And user pass the input in the search bar and press enter
Then the relevant product should be displayed and user click on it
And user add the product to wishlist