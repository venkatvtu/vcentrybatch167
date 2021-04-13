package stringBuilderStringBufferTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="vcentry";
		a.concat("technologies");
		System.out.println(a);
		
		int i=1;
		i++;
		System.out.println(i);
		StringBuilder sb = new StringBuilder("vcentry");
		sb.append("technologies");
		System.out.println(sb);
		
	}

}
