import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUISubjects extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUISubjects dialog = new GUISubjects();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUISubjects() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnUsuPrzedmiot = new JButton("Usu\u0144 przedmiot");
			btnUsuPrzedmiot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIDeleteSubject guiDeleteSubject = new GUIDeleteSubject();
					guiDeleteSubject.setLocationRelativeTo(null);
					guiDeleteSubject.setVisible(true);
					dispose();
				}
			});
			btnUsuPrzedmiot.setBounds(225, 193, 199, 23);
			contentPanel.add(btnUsuPrzedmiot);
		}
		{
			JButton btnDodajPrzedmiot = new JButton("Dodaj przedmiot");
			btnDodajPrzedmiot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIAddSubject guiAddSubject = new GUIAddSubject();
					guiAddSubject.setLocationRelativeTo(null);
					guiAddSubject.setVisible(true);
					dispose();
				}
			});
			btnDodajPrzedmiot.setBounds(10, 193, 205, 23);
			contentPanel.add(btnDodajPrzedmiot);
		}
		{
			JButton button = new JButton("Wr\u00F3\u0107");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Subjects subjects = new Subjects();
					subjects.writeToFile();
					
					GUIModificationType guiModyficationType = new GUIModificationType();
					guiModyficationType.setLocationRelativeTo(null);
					guiModyficationType.setVisible(true);
					dispose();
				}
			});
			button.setBounds(10, 227, 414, 23);
			contentPanel.add(button);
		}
		{
			JLabel lblPrzedmioty = new JLabel("Przedmioty");
			lblPrzedmioty.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrzedmioty.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblPrzedmioty.setBounds(75, 78, 294, 45);
			contentPanel.add(lblPrzedmioty);
		}
	}

}
