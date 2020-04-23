package example;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "강인수";
		person.height = 175;
		person.weight = 65;
		
		Person person2 = new Person("ABC", 180, 65);
		
		Person person3 = new Person(210, 90);
		person3.name = "가나다";
		
		Person person4 = new Person(150, 40);
		

		
		float bmi = person.bmi();

		
		System.out.println(person);
		System.out.println(bmi);
		System.out.println(person2);
		
		System.out.println(person2.bmi());
		System.out.println(person3);
		System.out.println(person3.bmi());
		System.out.println(person4);
		System.out.println(person4.bmi());
		
	}
	
	
	

}
