package listTest;

import java.util.ArrayList;

public class A15_ArrayListClearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("vcentry1"); //0
		a.add("vcentry2"); //1
		a.add("vcentry3"); //2
		a.add("vcentry4"); //3
		System.out.println(a);
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		
	}

}
