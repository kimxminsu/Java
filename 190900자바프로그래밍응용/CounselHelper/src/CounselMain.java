import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class CounselMain extends JFrame {

	CounselInput counselInput = new CounselInput();
	CounselSearch counselSearch = new CounselSearch();

	public CounselMain() {
		setSize(new Dimension(682, 470));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("상담관리");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("상담입력");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CounselMain.this.setContentPane(counselInput);
				CounselMain.this.revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("상담검색");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CounselMain.this.setContentPane(counselSearch);
				CounselMain.this.revalidate();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("끝내기");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "프로그램 실행을 계속하시겠습니까?", "실행 확인",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION)
					new CounselMain().setVisible(true);
				else
					System.exit(-1);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_1 = new JMenu("도움말");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("사용법");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "상담도우미 version-2019-0.1\n이 제품은 교육 실습용으로 제작되었습니다.");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
	}

	public static void main(String[] args) {
		CounselMain counselMain = new CounselMain();
		counselMain.setVisible(true);
	}
}
