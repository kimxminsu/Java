import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("사칙연산 계산을 위한 첫번째 정수를 입력하세요");
		String num2 = JOptionPane.showInputDialog("사칙연산 계산을 위한 두번째 정수를 입력하세요");
		double n1 = Integer.parseInt(num1);
		double n2 = Integer.parseInt(num2);
		String message = n1 + " + " + n2 + " = " + (n1 + n2) + "\n" 
				+ n1 + " - " + n2 + " = " + (n1 - n2) + "\n"
				+ n1 + " X " + n2 + " = " + (n1 * n2) + "\n"
				+ n1 + " / " + n2 + " = " + (n1 / n2) + "\n";
		JOptionPane.showMessageDialog(null, message);
	}
}