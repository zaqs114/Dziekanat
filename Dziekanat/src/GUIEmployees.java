import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIEmployees extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIEmployees dialog = new GUIEmployees();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIEmployees() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Employee employee = new Employee();
				employee.writeToFile();
				
				GUIModificationType guiModyficationType = new GUIModificationType();
				guiModyficationType.setLocationRelativeTo(null);
				guiModyficationType.setVisible(true);
				dispose();
			}
		});
		btnWr.setBounds(10, 227, 414, 23);
		getContentPane().add(btnWr);
		
		JButton btnDodajPracownika = new JButton("Dodaj pracownika");
		btnDodajPracownika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIAddEmployee guiAddEmployee = new GUIAddEmployee();
				guiAddEmployee.setLocationRelativeTo(null);
				guiAddEmployee.setVisible(true);
				dispose();
			}
		});
		btnDodajPracownika.setBounds(10, 193, 205, 23);
		getContentPane().add(btnDodajPracownika);
		
		JButton btnUsuPracownika = new JButton("Usu\u0144 pracownika");
		btnUsuPracownika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIDeleteEmployee guiDeleteEmployee = new GUIDeleteEmployee();
				guiDeleteEmployee.setLocationRelativeTo(null);
				guiDeleteEmployee.setVisible(true);
				dispose();
			}
		});
		btnUsuPracownika.setBounds(225, 193, 199, 23);
		getContentPane().add(btnUsuPracownika);
		
		JLabel lblPracownicy = new JLabel("Pracownicy");
		lblPracownicy.setHorizontalAlignment(SwingConstants.CENTER);
		lblPracownicy.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPracownicy.setBounds(75, 78, 294, 45);
		getContentPane().add(lblPracownicy);
	}
}
