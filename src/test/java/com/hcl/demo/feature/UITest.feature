Feature: Create New ING Customer 
@UItest
Scenario: Create a new Custmer
Given launch the ING browser
When Fill the form Details
|nationality|title|givenName|familyName|emailAddress        |mobile         |dateOfBirth(dd/mm/yyyy)|placeOfBirth|countryOfBirth|address                             |SecurityQues|
|India  |Mr       |Smith    |jsmith@test.com|jsmith@test.com|0403422132     |  05/12/1992           |QueensLand  |   India      |65 Keehner Entrance , MARTIN WA 6110|queen       |
And Click on Continue button
Then Validate the Success Message
