package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A2_TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set c= new HashSet();
		TreeSet c = new TreeSet();
		
		c.add("d");
		c.add("a");
		c.add("c");
		c.add("b");
		
		c.add("d");
		c.add("a");
		c.add("c");
		c.add("b");
		
		Iterator it = c.iterator();
		/*System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());
		it.next();
		System.out.println(it.hasNext());*/
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	}


