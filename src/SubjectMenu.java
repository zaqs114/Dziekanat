import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubjectMenu extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton dodajButton;
    private JButton usuńButton;

    public SubjectMenu() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddSubjectMenu addSubjectMenu=new AddSubjectMenu();
                addSubjectMenu.pack();
                addSubjectMenu.setLocationRelativeTo(null);
                addSubjectMenu.setVisible(true);

            }
        });
        usuńButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteSubjectMenu deleteSubjectMenu = new DeleteSubjectMenu();
                deleteSubjectMenu.pack();
                deleteSubjectMenu.setLocationRelativeTo(null);
                deleteSubjectMenu.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SubjectMenu dialog = new SubjectMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
