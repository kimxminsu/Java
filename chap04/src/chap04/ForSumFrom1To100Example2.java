package chap04;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0; //i�� for�� �ۿ��� ����
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " �� : " + sum);//i ��밡��
	}

}
