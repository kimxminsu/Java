import java.awt.Graphics;

import javax.swing.JFrame;

public class Test extends JFrame {
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(0, 0, 100, 100); // TitleBar�� ������ JFrame�� ���� ����
	}

	public static void main(String[] args) {
		new Test().setVisible(true);
	}
}