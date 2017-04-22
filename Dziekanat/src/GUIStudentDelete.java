import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class GUIStudentDelete extends JDialog {

	private JTextField deletePositionTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIStudentDelete dialog = new GUIStudentDelete();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIStudentDelete() throws IOException{
Useful useful = new Useful();
		
		setBounds(100, 100, 513, 700);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 54, 497, 575);
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{129, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblLp = new JLabel("L.p");
		GridBagConstraints gbc_lblLp = new GridBagConstraints();
		gbc_lblLp.insets = new Insets(0, 0, 5, 5);
		gbc_lblLp.gridx = 1;
		gbc_lblLp.gridy = 0;
		panel.add(lblLp, gbc_lblLp);
		
		JLabel lblImie = new JLabel("Imie");
		GridBagConstraints gbc_lblImie = new GridBagConstraints();
		gbc_lblImie.insets = new Insets(0, 0, 5, 5);
		gbc_lblImie.gridx = 2;
		gbc_lblImie.gridy = 0;
		panel.add(lblImie, gbc_lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		GridBagConstraints gbc_lblNazwisko = new GridBagConstraints();
		gbc_lblNazwisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblNazwisko.gridx = 3;
		gbc_lblNazwisko.gridy = 0;
		panel.add(lblNazwisko, gbc_lblNazwisko);
		
		JLabel lblPesel = new JLabel("Pesel");
		GridBagConstraints gbc_lblPesel = new GridBagConstraints();
		gbc_lblPesel.insets = new Insets(0, 0, 5, 5);
		gbc_lblPesel.gridx = 4;
		gbc_lblPesel.gridy = 0;
		panel.add(lblPesel, gbc_lblPesel);
		
		JLabel lblNumerIndeksu = new JLabel("Numer indeksu");
		GridBagConstraints gbc_lblNumerIndeksu = new GridBagConstraints();
		gbc_lblNumerIndeksu.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumerIndeksu.gridx = 5;
		gbc_lblNumerIndeksu.gridy = 0;
		panel.add(lblNumerIndeksu, gbc_lblNumerIndeksu);
		
		
		
        try {
        	BufferedReader file = new BufferedReader(new FileReader("studenci.txt"));
            String line = file.readLine();
            int i=0;
            while (line != null) {
			    String[] studentData = line.split("\\s+");
			    
			    JLabel lblPosition = new JLabel(Integer.toString(i+1));
				GridBagConstraints gbc_lblPosition = new GridBagConstraints();
				gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
				gbc_lblPosition.gridx = 1;
				gbc_lblPosition.gridy = 1+i;
				panel.add(lblPosition, gbc_lblPosition);
			    
				JLabel lblNazwa1 = new JLabel(studentData[0]);
				GridBagConstraints gbc_lblNazwa1 = new GridBagConstraints();
				gbc_lblNazwa1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNazwa1.gridx = 2;
				gbc_lblNazwa1.gridy = 1+i;
				panel.add(lblNazwa1, gbc_lblNazwa1);
			
				JLabel lblOznaczenie1 = new JLabel(studentData[1]);
				GridBagConstraints gbc_lblOznaczenie1 = new GridBagConstraints();
				gbc_lblOznaczenie1.insets = new Insets(0, 0, 0, 5);
				gbc_lblOznaczenie1.gridx = 3;
				gbc_lblOznaczenie1.gridy = 1+i;
				panel.add(lblOznaczenie1, gbc_lblOznaczenie1);
				
				JLabel lblPesele = new JLabel(studentData[2]);
				GridBagConstraints gbc_lblPodPeselem = new GridBagConstraints();
				gbc_lblPodPeselem.insets = new Insets(0, 0, 5, 5);
				gbc_lblPodPeselem.gridx = 4;
				gbc_lblPodPeselem.gridy = 1+i;
				panel.add(lblPesele, gbc_lblPodPeselem);
				
				JLabel lblIndeksy = new JLabel(studentData[3]);
				GridBagConstraints gbc_lblPodIndeksem = new GridBagConstraints();
				gbc_lblPodIndeksem.insets = new Insets(0, 0, 5, 5);
				gbc_lblPodIndeksem.gridx = 5;
				gbc_lblPodIndeksem.gridy = 1+i;
				panel.add(lblIndeksy, gbc_lblPodIndeksem);
			
				i++;
			
				line = file.readLine();
				if(line==null) break;
        	}
            file.close();
            
        }catch (IOException e1) {
       
        	e1.printStackTrace();
        	
        }

		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 628, 497, 33);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnWr = new JButton("Wr\u00F3\u0107");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIStudents guiStudents =new GUIStudents();
				guiStudents.setLocationRelativeTo(null);
				guiStudents.setVisible(true);
				dispose();
				
			}
		});
		btnWr.setBounds(412, 5, 75, 23);
		panel_1.add(btnWr);
		
		JLabel lblUsuPozycjNumer = new JLabel("Usu\u0144 pozycj\u0119 numer: ");
		lblUsuPozycjNumer.setBounds(10, 9, 138, 14);
		panel_1.add(lblUsuPozycjNumer);
		
		deletePositionTextField = new JTextField();
		deletePositionTextField.setBounds(128, 6, 86, 20);
		panel_1.add(deletePositionTextField);
		deletePositionTextField.setColumns(10);
		
		JButton btnUsu_1 = new JButton("Usu\u0144");
		btnUsu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				dispose();
				try {
					useful.deleteLine("studenci.txt", Integer.parseInt(deletePositionTextField.getText()) );
					
					JOptionPane.showMessageDialog(getContentPane(),"Pozycja zosta�a usuni�ta");
					GUIStudentDelete dialog;
					try {
						dialog = new GUIStudentDelete();
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);			
						dialog.setLocationRelativeTo(null);
						dialog.setVisible(true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(getContentPane(),"W tym polu musisz wprowadzi� liczb�");
					GUIStudentDelete dialog;
					try {
						dialog = new GUIStudentDelete();
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);			
						dialog.setLocationRelativeTo(null);
						dialog.setVisible(true);
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
					
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnUsu_1.setBounds(224, 5, 89, 23);
		panel_1.add(btnUsu_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(0, 0, 497, 56);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUsuwanieStudenta = new JLabel("Usuwanie studenta");
		lblUsuwanieStudenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuwanieStudenta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsuwanieStudenta.setBounds(69, 11, 364, 40);
		panel_2.add(lblUsuwanieStudenta);
	}

}
