
public class Student extends Person{
	String name;
	
	public Student(String id, String name) {
		super(id);
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+","+name;
	}
}
