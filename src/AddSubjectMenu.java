import javax.swing.*;

public class AddSubjectMenu extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public AddSubjectMenu() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        AddSubjectMenu dialog = new AddSubjectMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
