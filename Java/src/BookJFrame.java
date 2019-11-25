import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class BookJFrame extends JFrame {
	public BookJFrame() {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		 getContentPane().add(tabbedPane, BorderLayout.CENTER);
		 SearchJPanel searchJPanel=new SearchJPanel();
		tabbedPane.addTab("검색", null, searchJPanel, null);
		 BorrowJPanel borrowJPanel=new BorrowJPanel();
		tabbedPane.addTab("대출", null, borrowJPanel, null);
		 ReturnJPanel returnJPanel=new ReturnJPanel();
		tabbedPane.addTab("반납", null, returnJPanel, null); 
	}

	public static void main(String args[]) {
		new BookJFrame().setVisible(true);
	}
}
