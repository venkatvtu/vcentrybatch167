package listTest;

import java.util.ArrayList;
import java.util.Collections;

public class A9_ArrayListAllDataTypeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("vcentry3"); //0
		a.add(2); //1
		a.add(true); //2
		a.add(1.5);//3
		a.add('c');
		
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
