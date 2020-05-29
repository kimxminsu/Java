/*
static 실습 A
다음 Test 클래스가 정상 동작하도록 클래스 Calc를 작성하시오
Calc.max()는 파라미터로 전달받은 두 정수 중 큰 값을 반환한다
Calc.areaOfCircle()은 원의 반지름을 파라미터로 전달받아 원의 면적을 반환한다
원의 면적 계산을 위해 static field 변수 PI에 저장된 원주율값(3.14159로 가정)을 사용하시오
*/
public class Test {
	public static void main(String[] args) {
		int max = Calc.max(12, 34);
		System.out.println(max);
		System.out.println("원주율=" + Calc.PI);
		double radius = 2.0;
		double area = Calc.areaOfCircle(radius);
		System.out.println("원의 면적=" + area);
	}

}