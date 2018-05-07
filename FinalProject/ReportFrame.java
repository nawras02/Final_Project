package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;

public class ReportFrame {

	private JFrame reportFrame;

	/**
	 * Launch the application.
	 */
	public static void reportScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportFrame window = new ReportFrame();
					window.reportFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReportFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		reportFrame = new JFrame();
		reportFrame.setBounds(100, 100, 450, 300);
		reportFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reportFrame.getContentPane().setLayout(null);
		
		JButton button_1 = new JButton("Back");
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		button_1.setBounds(335, 212, 89, 38);
		reportFrame.getContentPane().add(button_1);
	}

}
