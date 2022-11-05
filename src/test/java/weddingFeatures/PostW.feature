


Feature: Post Request
Scenario: User Should be able to add the data into database
Given User want to post the data
When user add the data by using URI "http://localhost:8080/venues/weddinghalls"
Then  user want to verify the status line "HTTP/1.1 201 "
And user want to verify the status code 201

