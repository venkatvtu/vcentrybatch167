package xpathCssTest;

public class XpathTest {

	// absolute path /html/body/div[2]/div/div[3]/div[2]/form/input[1]
	// relative path //*[@id="sb_form_q"]

	// syntax:
	// //tagname[@attribute='attribute value']
	// if tagname is changing means we can use *
	// //*[@attribute='attribute value']

	// **********************************************************************

	// //input[@aria-label='Enter your search term']
	// //input[@name='q']

	// ************************************************************

	// contains , starts with , ends with

	// contains :
	// syntax : //tagname[contains(@attribute,'attribute value')]
	// input[contains(@aria-label,'Enter your search term')] - true

	// example - //input[contains(@aria-label,'Enter your search')] - true
	// example - //input[contains(@aria-label,'your search term')] - true
	// example - //input[contains(@aria-label,'your search')] - true

	// starts-with:
	// tagname[starts-with(@attribute,'attribute value')]
	// //input[starts-with(@aria-label,'Enter your search term')] - true

	// input[starts-with(@aria-label,'Enter your search')] - true
	// input[starts-with(@aria-label,'your search term')] - false
	
	// ends -with:

	// tagname[ends-with(@attribute,'attribute value')]
	// input[ends-with(@aria-label,'Enter your search term')] - true

	// input[ends-with(@aria-label,'Enter your search')] - false
	// input[ends-with(@aria-label,'your search term')] - false

	//*******************************************************************************
	//text()
	//syntax   - //tagname[text()='visible text']
				//span[text()='Languages']
	
		//Syntax  - //tagname[contains(text(),'visible Text')]
		//Example - //span[contains(text(),'Languages:')]
		
		//Syntax  - //tagname[starts-with(text(),'visible Text')]
		//Example - //span[starts-with(text(),'Languages:')]
		
		//Syntax  - //tagname[ends-with(text(),'visible Text')]
		//Example - //span[ends-with(text(),'Languages:')]
	//*********************************************************************************
	//AND operator and OR operator
	// x=true and y=true - true ;  x=false and y=true - false
	// x=true or y=true - true ;  x=false or y=true - true
	
	//AND
	//syntax - //tagname[@attribute1='attribute value1' and @attribute2='attribute value2']
	//example - //input[@name='q' and @type='search']
	
	//OR
	//syntax - //tagname[@attribute1='attribute value1' or @attribute2='attribute value2']
	//example - //input[@id='sb_form_q' or @name='q']
	//*************************************************************************************
	
	//Following
	//syntax - //tagname[@attribute='attributevalue']/following::tagname
	//more than one div means - // tagname[@attribute='attributevalue']/following::tagname[index] -1
	//syntax -    //span[text()='Languages:']/following::a
	//syntax -    //span[text()='Languages:']/following::a[6]
	
	//preceding
	
	//syntax - //tagname[@attribute='attributevalue']/preceding::tagname
	//more than one div means - // tagname[@attribute='attributevalue']/preceding::tagname[index] -1

	// example //syntax -    //span[text()='Languages:']/preceding::a
	//syntax -    //span[text()='Languages:']/preceding::a[1]
	
	//**************************************************************************************
	
	//ancestor(grandfather),child,following-sibling,preceding-sibling,descendant
	
	//ancestor
	//syntax - //tagname[@attribute='atributevalue']/ancestor::tagname
	//example - //input[@id='sb_form_q']/ancestor::div - top most parent
    //input[@id='sb_form_q']/ancestor::div[1]
	//input[@id='sb_form_q']/ancestor::div[2]
	
	//syntax - //tagname[@attribute='attributevalue']/child::tagname
	
	//example - //ul[@class='overflow_menu']/child::li
	//example - //ul[@class='overflow_menu']/child::li[1]
	//example - //ul[@class='overflow_menu']/child::li[2]
	
	//syntax  - //tagname[@attribute='attribute value']/following-sibling::tagname
	//example - //li[@id='video']/following-sibling::li

	//syntax  - //tagname[@attribute='attribute value']/preceding-sibling::tagname
	//example - //li[@id='office']/preceding-sibling::li
	
	
	
	
	
	
	
	
	
	
	
	
	
}
