package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;

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
	}

}
