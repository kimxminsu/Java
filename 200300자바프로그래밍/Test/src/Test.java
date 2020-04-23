public class Test {
	public static void main(String[] args) {
		int box1Weight = 50;
		int box2Weight = 300;
		
		int temp = box1Weight;
		box1Weight = box2Weight;
		box2Weight = temp;
		
		System.out.println(box1Weight);
		System.out.println(box2Weight);
	}
}