package chap04;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90) //{}로 감싸지 않아서 if랑 상관없이 아래 두 문장이 프린트됨
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다.");
	}

}
