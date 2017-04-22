import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GUIStudents extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIStudents dialog = new GUIStudents();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIStudents() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblStudenci = new JLabel("Studenci");
		lblStudenci.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudenci.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblStudenci.setBounds(72, 66, 294, 45);
		contentPanel.add(lblStudenci);
		
		JButton button = new JButton("Dodaj");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIAddStudent guiAddStudent= new GUIAddStudent();
				guiAddStudent.setLocationRelativeTo(null);
				guiAddStudent.setVisible(true);
				dispose();
			}
		});
		button.setBounds(10, 194, 194, 23);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Usu\u0144");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIStudentDelete guiDeleteStudent;
				try {
					guiDeleteStudent = new GUIStudentDelete();
					guiDeleteStudent.setLocationRelativeTo(null);
					guiDeleteStudent.setVisible(true);
					dispose();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		button_1.setBounds(230, 194, 194, 23);
		contentPanel.add(button_1);
		
		JButton button_2 = new JButton("Wr\u00F3\u0107");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIModificationType guiModyficationType = new GUIModificationType();
				guiModyficationType.setLocationRelativeTo(null);
				guiModyficationType.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(10, 227, 414, 23);
		getContentPane().add(button_2);
	}
}
