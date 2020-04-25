public class Test {
	public static void main(String[] args) {
		int score = 95;
		if (score >= 90) {
			System.out.println('A');
		}
		if (score >= 80 && score < 90) {
			System.out.println('B');
		}
		if (score >= 70 && score < 80) {
			System.out.println('C');
		}
		if (score >= 60 && score < 70) {
			System.out.println('A');
		}
		if (score < 70)
			System.out.println('F');
	}
}