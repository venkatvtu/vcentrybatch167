package sampleTest;

public class SampleTest {
	public void finalize()
	{
		System.out.println("finalize called");
	}
	SampleTest(int i){
		System.out.println("sample test "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		SampleTest s1 = new SampleTest(1);
		SampleTest s2 = new SampleTest(2);
		SampleTest s3 = new SampleTest(3);
		SampleTest s4 = new SampleTest(4);
		s1=null;
		s2=null;
		s3=null;
		s4=null;
		
		System.gc();
		
	}

}
