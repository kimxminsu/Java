/*
Ŭ���� Test�� �Ʒ� ���� ���ÿ� ���� ����� ���ڷ� �־��� ��
���� ���ڿ��� �����ϴ� ���� ���� ����Ѵٰ� �Ѵ�. Ŭ����
Test�� �ۼ��Ͻÿ�.

java Test 11 22
33
���������Ʈ������ ���� ����
*/
public class Test {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
	}
}
/*
������
���1)��Ŭ���� ���-�����ư �ڼ���-Run Configuration-java Application-Test-arguments-Program arguments-11 22 �Է�
���2)cmd-cd ���ϰ��(src)-javac Test.java-(Test.class ������)-java Test 11 22
*/