@product
Feature: verify the product purchase 

Scenario Outline: validate purchase with multi products count
Given open browser as "<BROWSER>"
When enter url as "<URL>"
When Click login link
Then verify whether entered to login page or not
When enter user name as "<USERNAME>"
And enter password as "<PASSWORD>"
And click loginbutton
And click framework forms
And click product purchase flow

#And enter username as "<USER>" in product page
#And enter password as "<PASS>" in product page
#When click login button in product purchase
Then verify product input page

When add products list
|product a|11111|email a |Electrical| 10 |purchase a|
|product b|11111|email b |Electrical| 20 |purchase b|
|product c|11111|email c |Electrical| 30 |purchase c|
|product d|11111|email d |Electrical| 40 |purchase d|

Then verify product added or not
Examples:
|BROWSER|URL|USERNAME|PASSWORD|USER|PASS|
|chrome|http://djangovinoth.pythonanywhere.com/login/|user1|Guru@12345|testusera|testpassa|
|chrome|http://djangovinoth.pythonanywhere.com/login/|user1|Guru@12345|testuserb|testpassb|
|chrome|http://djangovinoth.pythonanywhere.com/login/|user1|Guru@12345|testuserc|testpassc|

