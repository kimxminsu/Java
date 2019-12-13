import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
	public Test() {
		setPreferredSize(new Dimension(500, 500)); // 선호 크기
	}

	@Override
	protected void paintComponent(Graphics g1) { // 변수 이름 g1
		super.paintComponent(g1); // 이전 그림을 지운다.
		Graphics2D g = (Graphics2D) g1; // g1을 2D 2차원으로 변환
		g.drawImage(new ImageIcon("./푸른 언덕.jpg").getImage(), 0, 0, getSize().width, getSize().height, this);
		g.drawString("홍길동", 100, 5); // 글자
		g.drawString("홍길동", 100, 20);
		g.setColor(Color.BLUE); // 색
		g.setFont(new Font("맑은고딕", Font.BOLD, 40));
		g.drawString("안녕하세요. 반갑습니다.", 100, 100);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // 안티에일리어싱-부드러운 글씨
		g.drawString("안녕하세요. 반갑습니다.", 100, 200);
		g.setColor(Color.red);
		g.fillRect(10, 10, 50, 50); // g.drawRect와 비교해 볼 것
		g.setColor(Color.blue);
		g.fillOval(10, 70, 50, 50); // g.drawOval와 비교해 볼 것
		g.setColor(Color.green);
		g.fillRoundRect(10, 130, 50, 50, 20, 20); // g.drawRoundRect와 비교해 볼 것
		g.setColor(Color.magenta);
		g.fillArc(10, 190, 50, 50, 0, 270); // g.drawArc와 비교해 볼 것
		g.setColor(Color.orange);
		g.fillPolygon(new int[] { 30, 10, 30, 60 }, new int[] { 250, 275, 300, 275 }, 4); // g.drawPolygon //
																							// (30,250)->(10,275)->(30,300)->(60,275)->(30,250)
	}

	public static void main(String[] args) {
		JFrame w = new JFrame();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.add(new Test()); // add
		w.pack();
		w.setVisible(true);
	}
}