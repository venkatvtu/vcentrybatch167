package hashTableTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap map = new TreeMap();
		map.put("username", "abc");
		map.put("password", "123");
		map.put("domain", "testing");
		map.put("company", "vcentry");
		map.put("username", "abc123");
		map.put("mobile", null); // value is allow
		//map.put(null, "guindy"); // key not allow
		//map.put(null, "chennai");
		
		
		//System.out.println(map.get("username"));
		//Set s= map.keySet();
		//Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next());
		String key = (String) it.next();
		System.out.println(key+"-"+map.get(key));
		
		
		}
		
		
	}

}
