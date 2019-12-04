import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class CounselSearch extends JTabbedPane {
	private JTextField textField_query;
	private JTable table;
	private JComboBox comboBox_queryField;
	private JButton button_search;
	private Connection DB;//

	public CounselSearch(CounselMain counselMain) {//

		JPanel panel = new JPanel();
		addTab("상담검색", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);

		comboBox_queryField = new JComboBox();
		comboBox_queryField.setModel(new DefaultComboBoxModel(new String[] { "상담일시", "이름", "지역", "성별", "외국인", "상담내용" }));
		panel_1.add(comboBox_queryField);

		textField_query = new JTextField();
		panel_1.add(textField_query);
		textField_query.setColumns(10);

		button_search = new JButton("상담검색");
		button_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchMemo();
			}
		});
		panel_1.add(button_search);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panel_2, popupMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("상세보기");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				String v = "상담내용\n\n" + table.getModel().getValueAt(row, 5);
				JOptionPane.showMessageDialog(CounselSearch.this, v);
			}
		});
		popupMenu.add(mntmNewMenuItem);

		JLabel lblNewLabel = new JLabel("Page 0 / 0   ");
		panel_2.add(lblNewLabel);

		JButton button = new JButton("이전");
		panel_2.add(button);

		JButton btnNewButton_1 = new JButton("다음");
		panel_2.add(btnNewButton_1);

		JSlider slider = new JSlider();
		panel_2.add(slider);

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() != MouseEvent.BUTTON1)
					return;
				popupMenu.show(e.getComponent(), e.getX(), e.getY());
			}
		});

		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "상담일시", "이름", "지역", "성별", "외국인 여부", "상담내용" }));
		scrollPane.setViewportView(table);
	}

	protected void searchMemo() {
		String fieldName[]= {"date","name","address","gender","foreigner","memo"};
		int queryFieldIndex = comboBox_queryField.getSelectedIndex();
		String s=fieldName[queryFieldIndex];//if 3=gender 0=date
		String query = textField_query.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		try {
//			Class.forName("org.sqlite.JDBC"); // JDBC 대문자로 입력
//			Connection DB = DriverManager.getConnection("jdbc:sqlite:C:/Temp/DB_memo.db"); // C:/Temp/DB_Univ.db 파일이 생성되어 있어야 함
			Statement sql = CounselMain.DB.createStatement();
			ResultSet cursor = sql.executeQuery("select * from TB_memo where"+fieldName[comboBox_queryField.getSelectedIndex()]+"like '%"+query+"%'");
			while (cursor.next()) {
//				String v=cursor.getString(1)+"\t"+cursor.getString(2)+"\t"+cursor.getString(3)+"\t"+cursor.getString(4)+"\t"+cursor.getString(5)+"\t"+cursor.getString(6);
//				String w[]=v.split("\t");
				String v[]={cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6)};
				model.addRow(v);
				System.out.println(cursor.getString(1) + "\t" + cursor.getString(2) + "\t" + cursor.getString(3));
			}
			table.setModel(model);
			DB.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		try {
//			FileReader		fr=new FileReader("memo.txt");
//			BufferedReader	iF=new BufferedReader(fr);
//			while(true) {
//				String	line=iF.readLine();
//				if(line==null) break; // 파일의 끝
//				String	v[]=line.split("\t"); //문자열배열
//				if(v[queryFieldIndex].contains(query)==false) continue;
//				model.addRow(v);
//			}
//			iF.close();
//			table.setModel(model);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
