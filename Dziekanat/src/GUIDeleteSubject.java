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

public class GUIDeleteSubject extends JDialog {
	private JTextField deletePositionTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIDeleteSubject dialog = new GUIDeleteSubject();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIDeleteSubject() throws IOException{
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
		
		JLabel lblNazwaPrzedmiotu = new JLabel("Nazwa przedmiotu");
		GridBagConstraints gbc_lblNazwaPrzedmiotu = new GridBagConstraints();
		gbc_lblNazwaPrzedmiotu.insets = new Insets(0, 0, 5, 5);
		gbc_lblNazwaPrzedmiotu.gridx = 2;
		gbc_lblNazwaPrzedmiotu.gridy = 0;
		panel.add(lblNazwaPrzedmiotu, gbc_lblNazwaPrzedmiotu);
		
		JLabel lblOznaczeniePrzedmiotu = new JLabel("Oznaczenie przedmiotu");
		GridBagConstraints gbc_lblOznaczeniePrzedmiotu = new GridBagConstraints();
		gbc_lblOznaczeniePrzedmiotu.insets = new Insets(0, 0, 5, 5);
		gbc_lblOznaczeniePrzedmiotu.gridx = 3;
		gbc_lblOznaczeniePrzedmiotu.gridy = 0;
		panel.add(lblOznaczeniePrzedmiotu, gbc_lblOznaczeniePrzedmiotu);
		
		
        try {
        	BufferedReader file = new BufferedReader(new FileReader("przedmioty.txt"));
            String line = file.readLine();
            int i=0;
            int j=1;
            while (line != null) {
            String[] subjectData = line.split("\\s+");
            
            JLabel lblPosition = new JLabel(Integer.toString(j));
    		GridBagConstraints gbc_lblPosition = new GridBagConstraints();
    		gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
    		gbc_lblPosition.gridx = 1;
    		gbc_lblPosition.gridy = 1+i;
    		panel.add(lblPosition, gbc_lblPosition);
            
			JLabel lblNazwa1 = new JLabel(subjectData[0]);
			GridBagConstraints gbc_lblNazwa1 = new GridBagConstraints();
			gbc_lblNazwa1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNazwa1.gridx = 2;
			gbc_lblNazwa1.gridy = 1+i;
			panel.add(lblNazwa1, gbc_lblNazwa1);
		
			JLabel lblOznaczenie1 = new JLabel(subjectData[1]);
			GridBagConstraints gbc_lblOznaczenie1 = new GridBagConstraints();
			gbc_lblOznaczenie1.insets = new Insets(0, 0, 0, 5);
			gbc_lblOznaczenie1.gridx = 3;
			gbc_lblOznaczenie1.gridy = 1+i;
			panel.add(lblOznaczenie1, gbc_lblOznaczenie1);
		
		
			i++;
			j++;

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
				GUISubjects guiSubjects= new GUISubjects();
				guiSubjects.setLocationRelativeTo(null);
				guiSubjects.setVisible(true);
				dispose();
				
			}
		});
		btnWr.setBounds(412, 5, 75, 23);
		panel_1.add(btnWr);
		
		JLabel lblUsuPozycjNumer = new JLabel("Usu\u0144 pozycj\u0119 numer:");
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
					useful.deleteLine("przedmioty.txt", Integer.parseInt(deletePositionTextField.getText()) );
					
					JOptionPane.showMessageDialog(getContentPane(),"Pozycja zosta�a usuni�ta");
					GUIDeleteSubject dialog;
					try {
						dialog = new GUIDeleteSubject();
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);			
						dialog.setLocationRelativeTo(null);
						dialog.setVisible(true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(getContentPane(),"W tym polu musisz wprowadzi� liczb�");
					GUIDeleteSubject dialog;
					try {
						dialog = new GUIDeleteSubject();
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
		
		JLabel lblUsuwaniePrzedmiotu = new JLabel("Usuwanie przedmiotu");
		lblUsuwaniePrzedmiotu.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuwaniePrzedmiotu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsuwaniePrzedmiotu.setBounds(69, 11, 364, 40);
		panel_2.add(lblUsuwaniePrzedmiotu);
	}
}