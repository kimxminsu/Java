import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("��Ģ���� ����� ���� ù��° ������ �Է��ϼ���");
		String num2 = JOptionPane.showInputDialog("��Ģ���� ����� ���� �ι�° ������ �Է��ϼ���");
		double n1 = Integer.parseInt(num1);
		double n2 = Integer.parseInt(num2);
		String message = n1 + " + " + n2 + " = " + (n1 + n2) + "\n" 
				+ n1 + " - " + n2 + " = " + (n1 - n2) + "\n"
				+ n1 + " X " + n2 + " = " + (n1 * n2) + "\n"
				+ n1 + " / " + n2 + " = " + (n1 / n2) + "\n";
		JOptionPane.showMessageDialog(null, message);
	}
}