public class Test {
	public static void main(String[] args) {
		int score = -1;
		String prt;
		prt = (score >= 0 && score <= 100) ? "정상" : "비정상";
		System.out.println(prt);
	}
}