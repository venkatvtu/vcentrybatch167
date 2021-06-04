#Authour : venkat from vcentry - 3rd june 2021


@Login
Feature: validate login features of vcentry app


@validLogin @admin
Scenario: validate login feature of vcentry app with valid data...

Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
Then verify login page loaded or not
When enter username as "venkat"
And enter password as "vcentry@2021"
When click login button
Then verify login success or not

@invalidLogin
Scenario: validate login feature of vcentry app with invalid data...

Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
Then verify login page loaded or not
When enter username as "venkat"
And enter password as "vcentry@2021"
When click login button
Then verify login success or not

@admin
Scenario: validate login feature of vcentry app with admin data...

Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
Then verify login page loaded or not
When enter username as "venkat"
And enter password as "vcentry@2021"
When click login button
Then verify login success or not

@guestuser
Scenario: validate login feature of vcentry app with guestuser data...

Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
Then verify login page loaded or not
When enter username as "venkat"
And enter password as "vcentry@2021"
When click login button
Then verify login success or not

@customercare
Scenario: validate login feature of vcentry app with customercare data...

Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
Then verify login page loaded or not
When enter username as "venkat"
And enter password as "vcentry@2021"
When click login button
Then verify login success or not

@emptydata
Scenario: validate login feature of vcentry app with emptydata data...

Given open browser as "firefox"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
When click login link
Then verify login page loaded or not
When enter username as "venkat"
And enter password as "vcentry@2021"
When click login button
Then verify login success or not

