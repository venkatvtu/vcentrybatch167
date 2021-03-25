package listTest;

import java.util.ArrayList;

public class A14_ArrayListCloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("vcentry1"); //0
		a.add("vcentry2"); //1
		a.add("vcentry3"); //2
		a.add("vcentry4"); //3
		ArrayList b= a;
		System.out.println(b.size());
		b.add("vcentry5");
		System.out.println(a.size());
		System.out.println(b.size());
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		ArrayList c=(ArrayList) a.clone(); // call by value
		c.add("vcentry6");
		System.out.println(a.size());
		System.out.println(c.size());
		
	}

}
