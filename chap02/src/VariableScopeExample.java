package sec06.exam01;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 - 15;
		if(v1>10) {
			int v2 = v1 - 10; ///if��� �ȿ��� v2�� �����߱� ������ if��� �ȿ����� ��� ����
		}
		int v3 = v1 + v2 + 5; //v2 ������ ����� �� ���� ������ ������ ������ ����
	}
}
