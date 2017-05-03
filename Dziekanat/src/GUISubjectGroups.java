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

public class GUISubjectGroups extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUISubjectGroups dialog = new GUISubjectGroups();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUISubjectGroups() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnWr = new JButton("Wr\u00F3\u0107");
			btnWr.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SubjectGroups subjectGroup= new SubjectGroups();
					
					subjectGroup.writeToFile();
					
					GUIModificationType guiModificationType = new GUIModificationType();
					guiModificationType.setLocationRelativeTo(null);
					guiModificationType.setVisible(true);
					dispose();
				}
			});
			btnWr.setBounds(10, 227, 414, 23);
			contentPanel.add(btnWr);
		}
		{
			JButton btnDodajGrupPrzedmiotow = new JButton("Dodaj grup\u0119 przedmiotow\u0105");
			btnDodajGrupPrzedmiotow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIAddSubjectGroup guiAddSubjectGroup = new GUIAddSubjectGroup();
					guiAddSubjectGroup.setLocationRelativeTo(null);
					guiAddSubjectGroup.setVisible(true);
					dispose();
				}
			});
			btnDodajGrupPrzedmiotow.setBounds(10, 193, 205, 23);
			contentPanel.add(btnDodajGrupPrzedmiotow);
		}
		{
			JButton btnUsuGrupPrzedmiotow = new JButton("Usu\u0144 grup\u0119 przedmiotow\u0105");
			btnUsuGrupPrzedmiotow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIDeleteSubjectGroup guiDeleteSubjectGroup = new GUIDeleteSubjectGroup();
					guiDeleteSubjectGroup.setLocationRelativeTo(null);
					guiDeleteSubjectGroup.setVisible(true);
					dispose();
					
				}
			});
			btnUsuGrupPrzedmiotow.setBounds(225, 193, 199, 23);
			contentPanel.add(btnUsuGrupPrzedmiotow);
		}
		{
			JLabel lblGrupyPrzedmiotowe = new JLabel("Grupy przedmiotowe");
			lblGrupyPrzedmiotowe.setHorizontalAlignment(SwingConstants.CENTER);
			lblGrupyPrzedmiotowe.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblGrupyPrzedmiotowe.setBounds(39, 70, 364, 73);
			contentPanel.add(lblGrupyPrzedmiotowe);
		}
	}

}
