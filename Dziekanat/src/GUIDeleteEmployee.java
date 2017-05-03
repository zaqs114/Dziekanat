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

public class GUIDeleteEmployee extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIDeleteEmployee dialog = new GUIDeleteEmployee();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIDeleteEmployee() {
		setBounds(100, 100, 550, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton button = new JButton("Wr\u00F3\u0107");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIEmployees guiEmployees = new GUIEmployees();
					guiEmployees.setLocationRelativeTo(null);
					guiEmployees.setVisible(true);
					dispose();
				}
			});
			button.setBounds(10, 227, 514, 23);
			contentPanel.add(button);
		}
		{
			JButton btnMatematyk = new JButton("Matematyk");
			btnMatematyk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIDeleteMathEmployee guiDeleteMathEmployee = new GUIDeleteMathEmployee();
					guiDeleteMathEmployee.setLocationRelativeTo(null);
					guiDeleteMathEmployee.setVisible(true);
					dispose();
				}
			});
			btnMatematyk.setBounds(10, 193, 252, 23);
			contentPanel.add(btnMatematyk);
		}
		{
			JButton btnInformatyk = new JButton("Informatyk");
			btnInformatyk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIDeleteItEmployee guiDeleteItEmployee = new GUIDeleteItEmployee();
					guiDeleteItEmployee.setLocationRelativeTo(null);
					guiDeleteItEmployee.setVisible(true);
					dispose();
				}
			});
			btnInformatyk.setBounds(272, 193, 252, 23);
			contentPanel.add(btnInformatyk);
		}
		{
			JLabel lblPracujcegoJakoMatematyk = new JLabel("Pracuj\u0105cego jako matematyk czy informatyk?");
			lblPracujcegoJakoMatematyk.setHorizontalAlignment(SwingConstants.CENTER);
			lblPracujcegoJakoMatematyk.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblPracujcegoJakoMatematyk.setBounds(10, 28, 514, 129);
			contentPanel.add(lblPracujcegoJakoMatematyk);
		}
	}

}
