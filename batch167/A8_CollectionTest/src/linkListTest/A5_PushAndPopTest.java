package linkListTest;

import java.util.Iterator;
import java.util.LinkedList;

public class A5_PushAndPopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedList l = new LinkedList();
		
		l.add("d");
		l.add("c");
		l.add("a");
		l.add("b");
		System.out.println(l.pop());
		l.push("aa");
		System.out.println("---------------------");
		Iterator it =l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	
		
		
		
	}

}
