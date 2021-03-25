package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class A3_CompareTreeAndHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet c = new TreeSet();
	//HashSet c = new HashSet();	
		c.add("d");
		c.add("a");
		c.add("c");
		c.add("b");
		
		c.add("d");
		c.add("a");
		c.add("c");
		c.add("b");
		//c.add(null);
		c.add(1);
		c.add(1.5);
		c.add(true);
		
		Iterator it = c.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
