package xpathCssTest;

public class A74_CSSTest {

	//CSS Selector
	//id -#
	//className - .
	//id syntax - #idname
	//className Syntax - .className
	//Classname1 classname2 = .classname1.classname2 - remove space and dot in every word
	
	
	
	//id   =   #sb_form_q
	
	//classname  =   .sb_form_q
	
	//classname1 classname2  =   .search.icon.tooltip
	
	//****************************************************************************
	
	//static attribute value:
	
	//xpath syntax : //tagname[@attribute='attribute value']
	//css syntax :   tagname[attribute='attribute value']
	//css example: input[id='sb_form_q']
	
	//*****************************************************************************
	
	//contains,starts-with,ends-with
	// contains = *
	//starts-with = ^
	//ends-with = $
	
	//contains syntax =  tagname[attribute*='attributevalue']
	//contains example - input[id*='sb_form_q'] - true
	//contains example - input[id*='b_form_q']  - true 
	//contains example - input[id*='sb_form_']  - true
	
	
	//starts-with syntax = tagname[attribute^='attributevalue']
	
	//starts-with example - input[id^='sb_form_q'] - true
	//starts-with example - input[id^='sb_form_'] - true
	//starts-with example - input[id^='b_form_q'] - flase
	
	//ends-with syntax  - tagname[attribute$='attribute value']
	
	//ends-with example - input[id$='sb_form_q'] - true
	//ends-with example - input[id$='sb_form_'] - flase
	//ends-with example - input[id$='b_form_q'] - true
	
	//*************************************************************************
	
	//AND or Or operator
	
	//AND Syntax = tagname[attribute1='value'][attribute2='value2]
	
	//AND example = input[id='sb_form_q'][type='search'] - true
	//AND example = input[id='sb_form_'][type='search']  -  false
	
	//OR syntax = tagname[attribute1='value'],[attribute2='value2]
	
	//OR example = input[id='sb_form_q'],[type='search'] - true
	//OR example = input[id='sb_form_'],[type='search']  - true
	
	//*****************************************************************************
	
	// types = first-of-type,last-of-type,nth-of-type,nth-child
	//xpath - /
	//css - >
	
	//first-of-type syntax = tagname[attribute='value']>tagname: first-of-type
	//first-of-type example = ul[class='overflow_menu']>li:first-of-type
	
	//last-of-type syntax = tagname[attribute='value']>tagname: last-of-type
	//last-of-type example = ul[class='overflow_menu']>li:last-of-type
	
	// nth-of-type syntax - tagname[attrib='value'] > tagname: nth-of-type(index)
	//nth-of-type example - ul[class='overflow_menu']>li:nth-of-type(2)
		
	// nth-child syntax - tagname[attrib='value'] > tagname: nth-child(index)
	//nth-child example - ul[class='overflow_menu']>li:nth-child(2)
	
	//*******************************************************************************
	
	// Chained Locator
	//syntax = tagname[attribute1='value1']>[attribute2='values2']>[attribute3='value3']
	
	//example - div[class='overflow_container']>div[class='submenu']>ul[class='overflow_menu']
	
	//*************************************************************************************
	
	//operator +
	
	//syntax = tagname[attrib='value'] > tagname: nth-child(index) + tagname
	//example = ul[class='overflow_menu']>li:nth-child(2)+li
	
	
	
	
	
	
	
	
	
	
}
