package chap03;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; //int���� �ʰ�
		System.out.println(z); //�����Ⱚ
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = x1 * y1; //���� �ʰ� ����
		System.out.println(z1); //����
		
	}

}
