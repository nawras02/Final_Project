package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame mainFram;
	private final JEditorPane dtrpnClickHereTo_2 = new JEditorPane();

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
		mainFram.getContentPane().setLayout(null);

		JButton btnAddStudent = new JButton("Add a student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mainFram.dispose();

				AddStudentFrame addStudentFrame = new AddStudentFrame();
				addStudentFrame.addStudentScreen();
			}
		});
		btnAddStudent.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnAddStudent.setBounds(44, 81, 347, 38);
		mainFram.getContentPane().add(btnAddStudent);

		JButton btnAddEmployee = new JButton("Add an employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFram.dispose();

				AddEmployeeFrame addEmployeeFrame = new AddEmployeeFrame();
				addEmployeeFrame.addEmployeeScreen();
			}
		});
		btnAddEmployee.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnAddEmployee.setBounds(44, 130, 347, 38);
		mainFram.getContentPane().add(btnAddEmployee);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnExit.setBounds(329, 212, 95, 38);
		mainFram.getContentPane().add(btnExit);

		JLabel lblMain = new JLabel("Main Panel");
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblMain.setBackground(SystemColor.inactiveCaption);
		lblMain.setBounds(31, 11, 370, 34);
		mainFram.getContentPane().add(lblMain);

		JEditorPane dtrpnClickHereTo_1 = new JEditorPane();
		dtrpnClickHereTo_1.setText("Click here to add or edit a student.");
		dtrpnClickHereTo_1.setBounds(318, 114, 106, 20);
		mainFram.getContentPane().add(dtrpnClickHereTo_1);

		JEditorPane dtrpnClickHereTo = new JEditorPane();
		dtrpnClickHereTo.setText("Click here to add or edit an employee.");
		dtrpnClickHereTo.setBounds(318, 179, 106, 20);
		mainFram.getContentPane().add(dtrpnClickHereTo);

		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(318, 114, 106, 20);
		mainFram.getContentPane().add(editorPane_1);
		dtrpnClickHereTo_2.setBounds(238, 230, 284, 31);
		mainFram.getContentPane().add(dtrpnClickHereTo_2);
		dtrpnClickHereTo_2.setText("Click here to exit the program.");
	}
}
