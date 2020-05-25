/*
객체 실습 D
날짜 클래스 DateInfo를 다음과 같이 정의하시오
	필드변수명(설명,자료형): year(연도,int), month(월,int), day(일,int)
직원 클래스 Employee를 다음과 같이 정의하시오
	필드변수명(설명,자료형): id(직원아이디,String), joinDate(직원입사일,DateInfo)
다음은 클래스 Employee의 객체를 생성한 후 그 정보를 출력하는 코드와 그 실행 결과를 보인 것이다
. 아래 코드의 빈 곳을 완성하시오
*/
public class Test {
	public static void main(String[] args) {
		Employee e;
		e=new Employee();
		e.id="EMP-123";
		e.joinDate=new DateInfo();
		e.joinDate.year=2015;
		e.joinDate.month=3;
		e.joinDate.day=2;
		System.out.println("직원 아이디: "+e.id);
		System.out.println("직원 입사일: "+e.joinDate.year+"년"+e.joinDate.month+"월"+e.joinDate.day+"일");
	}
}
/*
직원 아이디: EMP-123
직원 입사일: 2015년3월2일
*/