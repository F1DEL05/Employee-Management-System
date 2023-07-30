package MainPKG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class After_Login extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton;
	private JTextField txtName;
	private JTextField txtPrice;
	private JTextField txtDepartment;
	private JLabel Big_Text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					After_Login frame = new After_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public After_Login() {
		setTitle("Employee Management System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 477);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 524, 453);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Jack", new Integer(25000), "IT"},
				{"Hannah", new Integer(16000), "Network Management"},
				{"David", new Integer(35000), "Software Developer"},
				{"Linuz", new Integer(28000), "Security Expert"},
				{"Gerald", new Integer(15000), "IT"},
				{"Firentis", new Integer(23000), "Network Engineer"},
				{"Hannah", new Integer(16000), "Network Management"},
				{"David", new Integer(35000), "Software Developer"},
				{"Linuz", new Integer(28000), "Security Expert"},
				{"Gerald", new Integer(15000), "IT"},
				{"Firentis", new Integer(23000), "Network Engineer"},
				{"Hannah", new Integer(16000), "Network Management"},
				{"David", new Integer(35000), "Software Developer"},
				{"Linuz", new Integer(28000), "Security Expert"},
				{"Gerald", new Integer(15000), "IT"},
				{"Firentis", new Integer(23000), "Network Engineer"},
				{"Hannah", new Integer(16000), "Network Management"},
				{"David", new Integer(35000), "Software Developer"},
				{"Linuz", new Integer(28000), "Security Expert"},
				{"Gerald", new Integer(15000), "IT"},
				{"Firentis", new Integer(23000), "Network Engineer"},
				{"Hannah", new Integer(16000), "Network Management"},
				{"David", new Integer(35000), "Software Developer"},
				{"Linuz", new Integer(28000), "Security Expert"},
				{"Gerald", new Integer(15000), "IT"},
				{"Firentis", new Integer(23000), "Network Engineer"},
				{"Hannah", new Integer(16000), "Network Management"},
				{"David", new Integer(35000), "Software Developer"},
				{"Linuz", new Integer(28000), "Security Expert"},
				{"Gerald", new Integer(15000), "IT"},
				{"Firentis", new Integer(23000), "Network Engineer"},
				{"Hannah", new Integer(16000), "Network Management"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Name", "Price", "Department"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(548, 12, 315, 453);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big_Text.setText("Add Employee");
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(141, 321, 162, 120);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Edit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big_Text.setText("Edit Employee");
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(12, 321, 117, 59);
		panel.add(btnNewButton_3);
		
		btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big_Text.setText("Remove Employee");
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(12, 382, 117, 59);
		panel.add(btnNewButton);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(12, 58, 274, 35);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setText("Price");
		txtPrice.setColumns(10);
		txtPrice.setBounds(12, 121, 274, 35);
		panel.add(txtPrice);
		
		txtDepartment = new JTextField();
		txtDepartment.setText("Department");
		txtDepartment.setColumns(10);
		txtDepartment.setBounds(12, 186, 274, 35);
		panel.add(txtDepartment);
		
		Big_Text = new JLabel("Add Employee");
		Big_Text.setFont(new Font("Dialog", Font.BOLD, 30));
		Big_Text.setBounds(12, 12, 274, 34);
		panel.add(Big_Text);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(346);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(175);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(187);
	}
}
