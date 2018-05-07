package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class AddEmployeeFrame {

	private JFrame addEmployeeFrame;
	private JTextField txt_employee_name;
	private JTextField txt_employee_age;
	private JTextField txt_employee_city;
	private JTextField txt_employee_street_name;
	private JTextField txt_employee_house_number;
	private JTextField txt_salary;

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
		addEmployeeFrame.setBounds(100, 100, 721, 534);
		addEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(606, 446, 89, 38);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				addEmployeeFrame.dispose();
				MainFrame mainFrame = new MainFrame();
				mainFrame.mainScreen();
			}
		});
		addEmployeeFrame.getContentPane().setLayout(null);
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		addEmployeeFrame.getContentPane().add(btnBack);

		JLabel lblAddEmployeePanel = new JLabel("Add Employee Panel :)");
		lblAddEmployeePanel.setBounds(20, 11, 545, 34);
		lblAddEmployeePanel.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddEmployeePanel.setFont(new Font("Segoe Print", Font.BOLD, 22));
		lblAddEmployeePanel.setBackground(SystemColor.inactiveCaption);
		addEmployeeFrame.getContentPane().add(lblAddEmployeePanel);

		JSeparator separator = new JSeparator();
		separator.setBounds(20, 56, 635, 2);
		separator.setForeground(SystemColor.activeCaption);
		addEmployeeFrame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 433, 635, 2);
		separator_1.setForeground(SystemColor.activeCaption);
		addEmployeeFrame.getContentPane().add(separator_1);

		JLabel label = new JLabel("Name:");
		label.setBounds(39, 78, 67, 39);
		label.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		label.setBackground(SystemColor.inactiveCaption);
		addEmployeeFrame.getContentPane().add(label);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(39, 140, 67, 39);
		lblAge.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblAge.setBackground(SystemColor.inactiveCaption);
		addEmployeeFrame.getContentPane().add(lblAge);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(41, 206, 86, 39);
		lblAddress.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblAddress.setBackground(SystemColor.inactiveCaption);
		addEmployeeFrame.getContentPane().add(lblAddress);

		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(137, 206, 67, 39);
		lblCity.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblCity.setBackground(SystemColor.inactiveCaption);
		addEmployeeFrame.getContentPane().add(lblCity);

		JLabel lblSterrtName = new JLabel("Sterrt Name:");
		lblSterrtName.setBounds(137, 263, 134, 39);
		lblSterrtName.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblSterrtName.setBackground(SystemColor.inactiveCaption);
		addEmployeeFrame.getContentPane().add(lblSterrtName);

		JLabel lblHouseNumber = new JLabel("House Number:");
		lblHouseNumber.setBounds(137, 317, 163, 39);
		lblHouseNumber.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblHouseNumber.setBackground(SystemColor.inactiveCaption);
		addEmployeeFrame.getContentPane().add(lblHouseNumber);

		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txt_employee_name.getText();
				int age = Integer.parseInt(txt_employee_age.getText());
				String city = txt_employee_city.getText();
				String streetName = txt_employee_street_name.getText();
				String houseNumber = txt_employee_house_number.getText();
				int salary = Integer.parseInt(txt_salary.getText());
				
				if(!(name.isEmpty() || city.isEmpty() || streetName.isEmpty() || houseNumber.isEmpty() /*|| age <= 0 || age > 100 || salary < 0*/)) {
					File file = new File("Persons.txt");
					ArrayList<Person> persons = new ArrayList<Person>();

					Address address = new Address(city, streetName, houseNumber);
					Employee employee = new Employee(name, age, salary, address);
					
					persons.add(employee);
				
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
					txt_employee_age.setText(null);
					txt_employee_name.setText(null);
					txt_employee_city.setText(null);
					txt_employee_house_number.setText(null);
					txt_employee_street_name.setText(null);
					txt_salary.setText(null);
				}

			}

			}
		);
		button.setBounds(507, 446, 89, 38);
		button.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		addEmployeeFrame.getContentPane().add(button);

		JButton button_1 = new JButton("Restart");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!(JOptionPane.showConfirmDialog(addEmployeeFrame, "Are you sure you want to restart?"
						+ JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_CANCEL_OPTION)) {
					txt_employee_age.setText(null);
					txt_employee_name.setText(null);
					txt_employee_city.setText(null);
					txt_employee_house_number.setText(null);
					txt_employee_street_name.setText(null);
				}
			}
		});
		button_1.setBounds(408, 446, 89, 38);
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		addEmployeeFrame.getContentPane().add(button_1);

		txt_employee_name = new JTextField();
		txt_employee_name.setColumns(10);
		txt_employee_name.setBounds(116, 82, 238, 38);
		addEmployeeFrame.getContentPane().add(txt_employee_name);

		txt_employee_age = new JTextField();
		txt_employee_age.setColumns(10);
		txt_employee_age.setBounds(116, 144, 238, 38);
		addEmployeeFrame.getContentPane().add(txt_employee_age);

		txt_employee_city = new JTextField();
		txt_employee_city.setColumns(10);
		txt_employee_city.setBounds(200, 207, 238, 38);
		addEmployeeFrame.getContentPane().add(txt_employee_city);

		txt_employee_street_name = new JTextField();
		txt_employee_street_name.setColumns(10);
		txt_employee_street_name.setBounds(281, 263, 238, 38);
		addEmployeeFrame.getContentPane().add(txt_employee_street_name);

		txt_employee_house_number = new JTextField();
		txt_employee_house_number.setColumns(10);
		txt_employee_house_number.setBounds(310, 317, 238, 38);
		addEmployeeFrame.getContentPane().add(txt_employee_house_number);

		JButton btn_mainpanel = new JButton("MainPanel");
		btn_mainpanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEmployeeFrame.dispose();

				MainFrame mainFrame = new MainFrame();
				mainFrame.mainScreen();
			}
		});
		btn_mainpanel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn_mainpanel.setBounds(303, 446, 95, 38);
		addEmployeeFrame.getContentPane().add(btn_mainpanel);
		
		JLabel lblTheNumberOf = new JLabel("The number of added employyees:");
		lblTheNumberOf.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		lblTheNumberOf.setBackground(SystemColor.inactiveCaption);
		lblTheNumberOf.setBounds(20, 445, 227, 39);
		addEmployeeFrame.getContentPane().add(lblTheNumberOf);
		
		JLabel total = new JLabel("");
		total.setBounds(249, 446, 44, 38);
		addEmployeeFrame.getContentPane().add(total);
		
		txt_salary = new JTextField();
		txt_salary.setColumns(10);
		txt_salary.setBounds(116, 384, 238, 38);
		addEmployeeFrame.getContentPane().add(txt_salary);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setFont(new Font("Script MT Bold", Font.BOLD, 22));
		lblSalary.setBackground(SystemColor.inactiveCaption);
		lblSalary.setBounds(39, 383, 81, 39);
		addEmployeeFrame.getContentPane().add(lblSalary);
	}
}
