/*
�Ʒ� printSum()�� �� ������ �Ķ���ͷ� ���޹޾� �� ���� ���
�ϴ� �޼ҵ��̴�. �Ʒ� �ڵ尡 ���� �����ϵ��� printSum() �޼�
�带 �ϼ��Ͻÿ�.
*/
public class Test {
	public static void main(String[] args) {
		int x = 10, y = 30;
		printSum(x, y); // ������ 40
	}

	private static void printSum(int x, int y) {
		int sum = 0;
		sum = x + y;
		System.out.println(sum);
	}
}