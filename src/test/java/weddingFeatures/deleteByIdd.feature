


Feature: DELETEBYID request
Scenario: User Able to delete the Data from Database
When User want to remove the data by the ID using the uri " http://localhost:8080/venues/weddinghalls/94"
Then User validate that statusLine "HTTP/1.1 200 "
And user able to verify the statusCode 200