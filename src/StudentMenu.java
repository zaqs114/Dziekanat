import javax.swing.*;

public class StudentMenu extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public StudentMenu() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        StudentMenu dialog = new StudentMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
