package chap04;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�."); //grade���� �빮��'B'�ε� �ҹ���'b'���� ó���ǵ��� ��
			break;
		default:
			System.out.println("�մ��Դϴ�");
		}
	}

}