public class Test {
	public static void main(String[] args) {
		int score=89;
		if(score>=60) {
			if(score>=70) {
				if(score>=80) {
					if(score>=90) System.out.println('A');
					else {
					System.out.println('B');}
				}
				else {
				System.out.println('C');}
			}
			else {
			System.out.println('D');}
		}
		else {
		System.out.println('F');}
	}
}