/*
�Ʒ� �ڵ��� func()�� �� ���� x, y, z�� �Ķ���ͷ� ���޹޾�
(x-y)/z�� ���� double �ڷ��� �Ǽ��� ��ȯ�ϴ� �޼ҵ��̴�. func()
�޼ҵ带 �����Ͽ� �Ʒ� �ڵ带 �ϼ��Ͻÿ�.
*/
public class Test {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 2;
		double value = func(x, y, z);
		System.out.println(value); // ������ -0.5
	}

	private static double func(int x, int y, int z) {
		double result=0;
		result=(double)(x-y)/(double)z;
		return result;
	}
}