/*
변수 x, y에 저장된 두 정수의 합, 차, 곱, 몫(정수)을 배열 stat에
저장한 후 반복문을 사용하여 stat의 내용을 출력하는 코드를 작
성하시오
변수 x, y는 프로그램 내에 그 값을 입력해 두시오
x=10, y=3에 대해 테스트하시오
*/
public class Test {
	public static void main(String[] args) {
		int x = 10, y = 3;
		int stat[] = new int[4];
		stat[0] = x + y;
		stat[1] = x - y;
		stat[2] = x * y;
		stat[3] = x / y;

		for (int i = 0; i < stat.length; i++) {
			System.out.println(stat[i]);
		}
	}
}