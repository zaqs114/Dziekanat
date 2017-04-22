import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUIMain extends JDialog {

	/**
	 * Launch the application.
	 * @return 
	 */
	
	/*
	 * INITIALIZATION
	 */
	public void initialization(){
		File przedmioty = new File("przedmioty.txt");
		File studenci = new File("studenci.txt");
		File pracownicy = new File("pracownicy.txt");
		try {
			przedmioty.createNewFile();
			studenci.createNewFile();
			pracownicy.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain dialog = new GUIMain();
					dialog.initialization();
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
	public GUIMain() {
		setBounds(100, 100, 565, 350);
		getContentPane().setLayout(null);
		
		JButton btnWyjcie = new JButton("Wyj\u015Bcie");
		btnWyjcie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnWyjcie.setBounds(450, 275, 89, 23);
		getContentPane().add(btnWyjcie);
		
		JButton btnWywietlStatystyki = new JButton("Wy\u015Bwietl Statystyki");
		btnWywietlStatystyki.setBounds(293, 275, 147, 23);
		getContentPane().add(btnWywietlStatystyki);
		
		JButton btnWywietlBaz = new JButton("Wy\u015Bwietl baz\u0119");
		btnWywietlBaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIShowBase guiShowBase=new GUIShowBase();
				guiShowBase.setLocationRelativeTo(null);
				guiShowBase.setVisible(true);
				dispose();
			}
		});
		btnWywietlBaz.setBounds(167, 275, 116, 23);
		getContentPane().add(btnWywietlBaz);
		
		JButton btnEdytujInformacje = new JButton("Edytuj informacje");
		btnEdytujInformacje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIModificationType guiModyficationType=new GUIModificationType();
				guiModyficationType.setLocationRelativeTo(null);
				guiModyficationType.setVisible(true);
				dispose();
			}
		});
		btnEdytujInformacje.setBounds(10, 275, 147, 23);
		getContentPane().add(btnEdytujInformacje);
		
		JLabel lblDziekanat = new JLabel("Dziekanat");
		lblDziekanat.setHorizontalAlignment(SwingConstants.CENTER);
		lblDziekanat.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDziekanat.setBounds(207, 11, 142, 43);
		getContentPane().add(lblDziekanat);
		
		JLabel lblWitajWAplikacji = new JLabel("Witaj w aplikacji dziekanat. Wybierz co chcesz zrobi\u0107.");
		lblWitajWAplikacji.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWitajWAplikacji.setHorizontalAlignment(SwingConstants.CENTER);
		lblWitajWAplikacji.setBounds(10, 112, 529, 43);
		getContentPane().add(lblWitajWAplikacji);

	}
}
