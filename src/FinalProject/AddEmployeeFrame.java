package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmployeeFrame {

	private JFrame addEmployeeFrame;

	/**
	 * Launch the application.
	 */
	public static void addEmployeeScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployeeFrame window = new AddEmployeeFrame();
					window.addEmployeeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddEmployeeFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addEmployeeFrame = new JFrame();
		addEmployeeFrame.setBounds(100, 100, 450, 300);
		addEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addEmployeeFrame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addEmployeeFrame.dispose();
				
				MainFrame mainFrame = new MainFrame();
				mainFrame.mainScreen();
			}
		});
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnBack.setBounds(335, 212, 89, 38);
		addEmployeeFrame.getContentPane().add(btnBack);
	}

}
