package example;

public class Test2 {

	public static void main(String[] args) {
		String title = "�ڷᱸ��";
		int year = 2018;
		double time = 2.5;
		boolean yn = true;
		char lan = '��';
		
		String name = "ȫ�浿";
		int age = 23;
		
		Student student = new Student();
		student.setName("��ٴ�");
		student.setAge(55);
		System.out.println(student);
		
		Student student2 = new Student("ȫ�浿", 23);
		
		System.out.println(student2.getName());
		
		System.out.println(student2.getAge());
		System.out.println(student2);

		student2.setName("�質��");
		System.out.println(student2);
		
		
		
		
		
	}

}
