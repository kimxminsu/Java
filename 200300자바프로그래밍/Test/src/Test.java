/*
객체 실습 A
다음은 Test 클래스의 미완성 코드와 그 실행 결과를 보인 것이다. 아래 코드가 정상
동작하도록 Student 클래스와 Test 클래스를 완성하시오.
	Student 클래스의 필드 id, numberOfFinishedSemesters, gender, gpa, foreignerYN의
	각각 문자열, 정수, 문자, 실수, 불리언 자료형으로 정의하시오.
*/
public class Test {
	public static void main(String[] args) {
		Student s;
		s=new Student(); //Student 객체 생성
		s.id="KSU-123";
		s.numberOfFinishedSemesters=2;
		s.gender='여';
		s.gpa=3.97;
		s.foreignerYN=true;
		System.out.println("학번=" + s.id);
		System.out.println("이수학기수=" + s.numberOfFinishedSemesters);
		System.out.println("성별=" + s.gender);
		System.out.println("평점=" + s.gpa);
		System.out.println("외국인여부=" + s.foreignerYN);
	}
}
/*
실행결과
학번=KSU-123
이수학기수=2
성별=여
평점=3.97
외국인여부=true
*/