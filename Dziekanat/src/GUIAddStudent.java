import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUIAddStudent extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField imieTextField;
	private JTextField nazwiskoTextField;
	private JTextField peselTextField;
	private JTextField numerIndeksuTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIAddStudent dialog = new GUIAddStudent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIAddStudent() {
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDodawanieStudenta = new JLabel("Dodawanie studenta");
			lblDodawanieStudenta.setHorizontalAlignment(SwingConstants.CENTER);
			lblDodawanieStudenta.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblDodawanieStudenta.setBounds(45, 11, 345, 77);
			contentPanel.add(lblDodawanieStudenta);
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
		
		numerIndeksuTextField = new JTextField();
		numerIndeksuTextField.setBounds(240, 192, 150, 20);
		contentPanel.add(numerIndeksuTextField);
		numerIndeksuTextField.setColumns(10);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setBounds(84, 102, 46, 14);
		contentPanel.add(lblImi);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(84, 133, 69, 14);
		contentPanel.add(lblNazwisko);
		
		JLabel lblPesel = new JLabel("PESEL");
		lblPesel.setBounds(84, 164, 46, 14);
		contentPanel.add(lblPesel);
		
		JLabel lblNumerIndeksu = new JLabel("Numer indeksu");
		lblNumerIndeksu.setBounds(84, 195, 122, 14);
		contentPanel.add(lblNumerIndeksu);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Useful useful = new Useful();
			Student student = new Student();
			try{
                if (useful.isFieldEmpty(imieTextField.getText())||useful.isFieldEmpty(nazwiskoTextField.getText())||useful.isFieldEmpty(peselTextField.getText())||useful.isFieldEmpty(numerIndeksuTextField.getText())) {
                    JOptionPane.showMessageDialog(getContentPane(),"Pola nie mog¹ byæ puste!");
                } else{
                    if (student.isThereDuplicate(numerIndeksuTextField.getText()) == false) {
                        student.setName(imieTextField.getText());
                        student.setSurname(nazwiskoTextField.getText());
                        student.setPesel(peselTextField.getText());
                        student.setStudentId(numerIndeksuTextField.getText());
                        student.writeToFile();
                        JOptionPane.showMessageDialog(getContentPane(), "Pomyœlnie dodano studenta.");
                        GUIAddStudent guiAddStudent = new GUIAddStudent();
                        guiAddStudent.setLocationRelativeTo(null);
                        guiAddStudent.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(getContentPane(), "W bazie jest ju¿ student o tym numerze indeksu. Popraw numer indeksu i spróbuj ponownie.");
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
				GUIStudents guiStudents = new GUIStudents();
				guiStudents.setLocationRelativeTo(null);
				guiStudents.setVisible(true);
				dispose();
			}
		});
		btnWr.setBounds(240, 327, 184, 23);
		contentPanel.add(btnWr);
	}
}
