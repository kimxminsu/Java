/*
������ � �ڵ�� �� ���� ����̴�
�� �ڵ�� �ݺ����� ����Ͽ� department �迭 �� �� ���ڸ� ���� ��
ĭ�� ������ ��� ����Ѵٰ� �Ѵ�. �� �ڵ带 �ϼ��Ͻÿ�.
������
�� �� Ʈ �� �� �� ��
*/
public class Test {
	public static void main(String[] args) {
		int x = 10, y = 3;
		int stat[] = new int[4];
		stat[0] = x + y;
		stat[1] = x - y;
		stat[2] = x * y;
		stat[3] = x / y;

		for (int i = 0; i < stat.length; i++) {
			System.out.println(stat[i]);
		}
	}
}