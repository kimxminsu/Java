package chap04;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		//System.out.println("1~" + i + " 합 : " + sum); //i는 for문 밖에서 사용X
	}

}
