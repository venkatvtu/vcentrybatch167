package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A1_HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		Set c= new HashSet();
		
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
