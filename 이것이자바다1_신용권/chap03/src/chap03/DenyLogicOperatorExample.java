package chap03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play; //false
		System.out.println(play);
		
		play = !play; //true
		System.out.println(play);
	}

}
