package chap03;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; //int범위 초과
		System.out.println(z); //쓰레기값
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = x1 * y1; //범위 초과 안함
		System.out.println(z1); //정상값
		
	}

}
