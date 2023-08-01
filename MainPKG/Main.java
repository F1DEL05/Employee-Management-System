package MainPKG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField Username_;
	private JPasswordField Password_;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setResizable(false);
		setTitle("Login Panel");
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 322);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(12, 12, 495, 298);
		contentPane.add(panel);
		JLabel Login = new JLabel("");
		Login.setFont(new Font("Cantarell Light", Font.BOLD, 12));
		Login.setForeground(Color.GREEN);
		Login.setBounds(315, 94, 192, 167);
		contentPane.add(Login);
		JButton btnGiri = new JButton("Login");
		btnGiri.setBounds(188, 199, 130, 39);
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pass_string=new String(Password_.getPassword());
				if (Username_.getText().equals("admin") && pass_string.equals("admin")) {
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Login Completed Succesfully");
					After_Login s=new After_Login();
					s.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Failed !");
				}
			}
		});
		panel.setLayout(null);
		panel.add(btnGiri);
		
		Username_ = new JTextField();
		Username_.setBounds(127, 54, 246, 55);
		panel.add(Username_);
		Username_.setColumns(10);
		
		Password_ = new JPasswordField();
		Password_.setBounds(127, 132, 246, 55);
		panel.add(Password_);
		
		JLabel lblUsername = new JLabel("Password");
		lblUsername.setBounds(137, 107, 102, 27);
		panel.add(lblUsername);
		
		JLabel lblUsername_1 = new JLabel("Username");
		lblUsername_1.setBounds(137, 31, 102, 27);
		panel.add(lblUsername_1);
	}
}
