/*
private 실습 A
회원 클래스 Member를 다음 조건에 따라 작성하시오
필드변수명(설명,자료형): email(메일주소,String), joinDate(가입일-8자리,String)
클래스 외부로부터의 직접 접근 불허 설정할 것
메일주소와 가입일을 파라미터로 전달받아 대응하는 필드에 대입하는 생성자
회원의 email을 반환하는 public 메소드 getEmail()
새로운 메일주소를 파라미터로 전달받아 객체의 기존 메일주소를 변경하는 메소드 setEmail()
회원의 joinDate를 8자리 숫자 문자열로 반환하는 public 메소드 getJoinDate()
회원의 가입년도를 4자리 숫자 문자열로 반환하는 public 메소드 getJoinYear()

클래스 Test의 main() 내 다음 절차를 코딩하시오
Member 객체(메일주소 yhkim@ks.ac.kr, 가입일 20190214 ) 생성
Member 객체의 메일주소와 가입일을 출력
Member 객체의 메일주소를 yhkim@cs.ks.ac.kr로 변경
Member 객체의 메일주소와 가입일을 출력
Member 객체의 가입년도를 출력
*/
public class Test {
	public static void main(String[] args) {
		Member member;
		member=new Member("yhkim@ks.ac.kr", "20190214");
		System.out.println(member);
		member.setEmail("yhkim@cs.ks.ac.kr");
		System.out.println(member);
		System.out.println(member.getJoinYear());
	}
}