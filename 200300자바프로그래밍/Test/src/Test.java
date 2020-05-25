/*
클래스 실습 A
다음 조건에 따라 클래스 Location을 정의하시오
필드변수명(설명,자료형): country(국가명,String), city(도시명,String)
국가명과 도시명을 파라미터로 전달받아 대응하는 필드에 대입하는 생성자
다음은 Location 객체를 생성하고 그 내용을 출력하는 코드와 실행 결과를 보인 것이다. 이 코드가 정
상 동작하도록 Location 클래스를 정의하시오.
*/
public class Test {
	public static void main(String[] args) {
		Location loc;
		loc = new Location("한국", "부산");
		System.out.println("국가:" + loc.country);
		System.out.println("도시:" + loc.city);
	}
}
/*
국가:한국
도시:부산
*/