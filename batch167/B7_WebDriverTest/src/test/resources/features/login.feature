#Authour : venkat from vcentry - 3rd june 2021


@Login
Feature: validate login features of vcentry app


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


