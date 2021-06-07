#Authour : venkat from vcentry - 3rd june 2021


@Login
Feature: validate login features of vcentry app

Background: To run all the scenario we need to check, verify network,excel,properties
Given verify network
Given verify excel location
Given verify properties file location
Given verify database
When enter username and password in db login url
When establish db connection
Then verify db connected or not

@validLogin
Scenario: validate login feature of vcentry app with valid data...

Given open browser as "chrome"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
Then verify login page loaded or not
When enter username as "venkat"
And enter password as "Vcentry@2021"
When click login button
Then verify login success or not


