
Feature: GetBy Price Request
Scenario: user want to see the data
When user want to see the data by using uri "http://localhost:8080/venues/weddinghalls?high=1000&low=500"
Then user want to verify the statusLine "HTTP/1.1 200 "
And user want to verify statusCode 200
