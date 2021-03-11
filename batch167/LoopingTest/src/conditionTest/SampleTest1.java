package conditionTest;

public class SampleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vcentry";
		String output="";
		//name.charAt(0); // v
		//name.length();
			for(int i=name.length()-1;i>=0;i--) {
				//System.out.print(name.charAt(i));
				output=output+name.charAt(i);
			}
			System.out.println(output);
	}

}
