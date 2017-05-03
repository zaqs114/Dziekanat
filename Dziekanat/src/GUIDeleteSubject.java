import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class GUIDeleteSubject extends JDialog {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIDeleteSubject dialog = new GUIDeleteSubject();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIDeleteSubject() {
		setBounds(100, 100, 513, 700);
		getContentPane().setLayout(null);
		
		Panel panelData = new Panel();
		panelData.setBounds(0, 54, 497, 575);
		getContentPane().add(panelData);
		GridBagLayout gbl_panelData = new GridBagLayout();
		gbl_panelData.columnWidths = new int[]{129, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelData.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelData.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelData.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelData.setLayout(gbl_panelData);
		
		JLabel lblLp = new JLabel("L.p");
		GridBagConstraints gbc_lblLp = new GridBagConstraints();
		gbc_lblLp.insets = new Insets(0, 0, 5, 5);
		gbc_lblLp.gridx = 1;
		gbc_lblLp.gridy = 0;
		panelData.add(lblLp, gbc_lblLp);
		
		JLabel lblNazwaPrzedmiotu = new JLabel("Nazwa przedmiotu");
		GridBagConstraints gbc_lblNazwaPrzedmiotu = new GridBagConstraints();
		gbc_lblNazwaPrzedmiotu.insets = new Insets(0, 0, 5, 5);
		gbc_lblNazwaPrzedmiotu.gridx = 2;
		gbc_lblNazwaPrzedmiotu.gridy = 0;
		panelData.add(lblNazwaPrzedmiotu, gbc_lblNazwaPrzedmiotu);
		
		JLabel lblOznaczeniePrzedmiotu = new JLabel("Oznaczenie przedmiotu");
		GridBagConstraints gbc_lblOznaczeniePrzedmiotu = new GridBagConstraints();
		gbc_lblOznaczeniePrzedmiotu.insets = new Insets(0, 0, 5, 5);
		gbc_lblOznaczeniePrzedmiotu.gridx = 3;
		gbc_lblOznaczeniePrzedmiotu.gridy = 0;
		panelData.add(lblOznaczeniePrzedmiotu, gbc_lblOznaczeniePrzedmiotu);
		
		
		
		for (int i = 0; i < Subjects.subjectsList.size(); i++) {
			
			    JLabel lblPosition = new JLabel(Integer.toString(i+1));
				GridBagConstraints gbc_lblPosition = new GridBagConstraints();
				gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
				gbc_lblPosition.gridx = 1;
				gbc_lblPosition.gridy = 1+i;
				panelData.add(lblPosition, gbc_lblPosition);
			    
				JLabel lblNazwa1 = new JLabel(Subjects.subjectsList.get(i).getSubjectName());
				GridBagConstraints gbc_lblNazwa1 = new GridBagConstraints();
				gbc_lblNazwa1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNazwa1.gridx = 2;
				gbc_lblNazwa1.gridy = 1+i;
				panelData.add(lblNazwa1, gbc_lblNazwa1);
			
				JLabel lblOznaczenie1 = new JLabel(Subjects.subjectsList.get(i).getSubjectID());
				GridBagConstraints gbc_lblOznaczenie1 = new GridBagConstraints();
				gbc_lblOznaczenie1.insets = new Insets(0, 0, 0, 5);
				gbc_lblOznaczenie1.gridx = 3;
				gbc_lblOznaczenie1.gridy = 1+i;
				panelData.add(lblOznaczenie1, gbc_lblOznaczenie1);

		}
			
		Panel panelControls = new Panel();
		panelControls.setBounds(0, 628, 497, 33);
		getContentPane().add(panelControls);
		panelControls.setLayout(null);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUISubjects guiSubjects =new GUISubjects();
				guiSubjects.setLocationRelativeTo(null);
				guiSubjects.setVisible(true);
				dispose();
				
			}
		});
		btnWr.setBounds(412, 5, 75, 23);
		panelControls.add(btnWr);
		
		JLabel lblUsuPozycjNumer = new JLabel("Usu\u0144 pozycj\u0119 numer: ");
		lblUsuPozycjNumer.setBounds(10, 9, 138, 14);
		panelControls.add(lblUsuPozycjNumer);
		
		JTextField deletePositionTextField = new JTextField();
		deletePositionTextField.setBounds(128, 6, 86, 20);
		panelControls.add(deletePositionTextField);
		deletePositionTextField.setColumns(10);
		
		JButton btnUsu_1 = new JButton("Usu\u0144");
		btnUsu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try{
				dispose();
				Subjects.subjectsList.remove(Integer.parseInt(deletePositionTextField.getText())-1);
				JOptionPane.showMessageDialog(getContentPane(),"Pozycja zosta\u0142a usuni\u0119ta");
				GUIDeleteSubject guiSubject  = new GUIDeleteSubject();
				guiSubject.setLocationRelativeTo(null);
				guiSubject.setVisible(true);
				}catch(NumberFormatException e1){
					JOptionPane.showMessageDialog(getContentPane(),"Wpisz pozycj\u0119 kt\u00F3r\u0105 chcesz usun\u0105\u0107");
					GUIDeleteSubject guiSubject = new GUIDeleteSubject();
					guiSubject.setLocationRelativeTo(null);
					guiSubject.setVisible(true);
				}catch(IndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(getContentPane(),"Takiej pozycji nie ma na li\u015Bcie");
					GUIDeleteSubject guiSubject = new GUIDeleteSubject();
					guiSubject.setLocationRelativeTo(null);
					guiSubject.setVisible(true);
				}
			}
		});
		btnUsu_1.setBounds(224, 5, 89, 23);
		panelControls.add(btnUsu_1);
		
		Panel panelTitle = new Panel();
		panelTitle.setBounds(0, 0, 497, 56);
		getContentPane().add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblUsuwaniePrzedmiotu = new JLabel("Usuwanie Przedmiotu");
		lblUsuwaniePrzedmiotu.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuwaniePrzedmiotu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsuwaniePrzedmiotu.setBounds(10, 11, 477, 40);
		panelTitle.add(lblUsuwaniePrzedmiotu);
	}

}
