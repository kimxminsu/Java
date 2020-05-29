public class Calc {
	static double PI = 3.14159;

	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	public static double areaOfCircle(double radius) {
		return radius * radius * PI;
	}
}