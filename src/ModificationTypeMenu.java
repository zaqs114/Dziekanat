import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModificationTypeMenu extends JDialog {
    private JPanel contentPane;
    private JButton studenciButton;
    private JButton grupyPrzedmiotówButton;
    private JButton pracownicyButton;
    private JButton przedmiotyButton;
    private JButton wróćButton;
    private JButton buttonOK;


    public ModificationTypeMenu() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        wróćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        studenciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentMenu studentMenu=new StudentMenu();
                studentMenu.pack();
                studentMenu.setLocationRelativeTo(null);
                studentMenu.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        ModificationTypeMenu dialog = new ModificationTypeMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
