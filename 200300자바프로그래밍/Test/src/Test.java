/*
�Ʒ� �ڵ��� charPrint()�� �ݺ� ����� ���ڿ� �� Ƚ���� �Ķ��
�ͷ� ���޹޾� ȭ�鿡 ����ϴ� �޼ҵ��̴�. �Ʒ� ��������
�����Ͽ� �� �ڵ尡 ���� ����ǵ��� charPrint() �޼ҵ带 ����
�Ͻÿ�.
*/
public class Test {
	public static void main(String[] args) {
		charPrint('=', 15);
		System.out.println("����������");
		charPrint('=', 15);
	}

	private static void charPrint(char c, int i) {
		while(i>0) {
			System.out.print('=');
			i--;
		}
		System.out.println();
	}
}