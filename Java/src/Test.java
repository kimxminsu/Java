import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
	int x, y, width = 100, height = 100;

	public Test() {
		setPreferredSize(new Dimension(500, 500));
		new Thread(new Runnable() {
			@Override
			public void run() {
				AnimationLoop();
			}
		}).start();
	}

	protected void AnimationLoop() {
		while (true) {
			AnimationUpdate();
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	private void AnimationUpdate() {
		Random random = new Random();
		x = random.nextInt(500);
		y = random.nextInt(500);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Random random = new Random();
		g2.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		g2.fillOval(x, y, width, height);
	}

	public static void main(String[] args) {
		JFrame w = new JFrame();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.add(new Test());
		w.pack();
		w.setVisible(true);
	}
}