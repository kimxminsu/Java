import javax.swing.JOptionPane;

public class Test52 {
	public static void main(String[]args) {
		String v=JOptionPane.showInputDialog("정수를 입력하세요.");
		int jungsu=Integer.parseInt(v);
		if(jungsu%2==1) v="홀수";
		else v="짝수";
		JOptionPane.showMessageDialog(null,v);
	}
}
