package hashTableTest;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put("username", "abc");
		map.put("password", "123");
		map.put("domain", "testing");
		map.put("company", "vcentry");
		
		System.out.println(map.get("username"));
		
		
	}

}
