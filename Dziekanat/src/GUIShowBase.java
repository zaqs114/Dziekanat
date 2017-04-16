import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUIShowBase extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIShowBase dialog = new GUIShowBase();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
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
	public GUIShowBase() {
		setBounds(100, 100, 600, 297);
		getContentPane().setLayout(null);
		
		JLabel lblWybierzCoChcesz = new JLabel("Wybierz co chcesz wy\u015Bwietli\u0107.");
		lblWybierzCoChcesz.setHorizontalAlignment(SwingConstants.CENTER);
		lblWybierzCoChcesz.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblWybierzCoChcesz.setBounds(87, 59, 414, 81);
		getContentPane().add(lblWybierzCoChcesz);
		
		JButton btnNewButton = new JButton("Student\u00F3w");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 190, 101, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pracownik\u00F3w");
		btnNewButton_1.setBounds(121, 190, 126, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Przedmioty");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIShowSubjects guiShowSubjects;
				try {
					guiShowSubjects = new GUIShowSubjects();
					guiShowSubjects.setLocationRelativeTo(null);
					guiShowSubjects.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_2.setBounds(257, 190, 101, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("List\u0119 grup przedmiotowych");
		btnNewButton_3.setBounds(368, 190, 206, 23);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Wr\u00F3\u0107");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIMain guiMain = new GUIMain();
				guiMain.setLocationRelativeTo(null);
				guiMain.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(10, 224, 564, 23);
		getContentPane().add(btnNewButton_4);

	}
}
