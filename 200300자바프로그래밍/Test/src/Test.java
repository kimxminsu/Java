public class Test {
	public static void main(String[] args) {
		double fee = 1000;
		int age = 65;
		if (age <= 6)
			fee *= 0.5;
		if (age >= 65)
			fee *= 0.7;
		System.out.println(fee);
	}
}