import javax.swing.JOptionPane;

public class Test52 {
	public static void main(String[]args) {
		String v=JOptionPane.showInputDialog("������ �Է��ϼ���.");
		int jungsu=Integer.parseInt(v);
		if(jungsu%2==1) v="Ȧ��";
		else v="¦��";
		JOptionPane.showMessageDialog(null,v);
	}
}
