package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;

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
	}

}
