package chap04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {//증감량이 0.1보다 약간 커서 1.0까지 안됨
			System.out.println(x);
		}
	}

}
