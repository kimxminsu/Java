/*
문자열 실습 E
다음은 입력창에 대쉬문자(-)로 분리된 2개 이상의 국가명을 입력 후 OK버튼을 클릭
하면 입력된 국가명 중 가장 왼쪽 국가명과 가장 오른쪽 국가명을 화면에 출력하는
코드와 그 실행 예시이다. 아래 코드를 완성하시오.
*/
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("문자열 입력");
		String t[]=s.split("-");
		System.out.println(t[0]);
		System.out.println(t[t.length-1]);
	}
}
/*
입력값
한국-미국-영국-독일-스위스

실행결과
한국
스위스
*/

/*
L14
문제점:
t[t.length]라고 생각해서 계속 오류가 일어났다.
혹시나 문자의 길이를 구할때처럼 t.length()를 시도했으나
	System.out.println(t[t.length()]);
또 오류가 났고,
[]안에는 t.length가 안되는가 싶어서 새로운 변수에 t.length를 넣어서 시도했으나
	int n = t.length;
	System.out.println(t[n]);
여전히 오류가 발생했다.

해결:
t.length는 5이기 때문에 t[5]는 존재하지 않는다.
따라서 t[t.length-1]로 수정해야한다.
*/