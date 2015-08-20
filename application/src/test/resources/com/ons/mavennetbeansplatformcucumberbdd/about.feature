Feature: About Box
As a User
I want to be able to show and hide the about box
In order that I can get useful information

Scenario: Show and Hide the About Box
Given I have a Show Manager Application
When I click the "Help|About" menu
Then the "About" Dialogue is displayed
When I can click the "About" close button
Then the "About" Dialogue is hidden    

   