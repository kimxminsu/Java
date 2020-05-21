/*
문자열 실습 A
다음은 입력창에 길이 1 이상의 문자열을 입력 후 OK버튼을 클릭하면 입력된 문자
열의 첫 문자와 마지막 문자를 화면에 출력하는 코드와 그 실행 예시이다. 아래 코드
를 완성하시오.
*/
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("문자열 입력");
		char firstChar = s.charAt(0);
		char lastChar = s.charAt(s.length()-1);
		System.out.println(firstChar);
		System.out.println(lastChar);
	}
}
/*
입력값
경성대학교 소프트웨어학과

실행결과
경
과
*/