package recallTest;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("a-username");
		a.add("a-password");
		a.add("a-domain");
		a.add("a-companyname");
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("b-username");
		b.add("b-password");
		b.add("b-domain");
		b.add("b-companyname");
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("c-username");
		c.add("c-password");
		c.add("c-domain");
		c.add("c-companyname");
		
		ArrayList<String> d = new ArrayList<String>();
		d.add("d-username");
		d.add("d-password");
		d.add("d-domain");
		d.add("d-companyname");
	
		ArrayList<ArrayList<String>> mainlist = new ArrayList<ArrayList<String>>();
		
		mainlist.add(a);
		mainlist.add(b);
		mainlist.add(c);
		mainlist.add(d);
		
		System.out.println(mainlist);
		System.out.println(mainlist.size());
		
		for(int i=0;i<mainlist.size();i++)
		{
			System.out.println(mainlist.get(i));
			for(int j=0;j<mainlist.get(i).size();j++)
			{
				System.out.println(mainlist.get(i).get(j));
			}
		}
		
		
		
	
	}

}
