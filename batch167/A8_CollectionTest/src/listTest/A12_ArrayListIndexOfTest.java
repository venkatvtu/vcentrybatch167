package listTest;

import java.util.ArrayList;

public class A12_ArrayListIndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("vcentry1"); //0
		a.add("vcentry2"); //1
		a.add("vcentry3"); //2
		a.add("vcentry4"); //3
		a.add("vcentry1");
		a.add("vcentry5");
		a.add("vcentry1");
		a.add("vcentry7");
		
		System.out.println(a.indexOf("vcentry1"));
		System.out.println(a.lastIndexOf("vcentry1"));
	}

}
