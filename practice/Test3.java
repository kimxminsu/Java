package no1;

public class Test3 {
	public static void main(String[]args) {
		int n[]=new int[3];
		n[0]=77;
		
		Student studentArray[]=new Student[3];
		studentArray[0]=new Student();
		studentArray[0].name="±èÃ¶¼ö";
		studentArray[0].gender='³²';
		System.out.println(studentArray[0].name+","+studentArray[0].gender);
	}
}