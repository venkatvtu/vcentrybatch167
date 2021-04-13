package throwTest;

public class ThrowTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int age =17;
		if(age<18)
		{
			System.out.println("warning : you are not allow");
			throw new Exception("under 18");
			
		}
		System.out.println("");
		
	}

}
