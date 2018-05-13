package edu.FinalPro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.TextField;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.*;

public class LogInF extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtUseName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInF frame = new LogInF();
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
	public LogInF() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? ");
				if (option == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Button buttonL = new Button("LogIn");

		buttonL.setFont(new Font("Dialog", Font.BOLD, 12));
		buttonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UserName = txtUseName.getText();
				String password = txtPassword.getText();

				try {
					if (UserName.contains("Lara") && password.contains("123")) {
						setVisible(false);

						Choises choises = new Choises();
						choises.setVisible(true);

					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid LogIn Delatils!", "LogIn Error!",
							JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUseName.setText(null);

				}

			}
		});
		buttonL.setBackground(new Color(51, 204, 204));
		buttonL.setBounds(29, 316, 98, 28);
		contentPane.add(buttonL);

		Button buttonE = new Button("Exit");
		buttonE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? ");
				if (option == JOptionPane.YES_OPTION)
					System.exit(0);

			}
		});
		buttonE.setFont(new Font("Dialog", Font.BOLD, 12));
		buttonE.setBackground(new Color(255, 0, 0));
		buttonE.setBounds(143, 316, 98, 28);
		contentPane.add(buttonE);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(188, 191, 98, 28);
		contentPane.add(txtPassword);

		JLabel lblNewLabel = new JLabel("UserName");

		lblNewLabel.setForeground(new Color(51, 204, 204));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(29, 114, 98, 28);
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(51, 204, 204));
		lblPassword.setFont(new Font("Viner Hand ITC", Font.BOLD, 17));
		lblPassword.setBackground(new Color(51, 204, 204));
		lblPassword.setBounds(29, 191, 98, 28);
		contentPane.add(lblPassword);

		Label label = new Label("LogInForm");
		label.setAlignment(Label.CENTER);
		label.setBackground(new Color(102, 204, 255));
		label.setFont(new Font("Freestyle Script", Font.BOLD | Font.ITALIC, 33));
		label.setBounds(0, 25, 388, 69);
		contentPane.add(label);

		Button buttonR = new Button("Reset");
		buttonR.setBackground(new Color(51, 204, 204));
		buttonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtPassword.setText(null);
				txtUseName.setText(null);
			}
		});
		buttonR.setBounds(254, 316, 82, 28);
		contentPane.add(buttonR);

		txtUseName = new JTextField();
		txtUseName.setBounds(188, 113, 98, 28);
		contentPane.add(txtUseName);
		txtUseName.setColumns(10);

		JMenu mnFile = new JMenu("file");
		mnFile.setBounds(0, 0, 107, 22);
		contentPane.add(mnFile);

		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtPassword.setText(null);
				txtUseName.setText(null);
			}
		});
		mnFile.add(mntmReset);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? ");
				if (option == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		mnFile.add(mntmExit);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
