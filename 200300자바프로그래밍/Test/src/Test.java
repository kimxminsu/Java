/*
아래 printSum()은 두 정수를 파라미터로 전달받아 그 합을 출력
하는 메소드이다. 아래 코드가 정상 동작하도록 printSum() 메소
드를 완성하시오.
*/
public class Test {
	public static void main(String[] args) {
		int x = 10, y = 30;
		printSum(x, y); // 실행결과 40
	}

	private static void printSum(int x, int y) {
		int sum = 0;
		sum = x + y;
		System.out.println(sum);
	}
}