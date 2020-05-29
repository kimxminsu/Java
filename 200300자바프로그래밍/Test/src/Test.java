/*
오버로딩 실습 A
회원 클래스 Member를 다음 조건에 따라 작성하시오
	아래 Test 클래스가 정상 동작하도록 Employee 클래스를 수정하시오
	생성자 오버로딩 시 this()를 사용하시오
*/
public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee("E-001"); // 일반 직원
		Employee e2 = new Employee("E-002", 100); // 인턴 직원, 기본 월 급여액 100만원
		System.out.println(e1.getMonthlyPay()); // 월 급여액 출력
		System.out.println(e2.getMonthlyPay()); // 월 급여액 출력
	}
}