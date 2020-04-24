import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String mileStr = JOptionPane.showInputDialog("마일(mile)값을 입력하세요");
		int mile = Integer.parseInt(mileStr);
		double km = mile * 1.609;
		String message = mile + "마일(mile)은 " + km + " 킬로미터(km)입니다.";
		JOptionPane.showMessageDialog(null, message);
	}
}