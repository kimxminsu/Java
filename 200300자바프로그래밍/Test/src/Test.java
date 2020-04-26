public class Test {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (i <= 100) {
			if (i % 2 == 1)
				sum += i;
			i++;
		}
		System.out.println(sum);
	}
}