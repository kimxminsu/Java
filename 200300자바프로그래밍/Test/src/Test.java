public class Test {
	public static void main(String[] args) {
		int x = 237, y = 89, z = -6;
		if (x > y) {
			if (x > z)
				System.out.println(x);
			else
				System.out.println(z);
		} else {
			if (y > z)
				System.out.println(y);
			else
				System.out.println(z);
		}
	}
}