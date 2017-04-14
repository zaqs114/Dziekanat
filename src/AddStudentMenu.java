import javax.swing.*;

public class AddStudentMenu extends JDialog {
    private JPanel contentPane;
    private JButton wróćButton;
    private JButton dodajButton;
    private JTextField imieTextField;
    private JTextField nazwiskoTextField;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;

    public AddStudentMenu() {
        setContentPane(contentPane);
        setModal(true);

    }

    public static void main(String[] args) {
        AddStudentMenu dialog = new AddStudentMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
