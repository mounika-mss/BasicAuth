
Feature: getByName Request
Scenario: User want to read the data by the name
When User Want to Fetch the data by using the URI "http://localhost:8080/venues/weddinghalls/name/sravanthi"
Then user want to Verify the statusLine "HTTP/1.1 200 "
And User Want to validate the StatusCode 200