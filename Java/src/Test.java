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
	int dx = 5, dy = 5; // x���� ��ŭ ���ؼ� ��ġ�� ��������
	int x, y, diameter = 30;
	Color color;

	public Test() {
		setPreferredSize(new Dimension(canvasWidth, canvasHeight));
		x = (canvasWidth - diameter) / 2; // �ʱ���ġ,
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
		if (x < 0 || x + diameter > canvasWidth) // ������ ���� ���� �Ѿ�� //x<0 : ���� ���� �ε�����
			dx *= -1; // �������� 5��ŭ //���������� 5��ŭ
		if (y < 0 || y + diameter > canvasHeight) // ���� ���� �ε�����
			dy *= -1; // �Ʒ��� 5��ŭ
		x += dx; // ���������� 5��ŭ
		y -= dy; // ���� 5��ŭ
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