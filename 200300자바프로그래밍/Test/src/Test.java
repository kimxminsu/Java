import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String mileStr = JOptionPane.showInputDialog("����(mile)���� �Է��ϼ���");
		int mile = Integer.parseInt(mileStr);
		double km = mile * 1.609;
		String message = mile + "����(mile)�� " + km + " ų�ι���(km)�Դϴ�.";
		JOptionPane.showMessageDialog(null, message);
	}
}