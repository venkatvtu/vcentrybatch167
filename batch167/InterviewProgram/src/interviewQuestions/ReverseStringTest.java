package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringTest {

	public static void main(String[] args) {
		
		
		/*String a = "venkat";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			System.out.println(b);
		}
		if(a.equals(b))
		{
			System.out.println("it is palindrome");
		}else
		{
			System.out.println("it is not palindrome");
		}*/
		
		// or by using string buffer 
		
		/*String a="venkat";
		StringBuffer sb = new StringBuffer();
		sb.append(a);
		System.out.println(sb.reverse());
		*/
		
		// or by using string builder
		
		/*String a ="venkat";
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		System.out.println(sb.reverse());
		*/
		
		/*
		String given ="venkat";
		String expect="";
		char[] reverseString=	given.toCharArray();
		for(int i=given.length()-1;i>=0;i--)
		{
		expect= 	expect+reverseString[i];
		}
		System.out.println(expect);
		*/
		
		String given="venkat";
		char[] reversed =	given.toCharArray();
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : reversed) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator iterator =	list.listIterator();
		while(iterator.hasNext())
		{
		System.out.println(iterator.next());
		}
		}
}