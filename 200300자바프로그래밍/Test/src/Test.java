import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String scoreStr = JOptionPane.showInputDialog("����(0-100)�� �Է��ϼ���");
		int score = Integer.parseInt(scoreStr);
		char grade = ' ';
		if (score >= 90) {
			grade = 'A';
		}
		if (score >= 80 && score < 90) {
			grade = 'B';
		}
		if (score >= 70 && score < 80) {
			grade = 'C';
		}
		if (score >= 60 && score < 70) {
			grade = 'D';
		}
		if (score < 70)
			grade = 'F';
		String message = "���� " + score + " �� ������ " + grade + "�Դϴ�.";
		JOptionPane.showMessageDialog(null, message);
	}
}