import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUISubjects extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUISubjects dialog = new GUISubjects();
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
	public GUISubjects() {
		Useful useful=new Useful();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIModificationType guiModyficationType = new GUIModificationType();
				guiModyficationType.setLocationRelativeTo(null);
				guiModyficationType.setVisible(true);
				dispose();
			}
		});
		btnWr.setBounds(10, 227, 414, 23);
		getContentPane().add(btnWr);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			GUIAddSubject guiAddSubject=new GUIAddSubject();
			guiAddSubject.setLocationRelativeTo(null);
			guiAddSubject.setVisible(true);
			dispose();
			}
		});
		btnDodaj.setBounds(10, 193, 194, 23);
		getContentPane().add(btnDodaj);
		
		JButton btnUsu = new JButton("Usu\u0144");
		btnUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIDeleteSubject guiDeleteSubject;
				try {
						if(useful.doFileExist("przedmioty.txt")==true){
						guiDeleteSubject = new GUIDeleteSubject();
						guiDeleteSubject.setLocationRelativeTo(null);
						guiDeleteSubject.setVisible(true);
						}else{
							
							JOptionPane.showMessageDialog(getContentPane(),"nie mo¿esz usun¹æ nic z pustego pliku");
							GUISubjects guiSubjects=new GUISubjects();
							guiSubjects.setLocationRelativeTo(null);
							guiSubjects.setVisible(true);
						}
					} catch (IOException e1){
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				dispose();
			}
		});
		btnUsu.setBounds(230, 193, 194, 23);
		getContentPane().add(btnUsu);
		
		JLabel lblPrzedmioty = new JLabel("Przedmioty");
		lblPrzedmioty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzedmioty.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPrzedmioty.setBounds(72, 65, 294, 45);
		getContentPane().add(lblPrzedmioty);

	}

}
