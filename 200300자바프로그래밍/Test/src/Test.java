/*
�Ʒ� basicMath()�� �� �Ǽ��� �Ķ���ͷ� ���޹޾� �� ��,��,��,
��(����������)�� �Ǽ� �迭�� ��� ��ȯ�ϴ� �޼ҵ��̴�. �Ʒ�
�ڵ尡 ���� �����ϵ��� basicMath() �޼ҵ带 �ϼ��Ͻÿ�.
*/
public class Test {
	public static void main(String[] args) {
		double x = 3.0, y = 5.0;
		double v[] = basicMath(x, y);
		System.out.println("��=" + v[0]);
		System.out.println("��=" + v[1]);
		System.out.println("��=" + v[2]);
		System.out.println("��(������ ����)=" + v[3]);
	}

	private static double[] basicMath(double x, double y) {
		double calc[] = new double[4];
		calc[0] = x + y;
		calc[1] = x - y;
		calc[2] = x * y;
		calc[3] = x / y;
		return calc;
	}
}
/*
������
�� = 8.0
�� = -2.0
�� = 15.0
��(������ ����) = 0.6
*/