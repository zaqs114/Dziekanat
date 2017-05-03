import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIShowStats extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIShowStats dialog = new GUIShowStats();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIShowStats() {
		setBounds(100, 100, 600, 268);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblStatystyki = new JLabel("Statystyki");
		lblStatystyki.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatystyki.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblStatystyki.setBounds(221, 11, 187, 43);
		contentPanel.add(lblStatystyki);
		
		JLabel lblWBazieZnajduje = new JLabel("W bazie znajduje si\u0119");
		lblWBazieZnajduje.setBounds(31, 52, 127, 14);
		contentPanel.add(lblWBazieZnajduje);
		
		JLabel lblStudenci = new JLabel(Integer.toString(Student.dailyStudentList.size()+Student.weekendStudentList.size()));
		lblStudenci.setBounds(187, 52, 46, 14);
		contentPanel.add(lblStudenci);
		
		JLabel lblStudentw = new JLabel("student\u00F3w.");
		lblStudentw.setBounds(274, 52, 80, 14);
		contentPanel.add(lblStudentw);
		
		JLabel lblWTym = new JLabel("W tym");
		lblWTym.setBounds(31, 77, 61, 14);
		contentPanel.add(lblWTym);
		
		JLabel lblLiczba = new JLabel(Integer.toString(Student.dailyStudentList.size()));
		lblLiczba.setBounds(102, 77, 46, 14);
		contentPanel.add(lblLiczba);
		
		JLabel lblStudiujcychDziennieOraz = new JLabel("studiuj\u0105cych dziennie oraz");
		lblStudiujcychDziennieOraz.setBounds(158, 77, 174, 14);
		contentPanel.add(lblStudiujcychDziennieOraz);
		
		JLabel lblLiczba_1 = new JLabel(Integer.toString(Student.weekendStudentList.size()));
		lblLiczba_1.setBounds(342, 77, 46, 14);
		contentPanel.add(lblLiczba_1);
		
		JLabel lblStudiujcychZaocznie = new JLabel("studiuj\u0105cych zaocznie.");
		lblStudiujcychZaocznie.setBounds(379, 77, 151, 14);
		contentPanel.add(lblStudiujcychZaocznie);
		
		JLabel label = new JLabel("W bazie znajduje si\u0119");
		label.setBounds(31, 102, 127, 14);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel(Integer.toString(Employee.itEmployeeList.size()+Employee.mathEmployeeList.size()));
		label_1.setBounds(187, 102, 46, 14);
		contentPanel.add(label_1);
		
		JLabel lblPracownikw = new JLabel("pracownik\u00F3w.");
		lblPracownikw.setBounds(274, 102, 80, 14);
		contentPanel.add(lblPracownikw);
		
		JLabel label_3 = new JLabel("W tym");
		label_3.setBounds(31, 127, 61, 14);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel(Integer.toString(Employee.itEmployeeList.size()));
		label_4.setBounds(79, 127, 46, 14);
		contentPanel.add(label_4);
		
		JLabel lblNaStanowiskuInformatyka = new JLabel("na stanowisku informatyka oraz");
		lblNaStanowiskuInformatyka.setBounds(135, 127, 193, 14);
		contentPanel.add(lblNaStanowiskuInformatyka);
		
		JLabel label_6 = new JLabel(Integer.toString(Employee.mathEmployeeList.size()));
		label_6.setBounds(338, 127, 46, 14);
		contentPanel.add(label_6);
		
		JLabel lblNaStanowiskuMatematyka = new JLabel("na stanowisku matematyka.");
		lblNaStanowiskuMatematyka.setBounds(398, 127, 176, 14);
		contentPanel.add(lblNaStanowiskuMatematyka);
		
		JLabel lblWBazieZnajduj = new JLabel("W bazie znajduj\u0105 si\u0119");
		lblWBazieZnajduj.setBounds(31, 152, 127, 14);
		contentPanel.add(lblWBazieZnajduj);
		
		JLabel label_5 = new JLabel(Integer.toString(Subjects.subjectsList.size()));
		label_5.setBounds(187, 152, 46, 14);
		contentPanel.add(label_5);
		
		JLabel lblPrzedmiotyOraz = new JLabel("przedmioty oraz");
		lblPrzedmiotyOraz.setBounds(221, 152, 133, 14);
		contentPanel.add(lblPrzedmiotyOraz);
		
		JLabel label_2 = new JLabel(Integer.toString(SubjectGroups.subjectGroupsList.size()));
		label_2.setBounds(360, 152, 46, 14);
		contentPanel.add(label_2);
		
		JLabel lblGrupPrzedmiotowych = new JLabel("grup przedmiotowych.");
		lblGrupPrzedmiotowych.setBounds(403, 152, 127, 14);
		contentPanel.add(lblGrupPrzedmiotowych);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(277, 195, 89, 23);
		contentPanel.add(btnOk);
	}
}
