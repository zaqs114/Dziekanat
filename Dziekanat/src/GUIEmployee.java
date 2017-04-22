import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUIEmployee extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIEmployee dialog = new GUIEmployee();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIEmployee() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblPracownicy = new JLabel("Pracownicy");
		lblPracownicy.setHorizontalAlignment(SwingConstants.CENTER);
		lblPracownicy.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPracownicy.setBounds(72, 66, 294, 45);
		getContentPane().add(lblPracownicy);
		
		JButton button = new JButton("Dodaj");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIAddEmployee guiAddEmployee = new GUIAddEmployee();
				guiAddEmployee.setLocationRelativeTo(null);
				guiAddEmployee.setVisible(true);
				dispose();
			}
		});
		button.setBounds(10, 194, 194, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Usu\u0144");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIEmployeeDelete guiEmployeeDelete;
				try {
					guiEmployeeDelete = new GUIEmployeeDelete();
					guiEmployeeDelete.setLocationRelativeTo(null);
					guiEmployeeDelete.setVisible(true);
					dispose();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		button_1.setBounds(230, 194, 194, 23);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Wr\u00F3\u0107");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIModificationType guiModificationType= new GUIModificationType();
				guiModificationType.setLocationRelativeTo(null);
				guiModificationType.setVisible(true);
				dispose();
				
			}
		});
		button_2.setBounds(10, 227, 414, 23);
		getContentPane().add(button_2);
	}
}
