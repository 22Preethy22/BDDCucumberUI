Feature: Create New ING Customer 
@UItest
Scenario: Create a new Custmer
Given launch the ING browser
#When Navigate to Orange Everyday bank account
#now filling the form
#And Click on Open Now button
When Fill the form Details
|country| INDIA|
#|title|Mr|
|givenName|John|
|familyName|Smith|
|emailAddress|jsmith@test.com|
|mobile|0465789765|
|dateOfBirth(dd/mm/yyyy)|19/03/1995|
|placeOfBirth|QueensLand|
|address|65 Keehner Entrance , MARTIN WA 6110|
|SecurityQues|queen|

And Click on Continue button
Then Validate the Success Message



