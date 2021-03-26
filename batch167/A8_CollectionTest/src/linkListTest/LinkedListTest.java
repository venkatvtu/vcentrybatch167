package linkListTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		
		l.add("d");
		l.add("c");
		l.add("a");
		l.add("b");
		
		l.add("d");
		l.add("c");
		l.add("a");
		l.add("b");
		
		//System.out.println(l.get(4));
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
