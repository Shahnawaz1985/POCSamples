Feature: post a ride.
As a employee I want to share my car so that anyone can travel with me.

Scenario: Correct Data Posting
Given employee enter all data correctly
When click on submit
Then System display message "Posting successful."

@myNameTag
Scenario: Correct data posting with Name
Given employee enter FirstName as "Shahnawaz", lastName as "Akhter"
When hover
Then it will validate the fields.

@myEmailTag
Scenario: Correct data posting with email
Given employee enter email as "shahnawaz.akhter@outlook.com",
When hover
Then it will validate the fields.

Scenario: Correct data posting with Phone
Given Phone no is "9654091913"
When hover
Then it will validate the fields.

Scenario: Correct data posting with source
Given source is "Gurgaon"
When hover
Then it will validate the fields.

Scenario: Correct data posting with destination
Given Destination is "New Delhi"
When hover
Then it will validate the fields.

Scenario: Correct data posting with time
Given Time will be "17:30".
When hover
Then it will validate the fields.

Scenario: Fields will be cleared on successfull reset
Given name, source,destination, timing
When click on reset
Then it will clear all the details.

Scenario: Fields will be validated after input
Given name is entered
When move/hover on next input
Then it will show errorr message.

Scenario: Fields will be validated after input
Given email is entered
When move/hover on next input
Then it will show errorr message.

Scenario: Fields will be validated after input
Given phone is entered
When move/hover on next input
Then it will show errorr message.

Scenario: Fields will be validated after input
Given source is entered
When move/hover on next input
Then it will show errorr message.

Scenario: Fields will be validated after input
Given destination is entered
When move/hover on next input
Then it will show errorr message.

Scenario: Fields will be validated after input
Given date is entered
When move/hover on next input
Then it will show errorr message.


Scenario: Fields will be validated after input
Given time is entered
When move/hover on next input
Then it will show errorr message.