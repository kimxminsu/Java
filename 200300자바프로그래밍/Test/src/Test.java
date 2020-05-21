/*
아래 basicMath()는 두 실수를 파라미터로 전달받아 그 합,차,곱,
몫(나머지포함)을 실수 배열에 담아 반환하는 메소드이다. 아래
코드가 정상 동작하도록 basicMath() 메소드를 완성하시오.
*/
public class Test {
	public static void main(String[] args) {
		double x = 3.0, y = 5.0;
		double v[] = basicMath(x, y);
		System.out.println("합=" + v[0]);
		System.out.println("차=" + v[1]);
		System.out.println("곱=" + v[2]);
		System.out.println("몫(나머지 포함)=" + v[3]);
	}

	private static double[] basicMath(double x, double y) {
		double calc[] = new double[4];
		calc[0] = x + y;
		calc[1] = x - y;
		calc[2] = x * y;
		calc[3] = x / y;
		return calc;
	}
}
/*
실행결과
합 = 8.0
차 = -2.0
곱 = 15.0
몫(나머지 포함) = 0.6
*/