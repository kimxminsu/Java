package no1;

public class Test2 {
	public static void main(String[]args) {
		Student s1;
		Student s2;
		Student s3;
		s1=new Student(); //�̰� ���ϸ� ������
		s2=new Student();
		s3=new Student();
		s1.name="��ö��";
		s1.gender='��';
		s2.name="�赿��";
		s2.gender='��';
		s3.name="�ڿ���";
		s3.gender='��';
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s2.name);
		System.out.println(s2.gender);
		System.out.println(s3.name);
		System.out.println(s3.gender);
	}
}
