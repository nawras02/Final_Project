package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddFrame {

	private JFrame addFrame;

	/**
	 * Launch the application.
	 */
	public static void addScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFrame window = new AddFrame();
					window.addFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addFrame = new JFrame();
		addFrame.setBounds(100, 100, 450, 270);
		addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addFrame.getContentPane().setLayout(null);

		JButton button = new JButton("Add a student");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addFrame.dispose();
				AddStudentFrame a;
				try {
					a = new AddStudentFrame();
					a.addStudentScreen();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		button.setBounds(134, 69, 137, 38);
		addFrame.getContentPane().add(button);

		JButton button_1 = new JButton("Add an employee");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addFrame.dispose();
				AddEmployeeFrame a = new AddEmployeeFrame();
				a.addEmployeeScreen();
			}
		});
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		button_1.setBounds(134, 118, 137, 38);
		addFrame.getContentPane().add(button_1);

		JLabel lblAddPanel = new JLabel("Add Panel");
		lblAddPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddPanel.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblAddPanel.setBackground(SystemColor.inactiveCaption);
		lblAddPanel.setBounds(24, 10, 370, 34);
		addFrame.getContentPane().add(lblAddPanel);

		JSeparator separator = new JSeparator();
		separator.setBounds(34, 55, 370, 2);
		addFrame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 167, 370, 2);
		addFrame.getContentPane().add(separator_1);

		JButton button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addFrame.dispose();

				MainFrame mainFrame = new MainFrame();
				mainFrame.mainScreen();
			}
		});
		button_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		button_2.setBounds(156, 180, 89, 38);
		addFrame.getContentPane().add(button_2);
	}
}
