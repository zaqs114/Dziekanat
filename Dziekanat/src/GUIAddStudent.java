import java.awt.BorderLayout;
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
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUIAddStudent extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField imieTextField;
	private JTextField nazwiskoTextField;
	private JTextField peselTextField;
	private JTextField numerIndeksuTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		imieTextField.setBounds(238, 148, 150, 20);
		contentPanel.add(imieTextField);
		imieTextField.setColumns(10);
		
		nazwiskoTextField = new JTextField();
		nazwiskoTextField.setBounds(238, 179, 150, 20);
		contentPanel.add(nazwiskoTextField);
		nazwiskoTextField.setColumns(10);
		
		peselTextField = new JTextField();
		peselTextField.setBounds(238, 210, 150, 20);
		contentPanel.add(peselTextField);
		peselTextField.setColumns(10);
		
		numerIndeksuTextField = new JTextField();
		numerIndeksuTextField.setBounds(238, 241, 150, 20);
		contentPanel.add(numerIndeksuTextField);
		numerIndeksuTextField.setColumns(10);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setBounds(82, 151, 46, 14);
		contentPanel.add(lblImi);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(82, 182, 69, 14);
		contentPanel.add(lblNazwisko);
		
		JLabel lblPesel = new JLabel("PESEL");
		lblPesel.setBounds(82, 213, 46, 14);
		contentPanel.add(lblPesel);
		
		JLabel lblNumerIndeksu = new JLabel("Numer indeksu");
		lblNumerIndeksu.setBounds(82, 244, 122, 14);
		contentPanel.add(lblNumerIndeksu);
		
		JRadioButton rdbtnStudentDzienny = new JRadioButton("Student dzienny");
		buttonGroup.add(rdbtnStudentDzienny);
		rdbtnStudentDzienny.setBounds(76, 95, 109, 23);
		contentPanel.add(rdbtnStudentDzienny);
		
		JRadioButton rdbtnStudentZaoczny = new JRadioButton("Student zaoczny");
		buttonGroup.add(rdbtnStudentZaoczny);
		rdbtnStudentZaoczny.setBounds(238, 95, 109, 23);
		contentPanel.add(rdbtnStudentZaoczny);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Useful useful = new Useful();
				
				if(rdbtnStudentZaoczny.isSelected()==false && rdbtnStudentDzienny.isSelected()==false){
					JOptionPane.showMessageDialog(getContentPane(),"Wybierz rodzaj studenta");
				}
				else if (useful.isFieldEmpty(imieTextField.getText())||useful.isFieldEmpty(nazwiskoTextField.getText())||useful.isFieldEmpty(peselTextField.getText())||useful.isFieldEmpty(numerIndeksuTextField.getText())) {
                    JOptionPane.showMessageDialog(getContentPane(),"Pola nie mog\u0105 by\u0107 puste!");
				}else{
				if(rdbtnStudentDzienny.isSelected()==true){
					try{
					Student.dailyStudentList.add(new DailyStudent(imieTextField.getText(), nazwiskoTextField.getText(), Integer.parseInt(peselTextField.getText()), Integer.parseInt(numerIndeksuTextField.getText())));
					JOptionPane.showMessageDialog(getContentPane(), "Pomy\u015Blnie dodano studenta.");
					dispose();
					GUIAddStudent guiAddStudent = new GUIAddStudent();
					guiAddStudent.setLocationRelativeTo(null);
					guiAddStudent.setVisible(true);
					}catch(NumberFormatException e1){
						JOptionPane.showMessageDialog(getContentPane(), "Pole indeks oraz pesel musi by\u0105 liczb\u0105 ca³kowit\u0105!");
						
					}
				}
				if(rdbtnStudentZaoczny.isSelected()==true){
					try{
					Student.weekendStudentList.add(new WeekendStudent(imieTextField.getText(), nazwiskoTextField.getText(), Integer.parseInt(peselTextField.getText()), Integer.parseInt(numerIndeksuTextField.getText())));				
					JOptionPane.showMessageDialog(getContentPane(), "Pomy\u015Blnie dodano studenta.");
					dispose();
					GUIAddStudent guiAddStudent = new GUIAddStudent();
					guiAddStudent.setLocationRelativeTo(null);
					guiAddStudent.setVisible(true);
					}catch(NumberFormatException e1){
						JOptionPane.showMessageDialog(getContentPane(), "Pole indeks oraz pesel musi by\u0105 liczb\u0105 ca³kowit\u0105!");
						
						
					}
				}
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
