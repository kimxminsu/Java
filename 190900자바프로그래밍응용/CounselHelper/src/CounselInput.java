import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class CounselInput extends JTabbedPane {
	private JTextField textField_name;
	private JTextArea textArea_memo;
	private JComboBox comboBox_address;
	private JRadioButton radiobutton_male;
	private JRadioButton radiobutton_female;
	private JCheckBox checkBox_foreigner;

	public CounselInput() {

		JPanel panel = new JPanel();
		addTab("상담입력", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("상담신청자 이름 ");
		panel_1.add(lblNewLabel);

		textField_name = new JTextField();
		panel_1.add(textField_name);
		textField_name.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("거주지역 ");
		panel_1.add(lblNewLabel_1);

		comboBox_address = new JComboBox();
		comboBox_address.setModel(new DefaultComboBoxModel(new String[] { "서울", "부산", "기타" }));
		panel_1.add(comboBox_address);

		JLabel lblNewLabel_2 = new JLabel("성별");
		panel_1.add(lblNewLabel_2);

		radiobutton_male = new JRadioButton("남자");
		panel_1.add(radiobutton_male);

		radiobutton_female = new JRadioButton("여자");
		panel_1.add(radiobutton_female);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radiobutton_male);
		buttonGroup.add(radiobutton_female);

		JLabel lblNewLabel_3 = new JLabel("     ");
		panel_1.add(lblNewLabel_3);

		checkBox_foreigner = new JCheckBox("외국인 여부");
		panel_1.add(checkBox_foreigner);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("새 상담 입력");
		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("상담저장");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveMemo();
			}
		});
		panel_2.add(btnNewButton_1);

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);

		textArea_memo = new JTextArea();
		textArea_memo.setBorder(new EmptyBorder(10, 10, 10, 10));
		scrollPane.setViewportView(textArea_memo);

		JLabel lblNewLabel_4 = new JLabel("상담입력");
		lblNewLabel_4.setBorder(new EmptyBorder(10, 10, 10, 10));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblNewLabel_4);
	}

	protected void saveMemo() {
		String name = textField_name.getText();
		if (name.equals("")) {
			message("이름을 입력하세요.");
			return;
		}
		String memo = textArea_memo.getText();
		if (memo.equals("")) {
			message("상담 내용을 입력하세요.");
			return;
		}
		memo = memo.replaceAll("\\s+", " ");
		String address = (String) comboBox_address.getSelectedItem();
		if (!radiobutton_male.isSelected() && !radiobutton_female.isSelected()) {
			message("성별을 선택하세요");
			return;
		}
		String gender = radiobutton_female.isSelected() ? "여자" : "남자";
		String foreigner = checkBox_foreigner.isSelected() ? "외국인" : "한국인";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss (E)");
		String date = sdf.format(new Date());
		String v = date + "\t" + name + "\t" + address + "\t" + gender + "\t" + foreigner + "\t" + memo;

		try {
			FileWriter oF = new FileWriter("memo.txt", true);
			oF.write(v + "\n");
			oF.close();
			message("상담 저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void message(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
}
