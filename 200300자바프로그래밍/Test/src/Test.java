/*
클래스 Test는 아래 실행 예시와 같이 명령행 인자로 주어진 두
숫자 문자열에 대응하는 수의 합을 출력한다고 한다. 클래스
Test를 작성하시오.

java Test 11 22
33
명령프롬프트에서의 실행 예시
*/
public class Test {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
	}
}
/*
실행방법
방법1)이클립스 상단-실행버튼 자세히-Run Configuration-java Application-Test-arguments-Program arguments-11 22 입력
방법2)cmd-cd 파일경로(src)-javac Test.java-(Test.class 생성됨)-java Test 11 22
*/