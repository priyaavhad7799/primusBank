Feature: Search Functionality
Background: user able to search functionality
Given user open "chrome" browser  
Given user open url 
When user enter "Admin" as a username
When user enter "Admin" as a password
When user click on login button

@SmokeTest
Scenario: Search functionality
Given user click on branches button
Given user select "INDIA" as country
Given user select "Karnataka" as state
Given user select "BANGLORE" as city
When user click on search button
Then user can see Branch deatails