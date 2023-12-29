Feature: Login Functionality
Background: user open successfully main page
Given user open "chrome" browser  
Given user open url 

Scenario: Login functionality with valid data
When user enter "Admin" as a username
When user enter "Admin" as a password
When user click on login button
Then application shows admin page
