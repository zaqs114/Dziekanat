import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GUIAddSubjectGroup extends JDialog implements ItemListener{

private final JPanel contentPanel = new JPanel();
private final JPanel parentPanel;
private JTextField txtSubjectID;

/**
 * Launch the application.
 */
public static void main(String[] args) {
    try {
        GUIAddSubjectGroup dialog = new GUIAddSubjectGroup();
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
public GUIAddSubjectGroup() {
    setBounds(100, 100, 450, 500);
    getContentPane().setLayout(null);
    contentPanel.setBounds(0, 11, 434, 202);
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel);
    contentPanel.setLayout(null);


    JComboBox cbxTypStudiow = new JComboBox();
    cbxTypStudiow.setBounds(253, 84, 95, 20);
    cbxTypStudiow.addItem("Dzienne");
    cbxTypStudiow.addItem("Zaoczne");
    cbxTypStudiow.addItemListener(this);
    contentPanel.add(cbxTypStudiow);
    
    JLabel lblDodawanieGrupyPrzedmiotowej = new JLabel("Dodawanie grupy przedmiotowej");
    lblDodawanieGrupyPrzedmiotowej.setHorizontalAlignment(SwingConstants.CENTER);
    lblDodawanieGrupyPrzedmiotowej.setFont(new Font("Tahoma", Font.PLAIN, 25));
    lblDodawanieGrupyPrzedmiotowej.setBounds(10, 0, 400, 73);
    contentPanel.add(lblDodawanieGrupyPrzedmiotowej);
    
    JLabel lblTypStudiw = new JLabel("Typ studi\u00F3w");
    lblTypStudiw.setBounds(103, 87, 95, 14);
    contentPanel.add(lblTypStudiw);
    
    JLabel lblPrzedmiot = new JLabel("Przedmiot");
    lblPrzedmiot.setBounds(103, 112, 95, 20);
    contentPanel.add(lblPrzedmiot);
    
    JLabel lblProwadzcy = new JLabel("Prowadz\u0105cy");
    lblProwadzcy.setBounds(103, 140, 96, 14);
    contentPanel.add(lblProwadzcy);
    
    JComboBox cbxPrzedmiot = new JComboBox();
    cbxPrzedmiot.setBounds(253, 115, 95, 20);
    contentPanel.add(cbxPrzedmiot);
    for (int i = 0; i < Subjects.subjectsList.size(); i++) {
    	cbxPrzedmiot.addItem(Subjects.subjectsList.get(i).getSubjectName());
    }
    
    JComboBox cbxProwadzacy = new JComboBox();
    cbxProwadzacy.setBounds(253, 140, 95, 20);
    contentPanel.add(cbxProwadzacy);
    
    JLabel lblOznaczenieGrupy = new JLabel("Oznaczenie grupy");
    lblOznaczenieGrupy.setBounds(103, 173, 111, 14);
    contentPanel.add(lblOznaczenieGrupy);
    
    txtSubjectID = new JTextField();
    txtSubjectID.setBounds(253, 171, 95, 17);
    contentPanel.add(txtSubjectID);
    txtSubjectID.setColumns(10);
    for (int i = 0; i < Employee.itEmployeeList.size(); i++) {
    	cbxProwadzacy.addItem(Employee.itEmployeeList.get(i).getName()+' '+Employee.itEmployeeList.get(i).getSurname());
    }
    for (int i = 0; i < Employee.mathEmployeeList.size(); i++) {
    	cbxProwadzacy.addItem(Employee.mathEmployeeList.get(i).getName()+' '+Employee.mathEmployeeList.get(i).getSurname());
    }
    
                        
    parentPanel = new JPanel();
    parentPanel.setBounds(0, 224, 434, 182);
    getContentPane().add(parentPanel);
    parentPanel.setLayout(new CardLayout(0, 0));

    JPanel dziennePanel = new JPanel();
    parentPanel.add(dziennePanel, "Dzienne");
    
    int numberCheckBox = Student.dailyStudentList.size();
    JCheckBox[] checkBoxList = new JCheckBox[numberCheckBox]; 
    for(int i = 0; i < numberCheckBox; i++) {
    	checkBoxList[i] = new JCheckBox(Student.dailyStudentList.get(i).getName()+' '+Student.dailyStudentList.get(i).getSurname());
    	dziennePanel.add(checkBoxList[i]);
    		}
    
    JPanel zaocznePanel = new JPanel();
    parentPanel.add(zaocznePanel, "Zaoczne");
    
    int numberCheckBox2 = Student.weekendStudentList.size();
    JCheckBox[] checkBoxList2 = new JCheckBox[numberCheckBox2]; 
    for(int i = 0; i < numberCheckBox2; i++) {
    	checkBoxList2[i] = new JCheckBox(Student.weekendStudentList.get(i).getName()+' '+Student.weekendStudentList.get(i).getSurname());
    	zaocznePanel.add(checkBoxList2[i]);
    		}
            

    
    JPanel panelButtons = new JPanel();
    panelButtons.setBounds(10, 417, 414, 33);
    getContentPane().add(panelButtons);
    panelButtons.setLayout(null);
    
    
    
    JButton btnDodaj = new JButton("Dodaj");
    btnDodaj.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		Useful useful = new Useful();
    		if (cbxPrzedmiot.getSelectedItem()==null ||txtSubjectID.getText()==null || cbxTypStudiow.getSelectedItem()==null|| cbxProwadzacy.getSelectedItem()==null || useful.isFieldEmpty(txtSubjectID.getText())) {
                JOptionPane.showMessageDialog(getContentPane(),"Pola nie mog\u0105 by\u0107 puste!");
            }else{
            		if(cbxTypStudiow.getSelectedItem()=="Dzienne"){
            			ArrayList<String>namesOfStudents = new ArrayList<>();
            			final int numberCheckBox = Student.dailyStudentList.size();
            				for(int i = 0; i <numberCheckBox ; i++) {
            					if(checkBoxList[i].isSelected()){
            						namesOfStudents.add(checkBoxList[i].getLabel());
            					}
            				}
	    		    
    		    SubjectGroups.subjectGroupsList.add(new SubjectGroups(cbxPrzedmiot.getSelectedItem().toString(), txtSubjectID.getText(), cbxTypStudiow.getSelectedItem().toString(), cbxProwadzacy.getSelectedItem().toString(), namesOfStudents));
    		 
    		 	}if(cbxTypStudiow.getSelectedItem()=="Zaoczne"){
    		 		ArrayList<String>namesOfStudents = new ArrayList<>();
    		    	final int numberCheckBox2 = Student.weekendStudentList.size();
        		    for(int i = 0; i <numberCheckBox2 ; i++) {
        		    	if(checkBoxList2[i].isSelected()){
        		    		namesOfStudents.add(checkBoxList2[i].getLabel());
    		    }
        		    }
        		 
        		SubjectGroups.subjectGroupsList.add(new SubjectGroups(cbxPrzedmiot.getSelectedItem().toString(), txtSubjectID.getText(), cbxTypStudiow.getSelectedItem().toString(), cbxProwadzacy.getSelectedItem().toString(), namesOfStudents));
    		    }
    		 	JOptionPane.showMessageDialog(getContentPane(), "Pomy\u015Blnie dodano grup\u0119 przedmiotow\u0105.");
				dispose();
				GUIAddSubjectGroup guiAddSubjectGroup = new GUIAddSubjectGroup();
				guiAddSubjectGroup.setLocationRelativeTo(null);
				guiAddSubjectGroup.setVisible(true);
    	}
    	}
    });
   
    btnDodaj.setBounds(10, 5, 180, 23);
    panelButtons.add(btnDodaj);

    		
    		
    JButton btnWr = new JButton("Wr\u00F3\u0107");
    btnWr.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		GUISubjectGroups guiSubjectGroups = new GUISubjectGroups();
    		guiSubjectGroups.setLocationRelativeTo(null);
    		guiSubjectGroups.setVisible(true);
    		dispose();
    	}
    });
    btnWr.setBounds(224, 5, 180, 23);
    panelButtons.add(btnWr);
}

public void itemStateChanged(ItemEvent e) {
    CardLayout cl = (CardLayout) (parentPanel.getLayout());
    cl.show(parentPanel, (String) e.getItem());
}
}