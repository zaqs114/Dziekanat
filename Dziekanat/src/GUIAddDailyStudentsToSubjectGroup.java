import java.awt.EventQueue;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

public class GUIAddDailyStudentsToSubjectGroup extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAddDailyStudentsToSubjectGroup dialog = new GUIAddDailyStudentsToSubjectGroup();
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
	public GUIAddDailyStudentsToSubjectGroup() {
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(null);
		
		JLabel lblDodawanieStudentwDo = new JLabel("Dodawanie student\u00F3w do grupy");
		lblDodawanieStudentwDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDodawanieStudentwDo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDodawanieStudentwDo.setBounds(10, 11, 414, 55);
		getContentPane().add(lblDodawanieStudentwDo);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GUIAddSubjectGroup guiAddSubjectGroup = new GUIAddSubjectGroup();
				guiAddSubjectGroup.setLocationRelativeTo(null);
				guiAddSubjectGroup.setVisible(true);
				
				
			}
		});
		btnWr.setBounds(224, 427, 200, 23);
		getContentPane().add(btnWr);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(10, 427, 204, 23);
		getContentPane().add(btnDodaj);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 77, 414, 339);
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		int numberCheckBox = 10;
				JCheckBox[] checkBoxList = new JCheckBox[numberCheckBox];
				 
				for(int i = 0; i < numberCheckBox; i++) {
				    checkBoxList[i] = new JCheckBox("CheckBox" + i);
				    panel.add(checkBoxList[i]);
				}
	}
}
