import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class AddSubjectMenu extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nazwaPrzedmiotuTextField;
    private JTextField oznaczeniePrzedmiotuTextField;

    public AddSubjectMenu() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Subjects subjects = new Subjects();
                try {
                    if (subjects.isThereDuplicate(oznaczeniePrzedmiotuTextField.getText())==false){
                        subjects.setSubjectName(nazwaPrzedmiotuTextField.getText());
                        subjects.setSubjectID(oznaczeniePrzedmiotuTextField.getText());
                        subjects.writeToFile();
                        JOptionPane.showMessageDialog(contentPane,"Pomyślnie dodano przedmiot.");
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(contentPane, "W bazie jest już przedmiot o tym ID. Zmień ID i spróbuj ponownie.");
                    }

                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        AddSubjectMenu dialog = new AddSubjectMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
