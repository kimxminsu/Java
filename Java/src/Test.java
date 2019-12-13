import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
	int canvasWidth = 500;
	int canvasHeight = 500;
	int dx = 5, dy = 5; // x에서 얼만큼 더해서 위치를 움직일지
	int x, y, diameter = 30;
	Color color;

	public Test() {
		setPreferredSize(new Dimension(canvasWidth, canvasHeight));
		x = (canvasWidth - diameter) / 2; // 초기위치,
		y = canvasHeight - diameter;
		Random random = new Random();
		color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
		new Thread(new Runnable() {
			@Override
			public void run() {
				GameLoop();
			}
		}).start();
	}

	protected void GameLoop() {
		while (true) {
			GameUpdate();
			repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
			}
		}
	}

	protected void GameUpdate() {
		if (x < 0 || x + diameter > canvasWidth) // 오른쪽 끝이 벽을 넘어서면 //x<0 : 왼쪽 벽에 부딪히면
			dx *= -1; // 왼쪽으로 5만큼 //오른쪽으로 5만큼
		if (y < 0 || y + diameter > canvasHeight) // 위쪽 벽에 부딪히면
			dy *= -1; // 아래로 5만큼
		x += dx; // 오른쪽으로 5만큼
		y -= dy; // 위로 5만큼
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(color);
		g2.fillOval(x, y, diameter, diameter);
	}

	public static void main(String[] args) {
		JFrame w = new JFrame();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.add(new Test());
		w.pack();
		w.setVisible(true);
	}
}