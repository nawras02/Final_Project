package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainFrame {

	private JFrame mainFram;

	/**
	 * Launch the application.
	 */
	public static void mainScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.mainFram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFram = new JFrame();
		mainFram.setBounds(100, 100, 450, 300);
		mainFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
