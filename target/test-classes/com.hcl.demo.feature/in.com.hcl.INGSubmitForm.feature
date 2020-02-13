Feature: Create New ING Customer 
@UItest
Scenario: Create a new Custmer
Given launch the ING browser
When Fill the form Details
|country|title|givenName|familyName|emailAddress   |mobile         |dateOfBirth(dd/mm/yyyy)|placeOfBirth|address                             |SecurityQues|
|India  |Mr   | address |Smith     |jsmith@test.com|jsmith@test.com|05/12/1992             |QueensLand  |65 Keehner Entrance , MARTIN WA 6110|queen       |
And Click on Continue button
Then Validate the Success Message



