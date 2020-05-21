/*
아래 코드의 charPrint()는 반복 출력할 문자와 그 횟수를 파라미
터로 전달받아 화면에 출력하는 메소드이다. 아래 실행결과를
참고하여 이 코드가 정상 실행되도록 charPrint() 메소드를 정의
하시오.
*/
public class Test {
	public static void main(String[] args) {
		charPrint('=', 15);
		System.out.println("국내기업목록");
		charPrint('=', 15);
	}

	private static void charPrint(char c, int i) {
		while(i>0) {
			System.out.print('=');
			i--;
		}
		System.out.println();
	}
}