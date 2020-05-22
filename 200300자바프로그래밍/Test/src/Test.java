/*
문자열 실습 B
다음은 입력창에 길이 3이상의 문자열을 입력 후 OK버튼을 클릭하면 입력된 문자열
의 왼쪽 끝 세 문자들로 이루어진 문자열과 오른쪽 끝 세 문자들로 이루어진 문자열
을 화면에 출력하는 코드와 그 실행 예시이다. 아래 코드를 완성하시오.
*/
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("문자열 입력");
		String prefix = s.substring(0, 3);
		String postfix = s.substring(s.length() - 3);
		System.out.println(prefix);
		System.out.println(postfix);
	}
}
/*
입력값
경성대학교 소프트웨어학과

실행결과
경성대
어학과
*/