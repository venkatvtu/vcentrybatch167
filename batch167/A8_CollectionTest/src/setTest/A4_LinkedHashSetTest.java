package setTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A4_LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedHashSet c = new LinkedHashSet();
		
		c.add("d");
		c.add("a");
		c.add("c");
		c.add("b");
		
		c.add("d");
		c.add("a");
		c.add("c");
		c.add("b");
		
		Iterator it = c.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
