package chap04;
//�� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�, ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����.
public class Exercise04 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		while(num1+num2!=5) {
			System.out.println(num1 + "," + num2);
			num1 = (int)(Math.random()*6) +1;
			num2 = (int)(Math.random()*6) +1;
		}
	}
}
