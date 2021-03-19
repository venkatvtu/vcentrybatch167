package listTest;

import java.util.ArrayList;
import java.util.Collections;

public class A8_ArrayListSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("vcentry3"); //0
		a.add("vcentry2"); //1
		a.add("vcentry4"); //2
		a.add("vcentry1");//3
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("--------------------------------");
		//sorting
		//a.sort(c);
		Collections.sort(a);
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}

}
