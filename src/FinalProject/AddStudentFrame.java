package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudentFrame {

	private JFrame addStudentFrame;

	/**
	 * Launch the application.
	 */
	public static void addStudentScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudentFrame window = new AddStudentFrame();
					window.addStudentFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudentFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addStudentFrame = new JFrame();
		addStudentFrame.setBounds(100, 100, 450, 300);
		addStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addStudentFrame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addStudentFrame.dispose();
				
				MainFrame mainFrame = new MainFrame();
				mainFrame.mainScreen();
			}
		});
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnBack.setBounds(335, 212, 89, 38);
		addStudentFrame.getContentPane().add(btnBack);
	}

}
