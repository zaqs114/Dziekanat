import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GUIAddSubject extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nazwaPrzedmiotuTextField;
	private JTextField oznaczeniePrzedmiotuTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIAddSubject dialog = new GUIAddSubject();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIAddSubject() {
	Useful useful = new Useful();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnWr = new JButton("Wr\u00F3\u0107");
			btnWr.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUISubjects guiSubjects = new GUISubjects();
					guiSubjects.setLocationRelativeTo(null);
					guiSubjects.setVisible(true);
					dispose();
				}
			});
			btnWr.setBounds(223, 227, 201, 23);
			contentPanel.add(btnWr);
		}
		{
			JButton btnDodajPrzedmiot = new JButton("Dodaj przedmiot");
			btnDodajPrzedmiot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (useful.isFieldEmpty(nazwaPrzedmiotuTextField.getText())||useful.isFieldEmpty(oznaczeniePrzedmiotuTextField.getText())) {
	                    JOptionPane.showMessageDialog(getContentPane(),"Pola nie mog\u0105 by\u0107 puste!");
				}else{
					Subjects.subjectsList.add(new Subjects(nazwaPrzedmiotuTextField.getText(), oznaczeniePrzedmiotuTextField.getText()));
					JOptionPane.showMessageDialog(getContentPane(), "Pomy\u015Blnie dodano przedmiot.");
					dispose();
					GUIAddSubject guiAddSubject = new GUIAddSubject();
					guiAddSubject.setLocationRelativeTo(null);
					guiAddSubject.setVisible(true);
				}
				}
			});
			
			btnDodajPrzedmiot.setBounds(10, 227, 201, 23);
			contentPanel.add(btnDodajPrzedmiot);
		}
		{
			JLabel lblPrzedmioty = new JLabel("Dodaj przedmiot");
			lblPrzedmioty.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrzedmioty.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblPrzedmioty.setBounds(68, 11, 294, 45);
			contentPanel.add(lblPrzedmioty);
		}
		{
			nazwaPrzedmiotuTextField = new JTextField();
			nazwaPrzedmiotuTextField.setBounds(255, 89, 117, 20);
			contentPanel.add(nazwaPrzedmiotuTextField);
			nazwaPrzedmiotuTextField.setColumns(10);
		}
		
		oznaczeniePrzedmiotuTextField = new JTextField();
		oznaczeniePrzedmiotuTextField.setBounds(255, 120, 117, 20);
		contentPanel.add(oznaczeniePrzedmiotuTextField);
		oznaczeniePrzedmiotuTextField.setColumns(10);
		
		JLabel lblNazwaPrzedmiotu = new JLabel("Nazwa przedmiotu");
		lblNazwaPrzedmiotu.setBounds(68, 92, 143, 14);
		contentPanel.add(lblNazwaPrzedmiotu);
		
		JLabel lblOznaczeniePrzedmiotu = new JLabel("Oznaczenie przedmiotu");
		lblOznaczeniePrzedmiotu.setBounds(68, 123, 143, 14);
		contentPanel.add(lblOznaczeniePrzedmiotu);
	}
}
