#Authour : venkat from vcentry - 3rd june 2021


@Login
Feature: validate login features of vcentry app


@validLogin
Scenario Outline: validate login feature of vcentry app with valid data...

Given open browser as "<BROWSER>"
When enter url as "<URL>"
When click login link
Then verify login page loaded or not
When enter username as "<USERNAME>"
And enter password as "<PASSWORD>"
When click login button
Then verify login success or not

Examples:

|BROWSER|URL|USERNAME|PASSWORD|
|firefox|http://djangovinoth.pythonanywhere.com/login/|User1|Guru@12345|
|chrome|http://djangovinoth.pythonanywhere.com/login/|User2|Guru@12345|
|ie|http://djangovinoth.pythonanywhere.com/login/|User3|Guru@12345|
|edge|http://djangovinoth.pythonanywhere.com/login/|User4|Guru@12345|
