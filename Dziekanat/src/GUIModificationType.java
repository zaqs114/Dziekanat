import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIModificationType extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIModificationType dialog = new GUIModificationType();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setLocationRelativeTo(null);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public GUIModificationType() {
		setBounds(100, 100, 522, 319);
		getContentPane().setLayout(null);
		
		JLabel lblWybierzKtreInformacje = new JLabel("Wybierz kt\u00F3re informacje chcesz modyfikowa\u0107.");
		lblWybierzKtreInformacje.setHorizontalAlignment(SwingConstants.CENTER);
		lblWybierzKtreInformacje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWybierzKtreInformacje.setBounds(10, 45, 488, 129);
		getContentPane().add(lblWybierzKtreInformacje);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIMain guiMain=new GUIMain();
				guiMain.setLocationRelativeTo(null);
				guiMain.setVisible(true);
			}
		});
		btnWr.setBounds(10, 246, 488, 23);
		getContentPane().add(btnWr);
		
		JButton btnStudenci = new JButton("Studenci");
		btnStudenci.setBounds(10, 212, 89, 23);
		getContentPane().add(btnStudenci);
		
		JButton btnPracownicy = new JButton("Pracownicy");
		btnPracownicy.setBounds(109, 212, 103, 23);
		getContentPane().add(btnPracownicy);
		
		JButton btnPrzedmioty = new JButton("Przedmioty");
		btnPrzedmioty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUISubjects guiSubject = new GUISubjects();
				guiSubject.setLocationRelativeTo(null); //ta linijka centruje okno
				guiSubject.setVisible(true);
                dispose();
			}
		});
		btnPrzedmioty.setBounds(222, 212, 103, 23);
		getContentPane().add(btnPrzedmioty);
		
		JButton btnGrupyPrzedmiotowe = new JButton("Grupy przedmiotowe");
		btnGrupyPrzedmiotowe.setBounds(335, 212, 163, 23);
		getContentPane().add(btnGrupyPrzedmiotowe);

	}
}
