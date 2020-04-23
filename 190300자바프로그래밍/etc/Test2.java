package example;

public class Test2 {

	public static void main(String[] args) {
		String title = "ÀÚ·á±¸Á¶";
		int year = 2018;
		double time = 2.5;
		boolean yn = true;
		char lan = 'ÇÑ';
		
		String name = "È«±æµ¿";
		int age = 23;
		
		Student student = new Student();
		student.setName("±è´Ù´Ù");
		student.setAge(55);
		System.out.println(student);
		
		Student student2 = new Student("È«±æµ¿", 23);
		
		System.out.println(student2.getName());
		
		System.out.println(student2.getAge());
		System.out.println(student2);

		student2.setName("±è³ª³ª");
		System.out.println(student2);
		
		
		
		
		
	}

}
