Feature: contact us feature
Scenario: submit details in contactUs oage
Given user on home page
When click on contactUs 
And user fills the contactUs form with name "Rahul" email "rahul@gmail.com" msg "Nice website"
And submit the contact form
Then success message should be displayed