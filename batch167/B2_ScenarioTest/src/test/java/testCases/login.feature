#Authour : venkat from vcentry - 3rd june 2021


@Login
Feature: validate login features of vcentry app


@validLogin
Scenario: validate login feature of vcentry app with valid data...

Given open browser
When enter url
When click login link
Then verify login page loaded or not
When enter username
And enter password
When click login button
Then verify login success or not 


