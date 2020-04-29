/*
다음은 어떤 코드와 그 실행 결과이다
이 코드는 반복문을 사용하여 department 배열 내 각 문자를 공백 한
칸씩 간격을 띄어 출력한다고 한다. 이 코드를 완성하시오.
실행결과
소 프 트 웨 어 학 과
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