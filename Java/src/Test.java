import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
	public Test() {
		setPreferredSize(new Dimension(500, 500));
	}

	@Override
	protected void paintComponent(Graphics g) { //JFrame 과는 다름
		super.paintComponent(g);
		g.drawLine(0, 0, 100, 100);
		g.drawLine(400, 400, 500, 500);
	}

	public static void main(String[] args) {
		JFrame w = new JFrame();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.add(new Test());
		w.pack(); // JPanel 크기만큼 조정
		w.setVisible(true);
	}
}