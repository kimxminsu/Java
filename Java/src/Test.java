import java.awt.Graphics;

import javax.swing.JFrame;

public class Test extends JFrame {
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500); //화면 창 (윈도우) 크기
	}

	@Override
	public void paint(Graphics g) { //실제 그림 그려짐, Graphics 객체=스케치북
//		메모리 상에 있는거를 그래픽카드로 보내서 디스플레이에서 실제 보이게함
		super.paint(g);
		g.drawLine(0, 0, 100, 100); // TitleBar를 포함한 JFrame의 원점 기준
//		0,0 -> 100,100 대각선으로 그려짐
//		실제로 실행하면 0,0은 제목?부분에 가려져 ㅠㅠ JFrame 에 그려서 생긴 문제
	}

	public static void main(String[] args) {
		new Test().setVisible(true);
	}
}