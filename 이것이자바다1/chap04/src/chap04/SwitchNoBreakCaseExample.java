package chap04;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;//8~8+4-1=>8���� 4��
		System.out.println("[����褤: " + time + " ��]");
		
		switch(time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		default: 
			System.out.println("�ܱ��� �����ϴ�.");
		}
		
	}

}
