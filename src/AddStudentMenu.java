import javax.swing.*;

public class AddStudentMenu extends JDialog {
    private JPanel contentPane;
    private JButton wróćButton;
    private JButton dodajButton;
    private JTextField textField1;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;

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
