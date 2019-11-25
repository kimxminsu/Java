import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Test extends JFrame {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;

	public Test() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel_Search = new JPanel();
		tabbedPane.addTab("검색", null, panel_Search, null);
		panel_Search.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel_Search.add(panel, BorderLayout.NORTH);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uB3C4\uC11C\uBA85", "\uC800\uC790\uBA85",
				"\uCD9C\uD310\uB144\uB3C4", "\uCD9C\uD310\uC0AC" }));
		panel.add(comboBox);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		panel.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		panel_Search.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "도서명", "저자명", "출판년도", "출판사" }));
		scrollPane.setViewportView(table);

		JPanel panel_Borrow = new JPanel();
		tabbedPane.addTab("대출", null, panel_Borrow, null);

		JLabel label = new JLabel("\uB3C4\uC11C \uB4F1\uB85D\uBC88\uD638");

		JLabel lblNewLabel = new JLabel("\uB300\uCD9C\uC790 \uC544\uC774\uB514");

		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JButton btnNewButton_1 = new JButton("\uB300\uCD9C");
		GroupLayout gl_panel_Borrow = new GroupLayout(panel_Borrow);
		gl_panel_Borrow.setHorizontalGroup(gl_panel_Borrow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Borrow.createSequentialGroup().addGap(69)
						.addGroup(gl_panel_Borrow.createParallelGroup(Alignment.TRAILING).addComponent(btnNewButton_1)
								.addGroup(gl_panel_Borrow.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_Borrow.createSequentialGroup().addComponent(lblNewLabel)
												.addGap(18).addComponent(textField_2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_Borrow.createSequentialGroup().addComponent(label).addGap(18)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(150, Short.MAX_VALUE)));
		gl_panel_Borrow.setVerticalGroup(gl_panel_Borrow.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_Borrow
				.createSequentialGroup().addGap(74)
				.addGroup(gl_panel_Borrow.createParallelGroup(Alignment.BASELINE).addComponent(label).addComponent(
						textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_Borrow.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(btnNewButton_1).addContainerGap(57, Short.MAX_VALUE)));
		panel_Borrow.setLayout(gl_panel_Borrow);

		JPanel panel_Return = new JPanel();
		tabbedPane.addTab("반납", null, panel_Return, null);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.setVisible(true);
	}
}