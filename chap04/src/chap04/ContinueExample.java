package chap04;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue; //밑에 i를 프린트하지 않고 다시 위에 for문으로 올라간다
			}
			System.out.println(i);
		}
	}

}
