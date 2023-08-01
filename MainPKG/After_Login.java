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
import javax.swing.JOptionPane;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class After_Login extends JFrame {

	private static final long serialVersionUID = 1898207910432927265L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton;
	private JTextField Name_Text;
	private JTextField Price_Text;
	private JTextField Department_Text;
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
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table.getSelectedRow();
				String Name=(String)table.getModel().getValueAt(row, 0);
				int Price=(int)table.getModel().getValueAt(row, 1);
				String Department=(String)table.getModel().getValueAt(row, 2);
				Name_Text.setText(Name);
				
				String Price_s=String.valueOf(Price);
				Price_Text.setText(Price_s);
				Department_Text.setText(Department);
				
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {
			{"Ekrem", new Integer(25000), "IT"},
			{"Koray", new Integer(28000), "Security Expert"},
			{"Servet", new Integer(15000), "IT"},
			{"Eşber", new Integer(25000), "Software Developer"},
			{"Oray", new Integer(16000), "Network Manager"},
			{"Neco", new Integer(35000), "Software Developer"},
		},new String[] {
			"Name", "Price", "Role"
		}
				) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(346);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(175);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(187);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(548, 12, 315, 453);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big_Text.setText("Add Employee");
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				//-----------------------------------------
				if (Name_Text.getText().trim().equals("") || Price_Text.getText().trim().equals("") || Department_Text.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill in all");
				}
				else {
					model1.addRow(new Object[] {Name_Text.getText().toString(),Integer.parseInt(Price_Text.getText()),Department_Text.getText().toString()});
					JOptionPane.showMessageDialog(null, "Employee Added Successfully");
				}
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
				int selected_row=table.getSelectedRow();
				if (Name_Text.getText().trim().equals("") || Price_Text.getText().trim().equals("") || Department_Text.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill in all");
				}else {
					table.setValueAt((Object)Name_Text.getText(), selected_row, 0);
					table.setValueAt((Object)Price_Text.getText(), selected_row, 1);
					table.setValueAt((Object)Department_Text.getText(), selected_row, 2);
					JOptionPane.showMessageDialog(null, "Employee Edited Successfully");
				}
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(12, 321, 117, 59);
		panel.add(btnNewButton_3);
		
		btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int selected=table.getSelectedRow();
				if (table.getRowCount()==-1 || selected==-1){
					
				}else {
					model.removeRow(selected);
					JOptionPane.showMessageDialog(null, "Employee removed successfully !");
				}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(12, 382, 117, 59);
		panel.add(btnNewButton);
		
		Name_Text = new JTextField();
		Name_Text.setText("Name");
		Name_Text.setBounds(12, 58, 274, 35);
		panel.add(Name_Text);
		Name_Text.setColumns(10);
		
		Price_Text = new JTextField();
		Price_Text.setText("Price");
		Price_Text.setColumns(10);
		Price_Text.setBounds(12, 121, 274, 35);
		panel.add(Price_Text);
		
		Department_Text = new JTextField();
		Department_Text.setText("Department");
		Department_Text.setColumns(10);
		Department_Text.setBounds(12, 186, 274, 35);
		panel.add(Department_Text);
		
		Big_Text = new JLabel("Add Employee");
		Big_Text.setFont(new Font("Dialog", Font.BOLD, 30));
		Big_Text.setBounds(12, 12, 274, 34);
		panel.add(Big_Text);
	}
}
