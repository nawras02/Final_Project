package edu.FinalPro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.naming.Reference;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.Label;

public class Choises extends JFrame {

	static List<Person> persons = new ArrayList<Person>();
	static ObjectMapper mapper = new ObjectMapper();
	static File file = new File("save.txt");

	private JPanel contentPane;
	private JTextField txtname, txtage, txtcity, txthous, txtstreet, txtGrads, txtname1, txtage1, txtcity1, txtstreet1,
			txthous1, txtsalary, txtname2, txtage2, txtcity2, txtstreet2, txthous2, txtusername1, txtpassword1,
			txtnamef, txtname3, txtage3, txtcity3, txtstreet3, txthous3, txtgrad3;
	private JLabel HousNumber;

	public static void main(String[] args) {

		PrintWriter printWriter = null;
		try {
			if (!file.exists())
				return;
			Scanner scanner = new Scanner(file);
			printWriter = new PrintWriter(file);
			if (scanner.hasNextLine()) {
				persons = mapper.readValue(scanner.nextLine(), new TypeReference<List<Person>>() {
				});
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		printWriter.close();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choises frame = new Choises();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Choises() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? ");
				if (option == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Student", null, panel, null);
		panel.setLayout(null);

		txtname = new JTextField();
		txtname.setBounds(282, 29, 86, 20);
		panel.add(txtname);
		txtname.setColumns(10);

		txtage = new JTextField();
		txtage.setBounds(282, 60, 86, 20);
		panel.add(txtage);
		txtage.setColumns(10);

		txtcity = new JTextField();
		txtcity.setBounds(282, 91, 86, 20);
		panel.add(txtcity);
		txtcity.setColumns(10);

		txthous = new JTextField();
		txthous.setBounds(282, 153, 86, 20);
		panel.add(txthous);
		txthous.setColumns(10);

		txtstreet = new JTextField();
		txtstreet.setBounds(282, 122, 86, 20);
		panel.add(txtstreet);
		txtstreet.setColumns(10);

		JLabel Name = new JLabel("Name");
		Name.setBounds(48, 29, 46, 20);
		panel.add(Name);

		JLabel Age = new JLabel("Age");
		Age.setBounds(48, 63, 46, 14);
		panel.add(Age);

		JLabel City = new JLabel("City");
		City.setBounds(48, 94, 46, 14);
		panel.add(City);

		JLabel Street = new JLabel("StreetName");
		Street.setBounds(48, 125, 46, 14);
		panel.add(Street);

		JLabel Housnumber = new JLabel("HousNumber");
		Housnumber.setBounds(48, 156, 46, 14);
		panel.add(Housnumber);

		JLabel Grads = new JLabel("Grads");
		Grads.setBounds(48, 191, 46, 14);
		panel.add(Grads);

		txtGrads = new JTextField();
		txtGrads.setBounds(282, 188, 86, 20);
		panel.add(txtGrads);
		txtGrads.setColumns(10);

		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					String Name = txtname.getText();
					String City = txtcity.getText();
					String HousNumber = txthous.getText();
					String StreetName = txtstreet.getText();
					Integer Age = Integer.parseInt(txtage.getText());
					int Grads = (Integer.parseInt(txtGrads.getText()));

					Student std = new Student(Name, Age, Grads);
					Address address = new Address(City, StreetName, HousNumber);
					std.setAddress(address);

					persons.add(std);

					mapper.enable(SerializationFeature.INDENT_OUTPUT);
					mapper.writeValue(file, persons);

					JOptionPane.showMessageDialog(null, "Data Saved");

					txtname.setText(null);
					txtage.setText(null);
					txtcity.setText(null);
					txthous.setText(null);
					txtstreet.setText(null);
					txtGrads.setText(null);

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		btnSave.setBounds(144, 191, 89, 23);
		panel.add(btnSave);

		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		tabbedPane.addTab("Employee", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel Name1 = new JLabel("Name");
		Name1.setBounds(34, 29, 46, 14);
		panel_1.add(Name1);

		JLabel Age1 = new JLabel("Age");
		Age1.setBounds(34, 54, 46, 14);
		panel_1.add(Age1);

		JLabel City1 = new JLabel("City");
		City1.setBounds(34, 79, 46, 14);
		panel_1.add(City1);

		JLabel StreetName_1 = new JLabel("StreetName");
		StreetName_1.setBounds(34, 104, 64, 14);
		panel_1.add(StreetName_1);

		HousNumber = new JLabel("HousNumber");
		HousNumber.setBounds(34, 129, 64, 14);
		panel_1.add(HousNumber);

		JLabel Salary_1 = new JLabel("Salary");
		Salary_1.setBounds(34, 154, 46, 14);
		panel_1.add(Salary_1);

		txtname1 = new JTextField();
		txtname1.setBounds(164, 26, 86, 20);
		panel_1.add(txtname1);
		txtname1.setColumns(10);

		txtage1 = new JTextField();
		txtage1.setColumns(10);
		txtage1.setBounds(164, 51, 86, 20);
		panel_1.add(txtage1);

		txtcity1 = new JTextField();
		txtcity1.setColumns(10);
		txtcity1.setBounds(164, 76, 86, 20);
		panel_1.add(txtcity1);

		txtstreet1 = new JTextField();
		txtstreet1.setColumns(10);
		txtstreet1.setBounds(164, 101, 86, 20);
		panel_1.add(txtstreet1);

		txthous1 = new JTextField();
		txthous1.setColumns(10);
		txthous1.setBounds(164, 126, 86, 20);
		panel_1.add(txthous1);

		txtsalary = new JTextField();
		txtsalary.setColumns(10);
		txtsalary.setBounds(164, 151, 86, 20);
		panel_1.add(txtsalary);

		JButton btnSave_1 = new JButton("save");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					String Name = txtname1.getText();
					String City = txtcity1.getText();
					String HousNumber = txthous1.getText();
					String StreetName = txtstreet1.getText();
					Integer Age = Integer.parseInt(txtage1.getText());
					Integer Salary = Integer.parseInt(txtsalary.getText());

					Employee emplo = new Employee(Name, Age, Salary);
					Address address = new Address(City, StreetName, HousNumber);
					emplo.setAddress(address);
					persons.add(emplo);

					mapper.enable(SerializationFeature.INDENT_OUTPUT);
					mapper.writeValue(file, persons);

					JOptionPane.showMessageDialog(null, "Data Saved");

					txtname1.setText(null);
					txtage1.setText(null);
					txtcity1.setText(null);
					txthous1.setText(null);
					txtstreet1.setText(null);
					txtsalary.setText(null);

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnSave_1.setBounds(77, 179, 89, 23);
		panel_1.add(btnSave_1);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Administretor", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel Name2 = new JLabel("Name");
		Name2.setBounds(35, 30, 46, 14);
		panel_2.add(Name2);

		JLabel Age2 = new JLabel("Age");
		Age2.setBounds(35, 55, 46, 14);
		panel_2.add(Age2);

		JLabel City2 = new JLabel("City");
		City2.setBounds(35, 79, 46, 14);
		panel_2.add(City2);

		JLabel Street2 = new JLabel("StreetName");
		Street2.setBounds(35, 104, 46, 14);
		panel_2.add(Street2);

		JLabel HousNumber2 = new JLabel("HousNumber");
		HousNumber2.setBounds(35, 129, 46, 14);
		panel_2.add(HousNumber2);

		JLabel UserName1 = new JLabel("UserName");
		UserName1.setBounds(35, 155, 46, 14);
		panel_2.add(UserName1);

		JLabel Password1 = new JLabel("Password");
		Password1.setBounds(35, 180, 46, 14);
		panel_2.add(Password1);

		txtname2 = new JTextField();
		txtname2.setBounds(103, 27, 86, 20);
		panel_2.add(txtname2);
		txtname2.setColumns(10);

		txtage2 = new JTextField();
		txtage2.setBounds(103, 52, 86, 20);
		panel_2.add(txtage2);
		txtage2.setColumns(10);

		txtcity2 = new JTextField();
		txtcity2.setBounds(103, 76, 86, 20);
		panel_2.add(txtcity2);
		txtcity2.setColumns(10);

		txtstreet2 = new JTextField();
		txtstreet2.setBounds(103, 101, 86, 20);
		panel_2.add(txtstreet2);
		txtstreet2.setColumns(10);

		txthous2 = new JTextField();
		txthous2.setBounds(103, 126, 86, 20);
		panel_2.add(txthous2);
		txthous2.setColumns(10);

		txtusername1 = new JTextField();
		txtusername1.setText("");
		txtusername1.setBounds(103, 152, 86, 20);
		panel_2.add(txtusername1);
		txtusername1.setColumns(10);

		txtpassword1 = new JTextField();
		txtpassword1.setBounds(103, 177, 86, 20);
		panel_2.add(txtpassword1);
		txtpassword1.setColumns(10);

		JButton btnSave_2 = new JButton("save");
		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String Name = txtname2.getText();
					String City = txtcity2.getText();
					String HousNumber = txthous2.getText();
					String StreetName = txtstreet2.getText();
					Integer Age = Integer.parseInt(txtage2.getText());
					String UserName = txtusername1.getText();
					String password = txtpassword1.getText();

					Administretor administretor = new Administretor(Name, Age, UserName, password);
					Address address = new Address(City, StreetName, HousNumber);
					administretor.setAddress(address);
					persons.add(administretor);

					mapper.enable(SerializationFeature.INDENT_OUTPUT);
					mapper.writeValue(file, persons);

					JOptionPane.showMessageDialog(null, "Data Saved");

					txtname2.setText(null);
					txtage2.setText(null);
					txtcity2.setText(null);
					txthous2.setText(null);
					txtstreet2.setText(null);
					txtusername1.setText(null);
					txtpassword1.setText(null);

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		btnSave_2.setBounds(230, 199, 89, 23);
		panel_2.add(btnSave_2);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Search", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel findname = new JLabel("Enter The Name");
		findname.setBounds(10, 10, 86, 23);
		panel_3.add(findname);

		txtnamef = new JTextField();
		txtnamef.setBounds(167, 11, 86, 20);
		panel_3.add(txtnamef);
		txtnamef.setColumns(10);

		JButton btnSearch = new JButton("Search ");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String findname = txtnamef.getText();

					for (Person person : persons) {
						if (person != null) {
							if (person instanceof Student) {

								if (findname.equalsIgnoreCase(person.getName())) {
									txtname3.setText(person.getName());
									txtage3.setText(Integer.toString(person.getAge()));
									txtcity3.setText(person.getAddress().getCity());
									txtstreet3.setText(person.getAddress().getStreetName());
									txthous3.setText(person.getAddress().getHouseNumber());
									txtgrad3.setText(String.valueOf(((Student) person).getGrade()));

									JOptionPane.showMessageDialog(null, "Done");

								} else {
									JOptionPane.showMessageDialog(null,
											"You haven't entered a person called " + findname + "!");
								}
							}

						}

					}

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		btnSearch.setBounds(330, 199, 89, 23);
		panel_3.add(btnSearch);

		txtname3 = new JTextField();
		txtname3.setBounds(167, 47, 86, 20);
		panel_3.add(txtname3);
		txtname3.setColumns(10);

		txtage3 = new JTextField();
		txtage3.setBounds(167, 78, 86, 20);
		panel_3.add(txtage3);
		txtage3.setColumns(10);

		txtcity3 = new JTextField();
		txtcity3.setBounds(167, 109, 86, 20);
		panel_3.add(txtcity3);
		txtcity3.setColumns(10);

		txtstreet3 = new JTextField();
		txtstreet3.setBounds(167, 140, 86, 20);
		panel_3.add(txtstreet3);
		txtstreet3.setColumns(10);

		txthous3 = new JTextField();
		txthous3.setBounds(167, 171, 86, 20);
		panel_3.add(txthous3);
		txthous3.setColumns(10);

		txtgrad3 = new JTextField();
		txtgrad3.setBounds(167, 200, 86, 20);
		panel_3.add(txtgrad3);
		txtgrad3.setColumns(10);

		JLabel name3 = new JLabel("Name");
		name3.setBounds(10, 44, 46, 14);
		panel_3.add(name3);

		JLabel Age3 = new JLabel("Age");
		Age3.setBounds(10, 81, 46, 14);
		panel_3.add(Age3);

		JLabel city3 = new JLabel("City");
		city3.setBounds(10, 112, 46, 14);
		panel_3.add(city3);

		JLabel lblStreetname = new JLabel("StreetName");
		lblStreetname.setBounds(10, 143, 46, 14);
		panel_3.add(lblStreetname);

		JLabel hous3 = new JLabel("HousNumber");
		hous3.setBounds(10, 174, 46, 14);
		panel_3.add(hous3);

		JLabel grad3 = new JLabel("Grad");
		grad3.setBounds(10, 203, 46, 14);
		panel_3.add(grad3);

		JButton eidet = new JButton("Eidet");
		eidet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (Person person : persons) {

						if (person != null) {
							person.setName(txtname3.getText());
							person.setAge(Integer.parseInt(txtage3.getText()));
							person.getAddress().setStreetName(txtstreet3.getText());
							person.getAddress().setHouseNumber(txtgrad3.getText());
							((Student) person).setGrade(Integer.parseInt(txtgrad3.getText()));

							txtname3.setText(null);
							txtcity3.setText(null);
							txthous3.setText(null);
							txtstreet3.setText(null);
							txtage3.setText(null);
							txtgrad3.setText(null);
							txtnamef.setText(null);

							JOptionPane.showMessageDialog(null, "Save");
						}

					}

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		eidet.setBounds(330, 170, 89, 23);
		panel_3.add(eidet);

		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Person person : persons) {
					if (person != null && person.getName() != null
							&& person.getName().equalsIgnoreCase(txtnamef.getText())) {

					}
				}
			}

		});
		next.setBounds(330, 139, 89, 23);
		panel_3.add(next);

		JCheckBox chbxSt = new JCheckBox("student");
		chbxSt.setBounds(322, 10, 97, 23);
		panel_3.add(chbxSt);

		JCheckBox chbxEm = new JCheckBox("Employee");
		chbxEm.setBounds(322, 40, 97, 23);
		panel_3.add(chbxEm);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("report", null, panel_4, null);
		panel_4.setLayout(null);
	}
}
