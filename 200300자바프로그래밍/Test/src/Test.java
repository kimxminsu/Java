/*
객체실습 F
점수 클래스 Score를 다음과 같이 정의하시오
필드변수명(설명,자료형): langScore(국어점수,double), mathScore(수학점수,double), engScore(영어점수,double)
학생 클래스 Student를 다음과 같이 정의하시오
필드변수명(설명,자료형): id(학번,String), score(점수,Score)
다음은 클래스 Student의 객체를 생성한 후 그 정보를 출력하는 코드와 그 실행 결과를 보인 것이다. 아래 코드의 빈 곳을 완성하시오
*/
public class Test {
	public static void main(String[] args) {
		Student s;
		s=new Student();
		s.id="S-001";
		s.score=new Score();
		s.score.langScore=100.0;
		s.score.engScore=80.0;
		s.score.mathScore=90.0;
		System.out.println("학번: " + s.id);
		System.out.println("국어점수: " + s.score.langScore);
		System.out.println("영어점수: " + s.score.engScore);
		System.out.println("수학점수: " + s.score.mathScore);
	}
}
/*
학번: S-001
국어점수: 100.0
영어점수: 80.0
수학점수: 90.0
*/