import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;

public class GUIAddEmployee extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIAddEmployee dialog = new GUIAddEmployee();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIAddEmployee() {
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDodawaniePracownika = new JLabel("Dodawanie pracownika");
			lblDodawaniePracownika.setHorizontalAlignment(SwingConstants.CENTER);
			lblDodawaniePracownika.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblDodawaniePracownika.setBounds(45, 11, 345, 77);
			contentPanel.add(lblDodawaniePracownika);
		}
		
		JTextField imieTextField = new JTextField();
		imieTextField.setBounds(238, 148, 150, 20);
		contentPanel.add(imieTextField);
		imieTextField.setColumns(10);
		
		JTextField nazwiskoTextField = new JTextField();
		nazwiskoTextField.setBounds(238, 179, 150, 20);
		contentPanel.add(nazwiskoTextField);
		nazwiskoTextField.setColumns(10);
		
		JTextField peselTextField = new JTextField();
		peselTextField.setBounds(238, 210, 150, 20);
		contentPanel.add(peselTextField);
		peselTextField.setColumns(10);
		
		JTextField salaryTextField = new JTextField();
		salaryTextField.setBounds(238, 241, 150, 20);
		contentPanel.add(salaryTextField);
		salaryTextField.setColumns(10);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setBounds(82, 151, 46, 14);
		contentPanel.add(lblImi);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(82, 182, 69, 14);
		contentPanel.add(lblNazwisko);
		
		JLabel lblPesel = new JLabel("PESEL");
		lblPesel.setBounds(82, 213, 46, 14);
		contentPanel.add(lblPesel);
		
		JLabel lblPlaca = new JLabel("P³aca");
		lblPlaca.setBounds(82, 244, 122, 14);
		contentPanel.add(lblPlaca);
		
		JRadioButton rdbtnInformatyk = new JRadioButton("Informatyk");
		buttonGroup.add(rdbtnInformatyk);
		rdbtnInformatyk.setBounds(76, 95, 109, 23);
		contentPanel.add(rdbtnInformatyk);
		
		JRadioButton rdbtnMatematyk = new JRadioButton("Matematyk");
		buttonGroup.add(rdbtnMatematyk);
		rdbtnMatematyk.setBounds(238, 95, 109, 23);
		contentPanel.add(rdbtnMatematyk);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Useful useful = new Useful();
				
				if(rdbtnMatematyk.isSelected()==false && rdbtnInformatyk.isSelected()==false){
					JOptionPane.showMessageDialog(getContentPane(),"Wybierz rodzaj pracownika");
				}
				else if (useful.isFieldEmpty(imieTextField.getText())||useful.isFieldEmpty(nazwiskoTextField.getText())||useful.isFieldEmpty(peselTextField.getText())||useful.isFieldEmpty(salaryTextField.getText())) {
                    JOptionPane.showMessageDialog(getContentPane(),"Pola nie mog\u0105 by\u0107 puste!");
				}else{
				if(rdbtnInformatyk.isSelected()==true){
					try{
					Employee.itEmployeeList.add(new ITEmployee(imieTextField.getText(), nazwiskoTextField.getText(), Integer.parseInt(peselTextField.getText()), Integer.parseInt(salaryTextField.getText())));
					JOptionPane.showMessageDialog(getContentPane(), "Pomy\u015Blnie dodano pracownika.");
					
					dispose();
					GUIAddEmployee guiAddEmployee = new GUIAddEmployee();
					guiAddEmployee.setLocationRelativeTo(null);
					guiAddEmployee.setVisible(true);
					
					}catch(NumberFormatException e1){
						JOptionPane.showMessageDialog(getContentPane(), "Pole p\u0142aca oraz pesel musi by\u0107 liczb\u0105 ca³kowit\u0105!");
						
					}
				}
				if(rdbtnMatematyk.isSelected()==true){
					try{
					Employee.mathEmployeeList.add(new MathEmployee(imieTextField.getText(), nazwiskoTextField.getText(), Integer.parseInt(peselTextField.getText()), Integer.parseInt(salaryTextField.getText())));				
					JOptionPane.showMessageDialog(getContentPane(), "Pomy\u015Blnie dodano pracownika.");
					
					dispose();
					GUIAddEmployee guiAddEmployee = new GUIAddEmployee();
					guiAddEmployee.setLocationRelativeTo(null);
					guiAddEmployee.setVisible(true);
					}catch(NumberFormatException e1){
						JOptionPane.showMessageDialog(getContentPane(), "Pole p\u0142aca oraz pesel musi by\u0107 liczb\u0105 ca³kowit\u0105!");
				
					}
				
				}
				
				
				}
				}
		});
		btnDodaj.setBounds(10, 327, 175, 23);
		contentPanel.add(btnDodaj);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				GUIEmployees guiEmployees = new GUIEmployees();
				guiEmployees.setLocationRelativeTo(null);
				guiEmployees.setVisible(true);
				dispose();
			}
		});
		btnWr.setBounds(240, 327, 184, 23);
		contentPanel.add(btnWr);
	}

}
