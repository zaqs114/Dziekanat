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
import javax.swing.SwingConstants;

public class GUIShowSubjectGroups extends JDialog {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIShowSubjectGroups dialog = new GUIShowSubjectGroups();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIShowSubjectGroups() {
		
		setBounds(100, 100, 513, 700);
		getContentPane().setLayout(null);
		
		Panel panelData = new Panel();
		panelData.setBounds(0, 54, 497, 575);
		getContentPane().add(panelData);
		GridBagLayout gbl_panelData = new GridBagLayout();
		gbl_panelData.columnWidths = new int[]{61, 0, 0, 0, 0, 0, 0, 0};
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
		
		JLabel lblOznGrPrzedmiotu = new JLabel("Oznaczenie grupy przedmiotowej");
		GridBagConstraints gbc_lblOznGrPrzedmiotu = new GridBagConstraints();
		gbc_lblOznGrPrzedmiotu.insets = new Insets(0, 0, 5, 5);
		gbc_lblOznGrPrzedmiotu.gridx = 2;
		gbc_lblOznGrPrzedmiotu.gridy = 0;
		panelData.add(lblOznGrPrzedmiotu, gbc_lblOznGrPrzedmiotu);
		
		JLabel lblOznaczeniePrzedmiotu = new JLabel("Nazwa przedmiotu");
		GridBagConstraints gbc_lblOznaczeniePrzedmiotu = new GridBagConstraints();
		gbc_lblOznaczeniePrzedmiotu.insets = new Insets(0, 0, 5, 5);
		gbc_lblOznaczeniePrzedmiotu.gridx = 3;
		gbc_lblOznaczeniePrzedmiotu.gridy = 0;
		panelData.add(lblOznaczeniePrzedmiotu, gbc_lblOznaczeniePrzedmiotu);
		
		JLabel lblLiczbaStudentow = new JLabel("Liczba student\u00F3w");
		GridBagConstraints gbc_lblLiczbaStudentow = new GridBagConstraints();
		gbc_lblLiczbaStudentow.insets = new Insets(0, 0, 5, 5);
		gbc_lblLiczbaStudentow.gridx = 4;
		gbc_lblLiczbaStudentow.gridy = 0;
		panelData.add(lblLiczbaStudentow, gbc_lblLiczbaStudentow);
		
		
		
		for (int i = 0; i < SubjectGroups.subjectGroupsList.size(); i++) {
			
			    JLabel lblPosition = new JLabel(Integer.toString(i+1));
				GridBagConstraints gbc_lblPosition = new GridBagConstraints();
				gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
				gbc_lblPosition.gridx = 1;
				gbc_lblPosition.gridy = 1+i;
				panelData.add(lblPosition, gbc_lblPosition);
			    
				JLabel lblNazwa1 = new JLabel(SubjectGroups.subjectGroupsList.get(i).getSubjectName());
				GridBagConstraints gbc_lblNazwa1 = new GridBagConstraints();
				gbc_lblNazwa1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNazwa1.gridx = 2;
				gbc_lblNazwa1.gridy = 1+i;
				panelData.add(lblNazwa1, gbc_lblNazwa1);
			
				JLabel lblOznaczenie1 = new JLabel(SubjectGroups.subjectGroupsList.get(i).getSubjectGroupID());
				GridBagConstraints gbc_lblOznaczenie1 = new GridBagConstraints();
				gbc_lblOznaczenie1.insets = new Insets(0, 0, 0, 5);
				gbc_lblOznaczenie1.gridx = 3;
				gbc_lblOznaczenie1.gridy = 1+i;
				panelData.add(lblOznaczenie1, gbc_lblOznaczenie1);
				
				JLabel lblStudents = new JLabel(Integer.toString(SubjectGroups.subjectGroupsList.get(i).getNamesOfStudents().size()));
				GridBagConstraints gbc_lblStudents = new GridBagConstraints();
				gbc_lblStudents.insets = new Insets(0, 0, 5, 5);
				gbc_lblStudents.gridx = 4;
				gbc_lblStudents.gridy = 1+i;
				panelData.add(lblStudents, gbc_lblStudents);
				
				
		}
			
		Panel panelButton = new Panel();
		panelButton.setBounds(0, 628, 497, 33);
		getContentPane().add(panelButton);
		panelButton.setLayout(null);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIShowBase guiShowBase =new GUIShowBase();
				guiShowBase.setLocationRelativeTo(null);
				guiShowBase.setVisible(true);
				dispose();
				
			}
		});
		btnWr.setBounds(412, 5, 75, 23);
		panelButton.add(btnWr);
		
		Panel panelTitle = new Panel();
		panelTitle.setBounds(0, 0, 497, 56);
		getContentPane().add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblGrupyPrzedmiotowe = new JLabel("Grupy Przedmiotowe");
		lblGrupyPrzedmiotowe.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupyPrzedmiotowe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGrupyPrzedmiotowe.setBounds(10, 11, 477, 40);
		panelTitle.add(lblGrupyPrzedmiotowe);
	}

}
