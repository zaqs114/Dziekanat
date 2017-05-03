import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class GUIShowEmployees extends JDialog {



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIShowEmployees dialog = new GUIShowEmployees();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUIShowEmployees() {
		setBounds(100, 100, 513, 700);
		getContentPane().setLayout(null);
		
		Panel panelData = new Panel();
		panelData.setBounds(0, 54, 497, 575);
		getContentPane().add(panelData);
		GridBagLayout gbl_panelData = new GridBagLayout();
		gbl_panelData.columnWidths = new int[]{98, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelData.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelData.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JLabel lblStanowisko = new JLabel("Stanowisko");
		GridBagConstraints gbc_lblStanowisko = new GridBagConstraints();
		gbc_lblStanowisko.insets = new Insets(0, 0, 5, 5);
		gbc_lblStanowisko.gridx = 5;
		gbc_lblStanowisko.gridy = 0;
		panelData.add(lblStanowisko, gbc_lblStanowisko);
		
		JLabel lblWynagrodzenie = new JLabel("Wynagrodzenie (w PLN)");
		GridBagConstraints gbc_lblWynagrodzenie = new GridBagConstraints();
		gbc_lblWynagrodzenie.insets = new Insets(0, 0, 5, 5);
		gbc_lblWynagrodzenie.gridx = 6;
		gbc_lblWynagrodzenie.gridy = 0;
		panelData.add(lblWynagrodzenie, gbc_lblWynagrodzenie);
		
		
		
        try {
        	BufferedReader file = new BufferedReader(new FileReader("pracownicy.txt"));
            String line = file.readLine();
            int i=0;
            while (line != null) {
			    String[] employeeData = line.split("\\s+");
			    
			    JLabel lblPosition = new JLabel(Integer.toString(i+1));
				GridBagConstraints gbc_lblPosition = new GridBagConstraints();
				gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
				gbc_lblPosition.gridx = 1;
				gbc_lblPosition.gridy = 1+i;
				panelData.add(lblPosition, gbc_lblPosition);
			    
				JLabel lblNazwa1 = new JLabel(employeeData[0]);
				GridBagConstraints gbc_lblNazwa1 = new GridBagConstraints();
				gbc_lblNazwa1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNazwa1.gridx = 2;
				gbc_lblNazwa1.gridy = 1+i;
				panelData.add(lblNazwa1, gbc_lblNazwa1);
			
				JLabel lblOznaczenie1 = new JLabel(employeeData[1]);
				GridBagConstraints gbc_lblOznaczenie1 = new GridBagConstraints();
				gbc_lblOznaczenie1.insets = new Insets(0, 0, 0, 5);
				gbc_lblOznaczenie1.gridx = 3;
				gbc_lblOznaczenie1.gridy = 1+i;
				panelData.add(lblOznaczenie1, gbc_lblOznaczenie1);
				
				JLabel lblPesele = new JLabel(employeeData[2]);
				GridBagConstraints gbc_lblPodPeselem = new GridBagConstraints();
				gbc_lblPodPeselem.insets = new Insets(0, 0, 5, 5);
				gbc_lblPodPeselem.gridx = 4;
				gbc_lblPodPeselem.gridy = 1+i;
				panelData.add(lblPesele, gbc_lblPodPeselem);
				
				JLabel lblStanowiska = new JLabel(employeeData[4]);
				GridBagConstraints gbc_lblStanowiska = new GridBagConstraints();
				gbc_lblStanowiska.insets = new Insets(0, 0, 5, 5);
				gbc_lblStanowiska.gridx = 5;
				gbc_lblStanowiska.gridy = 1+i;
				panelData.add(lblStanowiska, gbc_lblStanowiska);
				
				JLabel lblWynagrodzenia = new JLabel(employeeData[3]);
				GridBagConstraints gbc_lblWynagrodzenia = new GridBagConstraints();
				gbc_lblWynagrodzenia.insets = new Insets(0, 0, 5, 5);
				gbc_lblWynagrodzenia.gridx = 6;
				gbc_lblWynagrodzenia.gridy = 1+i;
				panelData.add(lblWynagrodzenia, gbc_lblWynagrodzenia);
			
				i++;
			
				line = file.readLine();
				if(line==null) break;
        	}
            file.close();
            
        }catch (IOException e1) {
       
        	e1.printStackTrace();
        	
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
		
		JLabel lblPracownicy = new JLabel("Pracownicy");
		lblPracownicy.setHorizontalAlignment(SwingConstants.CENTER);
		lblPracownicy.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPracownicy.setBounds(70, 11, 364, 40);
		panelTitle.add(lblPracownicy);
	}

}
