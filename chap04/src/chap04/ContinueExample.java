package chap04;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue; //�ؿ� i�� ����Ʈ���� �ʰ� �ٽ� ���� for������ �ö󰣴�
			}
			System.out.println(i);
		}
	}

}
