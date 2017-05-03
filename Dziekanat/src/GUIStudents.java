import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
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

			GUIStudents dialog = new GUIStudents();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

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
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIAddStudent guiAddStudent= new GUIAddStudent();
				guiAddStudent.setLocationRelativeTo(null);
				guiAddStudent.setVisible(true);
				dispose();
			}
		});
		btnDodaj.setBounds(10, 194, 194, 23);
		contentPanel.add(btnDodaj);
		
		JButton btnUsun = new JButton("Usu\u0144");
		btnUsun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIDeleteStudent guiDeleteStudent= new GUIDeleteStudent();
					guiDeleteStudent.setLocationRelativeTo(null);
					guiDeleteStudent.setVisible(true);
					dispose();
				
			}
		});
		btnUsun.setBounds(230, 194, 194, 23);
		contentPanel.add(btnUsun);
		
		JButton btnWroc = new JButton("Wr\u00F3\u0107");
		btnWroc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student student = new Student();
				student.writeToFile();
				
				GUIModificationType guiModyficationType = new GUIModificationType();
				guiModyficationType.setLocationRelativeTo(null);
				guiModyficationType.setVisible(true);
				dispose();
			}
		});
		btnWroc.setBounds(10, 227, 414, 23);
		getContentPane().add(btnWroc);
	}
}
