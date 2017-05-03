import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GUIShowSubjects extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUIShowSubjects dialog = new GUIShowSubjects();
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
	public GUIShowSubjects() throws IOException{
		
		setBounds(100, 100, 513, 700);
		getContentPane().setLayout(null);
		
		Panel panelData = new Panel();
		panelData.setBounds(0, 54, 497, 575);
		getContentPane().add(panelData);
		GridBagLayout gbl_panelData = new GridBagLayout();
		gbl_panelData.columnWidths = new int[]{129, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelData.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelData.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
    		panelData.add(lblPosition, gbc_lblPosition);
            
			JLabel lblNazwa1 = new JLabel(subjectData[0]);
			GridBagConstraints gbc_lblNazwa1 = new GridBagConstraints();
			gbc_lblNazwa1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNazwa1.gridx = 2;
			gbc_lblNazwa1.gridy = 1+i;
			panelData.add(lblNazwa1, gbc_lblNazwa1);
		
			JLabel lblOznaczenie1 = new JLabel(subjectData[1]);
			GridBagConstraints gbc_lblOznaczenie1 = new GridBagConstraints();
			gbc_lblOznaczenie1.insets = new Insets(0, 0, 0, 5);
			gbc_lblOznaczenie1.gridx = 3;
			gbc_lblOznaczenie1.gridy = 1+i;
			panelData.add(lblOznaczenie1, gbc_lblOznaczenie1);
		
		
			i++;
			j++;

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
				GUIShowBase guiShowBase= new GUIShowBase();
				guiShowBase.setLocationRelativeTo(null);
				guiShowBase.setVisible(true);
				dispose();
				
			}
		});
		btnWr.setBounds(10, 5, 477, 23);
		panelButton.add(btnWr);
		
		Panel panelTitle = new Panel();
		panelTitle.setBounds(0, 0, 497, 56);
		getContentPane().add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblPrzedmioty = new JLabel("Przedmioty");
		lblPrzedmioty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzedmioty.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPrzedmioty.setBounds(69, 11, 364, 40);
		panelTitle.add(lblPrzedmioty);
	}
}
