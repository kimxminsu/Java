/*
객체실습 E
이름 클래스 Name을 다음과 같이 정의하시오
필드변수명(설명,자료형): firstName(성 제외 이름,String), lastName(성,String)
사람 클래스 Person을 다음과 같이 정의하시오
필드변수명(설명,자료형): name(이름,Name)
다음은 클래스 Person의 객체를 생성한 후 그 정보를 출력하는 코드와 그 실행 결과를 보인 것이다. 아래 코드의 빈 곳을 완성하시오
*/
public class Test {
	public static void main(String[] args) {
		Person p;
		p=new Person();
		p.name=new Name();
		p.name.firstName="James";
		p.name.lastName="Brown";
		System.out.println("이름: " + p.name.firstName + " " + p.name.lastName);
	}
}
/*
실행결과
이름: James Brown
*/