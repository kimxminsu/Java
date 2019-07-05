package chap04;
//두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
public class Exercise04 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		while(num1+num2!=5) {
			System.out.println(num1 + "," + num2);
			num1 = (int)(Math.random()*6) +1;
			num2 = (int)(Math.random()*6) +1;
		}
	}
}
