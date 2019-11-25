import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchJPanel extends JPanel {
	private JTextField textField;
	private JTable table;

	public SearchJPanel() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uB3C4\uC11C\uBA85", "\uC800\uC790\uBA85",
				"\uCD9C\uD310\uB144\uB3C4", "\uCD9C\uD310\uC0AC" }));
		panel.add(comboBox);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "\uB3C4\uC11C\uBA85",
				"\uC800\uC790\uBA85", "\uCD9C\uD310\uB144\uB3C4", "\uCD9C\uD310\uC0AC" }));
		scrollPane.setViewportView(table);
	}
}