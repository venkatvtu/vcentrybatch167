package linkListTest;

import java.util.Iterator;
import java.util.LinkedList;

public class A3_OfferFirstAndLastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedList l = new LinkedList();
		
		l.add("d");
		l.add("c");
		l.add("a");
		l.add("b");
		
		Iterator it =l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----------------------");
		l.offerFirst("e");
		l.offerLast("f");
		
		Iterator ita =l.iterator();
		while(ita.hasNext())
		{
			System.out.println(ita.next());
		}
		
	}

}
