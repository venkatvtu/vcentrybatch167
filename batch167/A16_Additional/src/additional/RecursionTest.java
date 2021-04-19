package additional;

public class RecursionTest {
	public static void main(String[] args) {
		try {
			add();
		} catch (Exception e) {

		}
	}

	public static void add() {
		int i = 1;
		int j = 1;
		int k = i + j;
		System.out.println(k);
		add();
	}
}
