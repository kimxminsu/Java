import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String scoreStr = JOptionPane.showInputDialog("성적(0-100)을 입력하세요");
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
		String message = "성적 " + score + " 의 학점은 " + grade + "입니다.";
		JOptionPane.showMessageDialog(null, message);
	}
}