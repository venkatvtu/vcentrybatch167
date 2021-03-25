package listTest;

import java.util.ArrayList;

public class A11_ArrayListRemoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("vcentry1"); //0
		a.add("vcentry2"); //1
		a.add("vcentry3"); //2
		a.add("vcentry4"); //3
		
		System.out.println(a.size());
		a.remove(1);
		System.out.println("After removal:"+a.size());
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}
