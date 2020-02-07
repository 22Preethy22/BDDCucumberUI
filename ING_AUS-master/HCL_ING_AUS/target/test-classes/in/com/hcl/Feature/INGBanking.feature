Feature: Banking Application

Scenario: Launch HomePage
Given user is on Homepage
When clicks on Bank and Save 
And user click on Personal Term Deposit
Then Personal Term Deposit Page is populated



Scenario: Launch Personal Deposit Page
Given user is on Personal Deposit Page
When user clicks on OpenNow
And User enters with following details

|INDIA|Ram|Dasaradh|Raghuvamasha|06/02/2020|Ayodhya|INDIA|sita@gmail.com|991627785|6361550433|AYODHYA-001|Kousalya|

Then Open a Personal Term Deposit

