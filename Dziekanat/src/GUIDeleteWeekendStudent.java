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

public class GUIDeleteWeekendStudent extends JDialog {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIDeleteWeekendStudent dialog = new GUIDeleteWeekendStudent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIDeleteWeekendStudent() {

		
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
		
		JLabel lblImie = new JLabel("Imie");
		GridBagConstraints gbc_lblImie = new GridBagConstraints();
		gbc_lblImie.insets = new Insets(0, 0, 5, 5);
		gbc_lblImie.gridx = 2;
		gbc_lblImie.gridy = 0;
		panelData.add(lblImie, gbc_lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		GridBagConstraints gbc_lblNazwisko = new GridBagConstraints();
		gbc_lblNazwisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblNazwisko.gridx = 3;
		gbc_lblNazwisko.gridy = 0;
		panelData.add(lblNazwisko, gbc_lblNazwisko);
		
		JLabel lblPesel = new JLabel("Pesel");
		GridBagConstraints gbc_lblPesel = new GridBagConstraints();
		gbc_lblPesel.insets = new Insets(0, 0, 5, 5);
		gbc_lblPesel.gridx = 4;
		gbc_lblPesel.gridy = 0;
		panelData.add(lblPesel, gbc_lblPesel);
		
		JLabel lblNumerIndeksu = new JLabel("Numer indeksu");
		GridBagConstraints gbc_lblNumerIndeksu = new GridBagConstraints();
		gbc_lblNumerIndeksu.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumerIndeksu.gridx = 5;
		gbc_lblNumerIndeksu.gridy = 0;
		panelData.add(lblNumerIndeksu, gbc_lblNumerIndeksu);
		
		
		
		for (int i = 0; i < Student.weekendStudentList.size(); i++) {
			
			    JLabel lblPosition = new JLabel(Integer.toString(i+1));
				GridBagConstraints gbc_lblPosition = new GridBagConstraints();
				gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
				gbc_lblPosition.gridx = 1;
				gbc_lblPosition.gridy = 1+i;
				panelData.add(lblPosition, gbc_lblPosition);
			    
				JLabel lblNazwa1 = new JLabel(Student.weekendStudentList.get(i).getName());
				GridBagConstraints gbc_lblNazwa1 = new GridBagConstraints();
				gbc_lblNazwa1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNazwa1.gridx = 2;
				gbc_lblNazwa1.gridy = 1+i;
				panelData.add(lblNazwa1, gbc_lblNazwa1);
			
				JLabel lblOznaczenie1 = new JLabel(Student.weekendStudentList.get(i).getSurname());
				GridBagConstraints gbc_lblOznaczenie1 = new GridBagConstraints();
				gbc_lblOznaczenie1.insets = new Insets(0, 0, 0, 5);
				gbc_lblOznaczenie1.gridx = 3;
				gbc_lblOznaczenie1.gridy = 1+i;
				panelData.add(lblOznaczenie1, gbc_lblOznaczenie1);
				
				JLabel lblPesele = new JLabel(Integer.toString(Student.weekendStudentList.get(i).getPesel()));
				GridBagConstraints gbc_lblPodPeselem = new GridBagConstraints();
				gbc_lblPodPeselem.insets = new Insets(0, 0, 5, 5);
				gbc_lblPodPeselem.gridx = 4;
				gbc_lblPodPeselem.gridy = 1+i;
				panelData.add(lblPesele, gbc_lblPodPeselem);
				
				JLabel lblIndeksy = new JLabel(Integer.toString(Student.weekendStudentList.get(i).getStudentId()));
				GridBagConstraints gbc_lblPodIndeksem = new GridBagConstraints();
				gbc_lblPodIndeksem.insets = new Insets(0, 0, 5, 5);
				gbc_lblPodIndeksem.gridx = 5;
				gbc_lblPodIndeksem.gridy = 1+i;
				panelData.add(lblIndeksy, gbc_lblPodIndeksem);
		}
			
		Panel panelControls = new Panel();
		panelControls.setBounds(0, 628, 497, 33);
		getContentPane().add(panelControls);
		panelControls.setLayout(null);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIDeleteStudent guiDeleteStudent =new GUIDeleteStudent();
				guiDeleteStudent.setLocationRelativeTo(null);
				guiDeleteStudent.setVisible(true);
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
				Student.weekendStudentList.remove(Integer.parseInt(deletePositionTextField.getText())-1);
				JOptionPane.showMessageDialog(getContentPane(),"Pozycja zosta\u0142a usuni\u0119ta");
				GUIDeleteWeekendStudent guiDeleteWeekendStudent = new GUIDeleteWeekendStudent();
				guiDeleteWeekendStudent.setLocationRelativeTo(null);
				guiDeleteWeekendStudent.setVisible(true);
				}catch(NumberFormatException e1){
					JOptionPane.showMessageDialog(getContentPane(),"Wpisz pozycj\u0119 kt\u00F3r\u0105 chcesz usun\u0105\u0107");
					GUIDeleteWeekendStudent guiDeleteWeekendStudent = new GUIDeleteWeekendStudent();
					guiDeleteWeekendStudent.setLocationRelativeTo(null);
					guiDeleteWeekendStudent.setVisible(true);
				}catch(IndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(getContentPane(),"Takiej pozycji nie ma na li\u015Bcie");
					GUIDeleteWeekendStudent guiDeleteWeekendStudent = new GUIDeleteWeekendStudent();
					guiDeleteWeekendStudent.setLocationRelativeTo(null);
					guiDeleteWeekendStudent.setVisible(true);
				}
				
			}
		});
		btnUsu_1.setBounds(224, 5, 89, 23);
		panelControls.add(btnUsu_1);
		
		Panel panelTitle = new Panel();
		panelTitle.setBounds(0, 0, 497, 56);
		getContentPane().add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblUsuwanieStudentaDziennego = new JLabel("Usuwanie studenta zaocznego");
		lblUsuwanieStudentaDziennego.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuwanieStudentaDziennego.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsuwanieStudentaDziennego.setBounds(10, 11, 477, 40);
		panelTitle.add(lblUsuwanieStudentaDziennego);
	}

}
