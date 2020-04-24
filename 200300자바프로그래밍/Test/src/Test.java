import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String fahrenheitStr = JOptionPane.showInputDialog("화씨 온도 값을 입력하세요");
		double fahrenheit = Integer.parseInt(fahrenheitStr);
		double celsius = (fahrenheit-32)*5/9;
		String message = "화씨 " +fahrenheit+"도는 섭씨 "+celsius+"도입니다.";
		JOptionPane.showMessageDialog(null, message);
	}
}