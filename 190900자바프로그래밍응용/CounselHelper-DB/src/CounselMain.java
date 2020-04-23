import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class CounselMain extends JFrame {
	CounselInput	counselInput=new CounselInput();
	CounselSearch	counselSearch=new CounselSearch(this);
	static Connection DB;
	public CounselMain() {
		try {
			Class.forName("org.sqlite.JDBC");
			DB = DriverManager.getConnection("jdbc:sqlite:C:/Temp/DB_Univ.db");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
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
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("도움말");
		menuBar.add(mnNewMenu_1);
	}
	public static void main(String[] args) {
		CounselMain	counselMain=new CounselMain();
		counselMain.setVisible(true);
	}
}
