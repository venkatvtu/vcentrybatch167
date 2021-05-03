package hashTableTest;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable table = new Hashtable();
		table.put("username", "abc");
		table.put("password", "123");
		table.put("domain", "testing");
		table.put("company", "vcentry");
		//table.put("mobile", null);
		//table.put(null, "guindy");
		
		//System.out.println(table.get("username"));
		
		Enumeration e = table.keys();
		//System.out.println(e.hasMoreElements());
		//System.out.println(e.nextElement());
		while(e.hasMoreElements())
		{
			//System.out.println(e.nextElement());
		//System.out.println(table.get(e.nextElement()));
		String key = (String) e.nextElement();
		System.out.println(key+":"+table.get(key));
		}
		
		
	}

}
