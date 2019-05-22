package chap04;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다."); //grade값은 대문자'B'인데 소문자'b'에도 처리되도록 함
			break;
		default:
			System.out.println("손님입니다");
		}
	}

}