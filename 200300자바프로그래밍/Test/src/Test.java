import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String fahrenheitStr = JOptionPane.showInputDialog("ȭ�� �µ� ���� �Է��ϼ���");
		double fahrenheit = Integer.parseInt(fahrenheitStr);
		double celsius = (fahrenheit-32)*5/9;
		String message = "ȭ�� " +fahrenheit+"���� ���� "+celsius+"���Դϴ�.";
		JOptionPane.showMessageDialog(null, message);
	}
}