package chap05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1]); //������ü ����
		System.out.println( strArray[0] == strArray[2]); //�ٸ���ü ����
		System.out.println( strArray[0].contentEquals(strArray[2]) ); //���ڿ��� ����
	}

	
	
	
}