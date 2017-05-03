import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GUIDeleteStudent extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIDeleteStudent dialog = new GUIDeleteStudent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIDeleteStudent() {
		setBounds(100, 100, 550, 300);
		getContentPane().setLayout(null);
		
		JButton btnWroc = new JButton("Wr\u00F3\u0107");
		btnWroc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				GUIStudents guiStudents = new GUIStudents();
				guiStudents.setLocationRelativeTo(null);
				guiStudents.setVisible(true);
			}
		});
		btnWroc.setBounds(10, 227, 514, 23);
		getContentPane().add(btnWroc);
		
		JButton btnDziennym = new JButton("Dziennym");
		btnDziennym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIDeleteDailyStudent guiDeleteDailyStudent = new GUIDeleteDailyStudent();
				guiDeleteDailyStudent.setLocationRelativeTo(null);
				guiDeleteDailyStudent.setVisible(true);
				dispose();
			}
		});
		btnDziennym.setBounds(10, 193, 252, 23);
		getContentPane().add(btnDziennym);
		
		JButton btnZaocznym = new JButton("Zaocznym");
		btnZaocznym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIDeleteWeekendStudent guiDeleteWeekendStudent = new GUIDeleteWeekendStudent();
				guiDeleteWeekendStudent.setLocationRelativeTo(null);
				guiDeleteWeekendStudent.setVisible(true);
				dispose();
			}
		});
		btnZaocznym.setBounds(272, 193, 252, 23);
		getContentPane().add(btnZaocznym);
		
		JLabel lblStudiujcegoWTrybie = new JLabel("Studiuj\u0105cego w trybie dziennym czy zaocznym?");
		lblStudiujcegoWTrybie.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudiujcegoWTrybie.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudiujcegoWTrybie.setBounds(10, 28, 514, 129);
		getContentPane().add(lblStudiujcegoWTrybie);
	}
}
