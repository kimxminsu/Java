package example;

public class Student {
	/*
	String name;
	int score;
	
	public Student() {
		
	}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	public void printName() {
		System.out.println(this.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.score;
	}*/
	
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.name + " " + this.age ;
	}
	
}

