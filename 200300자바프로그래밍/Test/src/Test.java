/*
객체 메소드 실습 A
실습: Player 클래스에 객체 메소드 getAverage()를 정의하여 아래 코드가 p에
저장된 선수의 평균을 출력하도록 하시오.
*/
public class Test {
	public static void main(String[] args) {
		Player p = new Player("P001", 210, 205, 220);
		System.out.println(p.getAverage());
	}
}