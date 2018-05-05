package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LoginFrame {

	private JFrame loginFrame;
	private JTextField txt_username;
	private JTextField txt_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame window = new LoginFrame();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.setBounds(100, 100, 450, 300);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login ");
		btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnLogin.setBounds(31, 212, 89, 38);
		loginFrame.getContentPane().add(btnLogin);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRestart.setBounds(163, 212, 89, 38);
		loginFrame.getContentPane().add(btnRestart);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnExit.setBounds(286, 212, 89, 38);
		loginFrame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(421, 227, -407, -109);
		loginFrame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(410, 212, -395, -10);
		loginFrame.getContentPane().add(separator_1);
		
		JLabel lblLoginPanel = new JLabel("Login Panel");
		lblLoginPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginPanel.setBackground(SystemColor.inactiveCaption);
		lblLoginPanel.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblLoginPanel.setBounds(31, 11, 370, 34);
		loginFrame.getContentPane().add(lblLoginPanel);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(SystemColor.inactiveCaption);
		separator_2.setBounds(2081, 56, 1, 2);
		loginFrame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(SystemColor.activeCaption);
		separator_3.setBounds(10, 205, 414, 3);
		loginFrame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(176, 56, 1, 2);
		loginFrame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(SystemColor.activeCaption);
		separator_5.setBounds(10, 56, 414, 3);
		loginFrame.getContentPane().add(separator_5);
		
		JButton button = new JButton("Login ");
		button.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		button.setBounds(31, 212, 89, 38);
		loginFrame.getContentPane().add(button);
		
		JLabel lbl_username = new JLabel("Username");
		lbl_username.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lbl_username.setBackground(SystemColor.inactiveCaption);
		lbl_username.setBounds(31, 79, 135, 39);
		loginFrame.getContentPane().add(lbl_username);
		
		JLabel lbl_password = new JLabel("Password");
		lbl_password.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lbl_password.setBackground(SystemColor.inactiveCaption);
		lbl_password.setBounds(31, 139, 135, 39);
		loginFrame.getContentPane().add(lbl_password);
		
		txt_username = new JTextField();
		txt_username.setBounds(163, 80, 238, 38);
		loginFrame.getContentPane().add(txt_username);
		txt_username.setColumns(10);
		
		txt_password = new JTextField();
		txt_password.setColumns(10);
		txt_password.setBounds(163, 139, 238, 38);
		loginFrame.getContentPane().add(txt_password);
	}

}
