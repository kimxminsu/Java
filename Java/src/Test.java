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
		setPreferredSize(new Dimension(500, 500)); // ��ȣ ũ��
	}

	@Override
	protected void paintComponent(Graphics g1) { // ���� �̸� g1
		super.paintComponent(g1); // ���� �׸��� �����.
		Graphics2D g = (Graphics2D) g1; // g1�� 2D 2�������� ��ȯ
		g.drawImage(new ImageIcon("./Ǫ�� ���.jpg").getImage(), 0, 0, getSize().width, getSize().height, this);
		g.drawString("ȫ�浿", 100, 5); // ����
		g.drawString("ȫ�浿", 100, 20);
		g.setColor(Color.BLUE); // ��
		g.setFont(new Font("�������", Font.BOLD, 40));
		g.drawString("�ȳ��ϼ���. �ݰ����ϴ�.", 100, 100);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // ��Ƽ���ϸ����-�ε巯�� �۾�
		g.drawString("�ȳ��ϼ���. �ݰ����ϴ�.", 100, 200);
		g.setColor(Color.red);
		g.fillRect(10, 10, 50, 50); // g.drawRect�� ���� �� ��
		g.setColor(Color.blue);
		g.fillOval(10, 70, 50, 50); // g.drawOval�� ���� �� ��
		g.setColor(Color.green);
		g.fillRoundRect(10, 130, 50, 50, 20, 20); // g.drawRoundRect�� ���� �� ��
		g.setColor(Color.magenta);
		g.fillArc(10, 190, 50, 50, 0, 270); // g.drawArc�� ���� �� ��
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