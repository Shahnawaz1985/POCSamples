Feature: Display a ride.
As a employee I want to see my booking after successful booking.

Scenario: Correct Data Display after booking
Given employee is able to see his booking details
When he clicks on display
Then System should display all the bookings for that employee.

Scenario: Employee needs to cancel his booking
Given employee clicks cancel button
When click on cancel
Then it should cancel the booking for him
And seat should become available.

Scenario: Employee wants to see his posting
Given employee post a cab for share
When click on display a ride
Then it will show his posting in display a ride page.

Scenario: Employee wants to see all bookings as a publisher for his car
Given employee wants to check how many bookings he has for the day
When click on my booking list
Then it will show all bookings for my car.