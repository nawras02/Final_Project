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
import javax.swing.JSeparator;

public class MainFrame {

	private JFrame mainFrame;
	private final JEditorPane dtrpnClickHereTo_2 = new JEditorPane();

	/**
	 * Launch the application.
	 */
	public void mainScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.mainFrame.setVisible(true);
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
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 451, 307);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame = new JFrame("Exit");
				if(!(JOptionPane.showConfirmDialog(mainFrame, "Do you want really to exit?", "Login System", JOptionPane.YES_NO_CANCEL_OPTION) ==
				JOptionPane.YES_NO_CANCEL_OPTION)) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnExit.setBounds(329, 223, 95, 38);
		mainFrame.getContentPane().add(btnExit);

		JLabel lblMain = new JLabel("Main Panel");
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblMain.setBackground(SystemColor.inactiveCaption);
		lblMain.setBounds(31, 11, 370, 34);
		mainFrame.getContentPane().add(lblMain);

		JEditorPane dtrpnClickHereTo_1 = new JEditorPane();
		dtrpnClickHereTo_1.setText("Click here to add or edit a student.");
		dtrpnClickHereTo_1.setBounds(318, 114, 106, 20);
		mainFrame.getContentPane().add(dtrpnClickHereTo_1);

		JEditorPane dtrpnClickHereTo = new JEditorPane();
		dtrpnClickHereTo.setText("Click here to add or edit an employee.");
		dtrpnClickHereTo.setBounds(318, 179, 106, 20);
		mainFrame.getContentPane().add(dtrpnClickHereTo);

		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(318, 114, 106, 20);
		mainFrame.getContentPane().add(editorPane_1);
		dtrpnClickHereTo_2.setBounds(238, 230, 284, 31);
		mainFrame.getContentPane().add(dtrpnClickHereTo_2);
		dtrpnClickHereTo_2.setText("Click here to exit the program.");
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 56, 370, 2);
		mainFrame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 212, 370, 2);
		mainFrame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(-17, 117, 370, 2);
		mainFrame.getContentPane().add(separator_2);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnSearch.setBounds(150, 68, 137, 38);
		mainFrame.getContentPane().add(btnSearch);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				AddFrame a = new AddFrame();
				a.addScreen();
			}
		});
		btnAdd.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnAdd.setBounds(150, 114, 137, 38);
		mainFrame.getContentPane().add(btnAdd);
		
		JButton btnReport = new JButton("Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				ReportFrame r = new ReportFrame();
				r.reportScreen();
			}
		});
		btnReport.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnReport.setBounds(150, 163, 137, 38);
		mainFrame.getContentPane().add(btnReport);
	}
}
