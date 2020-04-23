package Test;

public class Person {
	String name;
	int height;
	int weight;
	
	public Person (String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public Person() {
		
	}
	
	public Person(int height, int weight) {
		this.name = "±è¹Î¼ö";
		this.height = height;
		this.weight = weight;
	}
	
	public float bmi() {
		
		return (float)this.weight / this.height;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.height + " " + this.weight;
	} 
	
}
