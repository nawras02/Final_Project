package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JSeparator;

public class AddStudentFrame {

	private JFrame addStudentFrame;
	private JTextField txt_student_name;
	private JTextField txt_student_age;
	private JTextField txt_student_city;
	private JTextField txt_student_street_name;
	private JTextField txt_Student_house_naumber;
	private JTextField txt_student_grade;

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
	 * 
	 * @throws Exception
	 */
	public AddStudentFrame() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception {
		addStudentFrame = new JFrame();
		addStudentFrame.setBounds(100, 100, 733, 550);
		addStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(604, 462, 89, 38);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				addStudentFrame.dispose();

				AddFrame a = new AddFrame();
				a.addScreen();
			}
		});
		addStudentFrame.getContentPane().setLayout(null);
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		addStudentFrame.getContentPane().add(btnBack);

		JLabel lblAddStudentPanel = new JLabel("Add Student Panel :)");
		lblAddStudentPanel.setBounds(10, 11, 555, 34);
		lblAddStudentPanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddStudentPanel.setFont(new Font("Segoe Print", Font.BOLD, 22));
		lblAddStudentPanel.setBackground(SystemColor.inactiveCaption);
		addStudentFrame.getContentPane().add(lblAddStudentPanel);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblName.setBackground(SystemColor.inactiveCaption);
		lblName.setBounds(36, 78, 67, 39);
		addStudentFrame.getContentPane().add(lblName);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblAge.setBackground(SystemColor.inactiveCaption);
		lblAge.setBounds(36, 143, 67, 39);
		addStudentFrame.getContentPane().add(lblAge);

		JLabel lblAddress = new JLabel(" Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblAddress.setBackground(SystemColor.inactiveCaption);
		lblAddress.setBounds(25, 208, 117, 39);
		addStudentFrame.getContentPane().add(lblAddress);

		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblCity.setBackground(SystemColor.inactiveCaption);
		lblCity.setBounds(141, 208, 67, 39);
		addStudentFrame.getContentPane().add(lblCity);

		JLabel lblStreetName = new JLabel("Street Name:");
		lblStreetName.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblStreetName.setBackground(SystemColor.inactiveCaption);
		lblStreetName.setBounds(141, 270, 135, 39);
		addStudentFrame.getContentPane().add(lblStreetName);

		JLabel lblHouseNumber = new JLabel("House Number:");
		lblHouseNumber.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblHouseNumber.setBackground(SystemColor.inactiveCaption);
		lblHouseNumber.setBounds(141, 334, 160, 39);
		addStudentFrame.getContentPane().add(lblHouseNumber);

		txt_student_name = new JTextField();
		txt_student_name.setColumns(10);
		txt_student_name.setBounds(113, 82, 238, 38);
		addStudentFrame.getContentPane().add(txt_student_name);

		txt_student_age = new JTextField();
		txt_student_age.setColumns(10);
		txt_student_age.setBounds(113, 147, 238, 38);
		addStudentFrame.getContentPane().add(txt_student_age);

		txt_student_city = new JTextField();
		txt_student_city.setColumns(10);
		txt_student_city.setBounds(218, 212, 238, 38);
		addStudentFrame.getContentPane().add(txt_student_city);

		txt_student_street_name = new JTextField();
		txt_student_street_name.setColumns(10);
		txt_student_street_name.setBounds(283, 274, 238, 38);
		addStudentFrame.getContentPane().add(txt_student_street_name);

		txt_Student_house_naumber = new JTextField();
		txt_Student_house_naumber.setColumns(10);
		txt_Student_house_naumber.setBounds(311, 338, 238, 38);
		addStudentFrame.getContentPane().add(txt_Student_house_naumber);

		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.activeCaption);
		separator.setBounds(10, 56, 683, 2);
		addStudentFrame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.activeCaption);
		separator_1.setBounds(10, 449, 683, 2);
		addStudentFrame.getContentPane().add(separator_1);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txt_student_name.getText();
				int age = Integer.parseInt(txt_student_age.getText());
				String city = txt_student_city.getText();
				String streetName = txt_student_street_name.getText();
				String houseNumber = txt_Student_house_naumber.getText();
				int grade = Integer.parseInt(txt_student_grade.getText());
				
				if(!(name.isEmpty() || city.isEmpty() || streetName.isEmpty() || houseNumber.isEmpty() || age <= 0 || age > 100 || grade >= 100 || grade < 0)) {
					File file = new File("Persons.txt");
					ArrayList<Person> persons = new ArrayList<Person>();

					Address address = new Address(city, streetName, houseNumber);
					Student student = new Student(name, age, grade, address);
					
					persons.add(student);
				
					PrintWriter writer = null;
						
						try {
							writer = new PrintWriter(file);
							} catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}
						
						for (Person p : persons) {
		
							if (p != null) {
		
								if (p instanceof Student) {
									
									writer.print(p.toString());
									
								}
							}
						}
					
				}else {
					JOptionPane.showMessageDialog(null, "Error! You should fill the blanks.",null, JOptionPane.ERROR_MESSAGE);
					txt_student_age.setText(null);
					txt_student_name.setText(null);
					txt_student_city.setText(null);
					txt_Student_house_naumber.setText(null);
					txt_student_street_name.setText(null);
					txt_student_grade.setText(null);
				}

			}

		});
		btnAdd.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnAdd.setBounds(503, 462, 89, 38);
		addStudentFrame.getContentPane().add(btnAdd);

		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
				if (!(JOptionPane.showConfirmDialog(addStudentFrame, "Are you sure you want to restart?"
						+ JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_CANCEL_OPTION)) {
					txt_student_age.setText(null);
					txt_student_name.setText(null);
					txt_student_city.setText(null);
					txt_Student_house_naumber.setText(null);
					txt_student_street_name.setText(null);
				}

			}
		});
		btnRestart.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnRestart.setBounds(405, 462, 89, 38);
		addStudentFrame.getContentPane().add(btnRestart);

		JButton btn_mainpanel = new JButton("MainPanel");
		btn_mainpanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudentFrame.dispose();
				MainFrame mainFrame = new MainFrame();
				mainFrame.mainScreen();
			}
		});
		btn_mainpanel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn_mainpanel.setBounds(289, 462, 106, 38);
		addStudentFrame.getContentPane().add(btn_mainpanel);

		JLabel lblGrade = new JLabel("Grade:");
		lblGrade.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblGrade.setBackground(SystemColor.inactiveCaption);
		lblGrade.setBounds(36, 399, 67, 39);
		addStudentFrame.getContentPane().add(lblGrade);

		txt_student_grade = new JTextField();
		txt_student_grade.setColumns(10);
		txt_student_grade.setBounds(113, 396, 238, 38);
		addStudentFrame.getContentPane().add(txt_student_grade);

		JLabel lblTheNumberOf = new JLabel("The number of added students:");
		lblTheNumberOf.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		lblTheNumberOf.setBackground(SystemColor.inactiveCaption);
		lblTheNumberOf.setBounds(10, 461, 227, 39);
		addStudentFrame.getContentPane().add(lblTheNumberOf);

		JLabel lbl_total = new JLabel("");
		lbl_total.setBounds(239, 462, 44, 38);
		addStudentFrame.getContentPane().add(lbl_total);
	}

}
