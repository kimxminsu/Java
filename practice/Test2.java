package no1;

public class Test2 {
	public static void main(String[]args) {
		Student s1;
		Student s2;
		Student s3;
		s1=new Student(); //ÀÌ°Å ¾ÈÇÏ¸é ¿À·ù³²
		s2=new Student();
		s3=new Student();
		s1.name="±èÃ¶¼ö";
		s1.gender='³²';
		s2.name="±èµ¿¼ö";
		s2.gender='³²';
		s3.name="¹Ú¿µÈñ";
		s3.gender='¿©';
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s2.name);
		System.out.println(s2.gender);
		System.out.println(s3.name);
		System.out.println(s3.gender);
	}
}
