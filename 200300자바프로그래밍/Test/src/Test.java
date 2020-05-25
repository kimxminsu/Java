/*
클래스 실습 F
다음 조건에 따라 클래스 YMD를 정의하시오
필드변수명(설명,자료형): year(연도,int), month(월, int), day(일, int)
연,월,일을 파라미터로 전달받아 대응하는 필드에 대입하는 생성자
연,월,일 값을 다음 예와 같은 형식의 문자열로 반환하는 toString() 메소드 (예: 2019년12월31일)
다음은 YMD 객체를 생성하고 그 내용을 출력하는 코드와 실행 결과를 보인 것이다. 이 코드가 정상
동작하도록 YMD 클래스를 정의하시오. 
*/
public class Test {
	public static void main(String[] args) {
		YMD date = new YMD(2019, 12, 31);
		System.out.println(date.toString());
		System.out.println(date);
	}
}
/*
2019년12월31일
2019년12월31일
*/