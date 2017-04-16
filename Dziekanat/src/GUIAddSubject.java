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
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUIAddSubject extends JDialog {
	private JTextField nazwaPrzedmiotuTextField;
	private JTextField oznaczeniePrzedmiotuTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIAddSubject dialog = new GUIAddSubject();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIAddSubject() {
		setBounds(100, 100, 450, 259);
		getContentPane().setLayout(null);
		{
			JLabel lblDodawaniePrzedmiotu = new JLabel("Dodawanie przedmiotu");
			lblDodawaniePrzedmiotu.setHorizontalAlignment(SwingConstants.CENTER);
			lblDodawaniePrzedmiotu.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblDodawaniePrzedmiotu.setBounds(51, 11, 345, 77);
			getContentPane().add(lblDodawaniePrzedmiotu);
		}
		
		nazwaPrzedmiotuTextField = new JTextField();
		nazwaPrzedmiotuTextField.setBounds(233, 99, 163, 20);
		getContentPane().add(nazwaPrzedmiotuTextField);
		nazwaPrzedmiotuTextField.setColumns(10);
		
		oznaczeniePrzedmiotuTextField = new JTextField();
		oznaczeniePrzedmiotuTextField.setBounds(233, 130, 163, 20);
		getContentPane().add(oznaczeniePrzedmiotuTextField);
		oznaczeniePrzedmiotuTextField.setColumns(10);
		
		JLabel lblNazwaPrzedmiotu = new JLabel("Nazwa przedmiotu");
		lblNazwaPrzedmiotu.setBounds(51, 99, 105, 20);
		getContentPane().add(lblNazwaPrzedmiotu);
		
		JLabel lblOznaczeniePrzedmiotu = new JLabel("Oznaczenie przedmiotu");
		lblOznaczeniePrzedmiotu.setBounds(51, 133, 155, 14);
		getContentPane().add(lblOznaczeniePrzedmiotu);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUISubjects guiSubjects = new GUISubjects();
				guiSubjects.setLocationRelativeTo(null);
				guiSubjects.setVisible(true);
				dispose();
			}
		});
		btnWr.setBounds(233, 187, 163, 23);
		getContentPane().add(btnWr);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subjects subjects = new Subjects();
                Useful useful = new Useful();
                try {
                    if (useful.isFieldEmpty(oznaczeniePrzedmiotuTextField.getText())||useful.isFieldEmpty(nazwaPrzedmiotuTextField.getText())) {
                        JOptionPane.showMessageDialog(getContentPane(),"Pola nie mog¹ byæ puste!");
                    } else{
                        if (subjects.isThereDuplicate(oznaczeniePrzedmiotuTextField.getText()) == false) {
                            subjects.setSubjectName(nazwaPrzedmiotuTextField.getText());
                            subjects.setSubjectID(oznaczeniePrzedmiotuTextField.getText());
                            subjects.writeToFile();
                            JOptionPane.showMessageDialog(getContentPane(), "Pomyœlnie dodano przedmiot.");
                            GUIAddSubject guiAddSubject = new GUIAddSubject();
                            guiAddSubject.setLocationRelativeTo(null);
                            guiAddSubject.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(getContentPane(), "W bazie jest ju¿ przedmiot o tym ID. Zmieñ ID i spróbuj ponownie.");
                        }
                    }


                } catch (IOException e1) {
                    e1.printStackTrace();
                }
			}
		});
		btnDodaj.setBounds(10, 187, 196, 23);
		getContentPane().add(btnDodaj);
	}
}
