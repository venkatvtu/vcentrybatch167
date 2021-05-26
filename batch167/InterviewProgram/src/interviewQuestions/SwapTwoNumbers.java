package interviewQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// by using third party(variable)
		int mysalary = 20;
		int superiorsalary=50;
		
		int temp = mysalary;
		mysalary=superiorsalary;
		superiorsalary=temp;
		
		System.out.println(mysalary+" "+superiorsalary);
		
		
		// using without third party(variable)
		// by using add and sub
		
		int first=20;
		int second=50;
		first=first-second;
		second=first+second;
		first=second-first;
		
		System.out.println(first+" "+second);
		
		// by using mul and division
		int first1=10;
		int second1=50;
		
		first1=first1*second1;
		second1=first1/second1;
		first1=first1/second1;
		System.out.println(first+" "+second);
		
	}

}
