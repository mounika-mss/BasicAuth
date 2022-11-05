



Feature:GetById request
Scenario: fetch the data by the ID
When User want to read the data by using URI "http://localhost:8080/venues/weddinghalls/id/36"
Then user want to verify the statusline "HTTP/1.1 200 "
And user want to verify the statusCode 200 