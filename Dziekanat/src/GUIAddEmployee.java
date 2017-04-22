import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUIAddEmployee extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField imieTextField;
	private JTextField nazwiskoTextField;
	private JTextField peselTextField;
	private JTextField stanowiskoTextField;
	private JTextField wynagrodzenieTextField;

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
			lblDodawaniePracownika.setBounds(61, 11, 345, 77);
			contentPanel.add(lblDodawaniePracownika);
		}
		
		imieTextField = new JTextField();
		imieTextField.setBounds(240, 99, 150, 20);
		contentPanel.add(imieTextField);
		imieTextField.setColumns(10);
		
		nazwiskoTextField = new JTextField();
		nazwiskoTextField.setBounds(240, 130, 150, 20);
		contentPanel.add(nazwiskoTextField);
		nazwiskoTextField.setColumns(10);
		
		peselTextField = new JTextField();
		peselTextField.setBounds(240, 161, 150, 20);
		contentPanel.add(peselTextField);
		peselTextField.setColumns(10);
		
		stanowiskoTextField = new JTextField();
		stanowiskoTextField.setBounds(240, 192, 150, 20);
		contentPanel.add(stanowiskoTextField);
		stanowiskoTextField.setColumns(10);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setBounds(84, 102, 46, 14);
		contentPanel.add(lblImi);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(84, 133, 69, 14);
		contentPanel.add(lblNazwisko);
		
		JLabel lblPesel = new JLabel("PESEL");
		lblPesel.setBounds(84, 164, 46, 14);
		contentPanel.add(lblPesel);
		
		JLabel lblStanowisko = new JLabel("Stanowisko");
		lblStanowisko.setBounds(84, 195, 122, 14);
		contentPanel.add(lblStanowisko);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Useful useful = new Useful();
			Employee employee = new Employee();
			try{
                if (useful.isFieldEmpty(imieTextField.getText())||useful.isFieldEmpty(nazwiskoTextField.getText())||useful.isFieldEmpty(stanowiskoTextField.getText())||useful.isFieldEmpty(peselTextField.getText())||useful.isFieldEmpty(wynagrodzenieTextField.getText())) {
                    JOptionPane.showMessageDialog(getContentPane(),"Pola nie mog¹ byæ puste!");
                } else{
                    if (employee.isThereDuplicate(peselTextField.getText()) == false) {
                        employee.setName(imieTextField.getText());
                        employee.setSurname(nazwiskoTextField.getText());
                        employee.setPesel(peselTextField.getText());
                        employee.setPosition(stanowiskoTextField.getText());
                        employee.setSalary(wynagrodzenieTextField.getText());
                        employee.writeToFile();
                        JOptionPane.showMessageDialog(getContentPane(), "Pomyœlnie dodano pracownika.");
                        GUIAddEmployee guiAddEmployee = new GUIAddEmployee();
                        guiAddEmployee.setLocationRelativeTo(null);
                        guiAddEmployee.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(getContentPane(), "W bazie jest ju¿ pracownik o tym numerze pesel. Popraw pesel i spróbuj ponownie.");
                    }
			}
			}
			catch (IOException e1) {
                e1.printStackTrace();
			}
			}
		});
		btnDodaj.setBounds(10, 327, 175, 23);
		contentPanel.add(btnDodaj);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIEmployee guiEmployee = new GUIEmployee();
				guiEmployee.setLocationRelativeTo(null);
				guiEmployee.setVisible(true);
				dispose();
			}
		});
		btnWr.setBounds(240, 327, 184, 23);
		contentPanel.add(btnWr);
		
		JLabel lblWynagrodzenie = new JLabel("Wynagrodzenie");
		lblWynagrodzenie.setBounds(84, 226, 122, 14);
		contentPanel.add(lblWynagrodzenie);
		
		wynagrodzenieTextField = new JTextField();
		wynagrodzenieTextField.setColumns(10);
		wynagrodzenieTextField.setBounds(240, 223, 150, 20);
		contentPanel.add(wynagrodzenieTextField);
	}
}
