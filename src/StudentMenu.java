import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMenu extends JDialog {
    private JPanel contentPane;
    private JButton dodajStudentaButton;
    private JButton wróćButton;
    private JButton buttonOK;

    public StudentMenu() {
        setContentPane(contentPane);
        setModal(true);
        wróćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        dodajStudentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddStudentMenu addstudentMenu=new AddStudentMenu();
                addstudentMenu.pack();
                addstudentMenu.setLocationRelativeTo(null);
                addstudentMenu.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        StudentMenu dialog = new StudentMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
