package conditionTest;

public class ElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		String country="AUS";
		if (age > 18) {
			System.out.println("Allow To Vote");

			
		} 
		else if(country.equals("AUS")) {
			System.out.println("He is australian allow to vote");
		}
		else {
			System.out.println("Age is under 18");
		}
	}

}
