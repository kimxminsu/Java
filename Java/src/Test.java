import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel implements KeyListener {
	boolean startFlag;
	int canvasWidth = 500;
	int canvasHeight = 500;
	int dx = 5, dy = 5;
	int x, y, diameter = 30;
	Color color;

	public Test() {
		setPreferredSize(new Dimension(canvasWidth, canvasHeight));
		x = (canvasWidth - diameter) / 2;
		y = canvasHeight - diameter;
		Random random = new Random();
		addKeyListener(this);
		setFocusable(true);
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
			if (startFlag)
				GameUpdate();
			repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
			}
		}
	}

	protected void GameUpdate() {
		if (x < 0 || x + diameter > canvasWidth)
			dx *= -1;
		if (y < 0 || y + diameter > canvasHeight)
			dy *= -1;
		x += dx;
		y -= dy;
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

	@Override
	public void keyPressed(KeyEvent e) {
		if (!startFlag && e.getKeyCode() == KeyEvent.VK_RIGHT) // 이걸 없애면 공이 움직이는 중에도 동작
			x += dx;
		if (!startFlag && e.getKeyCode() == KeyEvent.VK_LEFT)
			x -= dx;
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
			startFlag = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}