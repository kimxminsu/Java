/*
아래 코드의 func()는 세 정수 x, y, z를 파라미터로 전달받아
(x-y)/z의 값을 double 자료형 실수로 반환하는 메소드이다. func()
메소드를 정의하여 아래 코드를 완성하시오.
*/
public class Test {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 2;
		double value = func(x, y, z);
		System.out.println(value); // 실행결과 -0.5
	}

	private static double func(int x, int y, int z) {
		double result=0;
		result=(double)(x-y)/(double)z;
		return result;
	}
}