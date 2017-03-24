import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JDialog {
    private JPanel contentPane;
    private JButton edytujInformacjeButton;
    private JButton exit;
    private JButton wyświetlStatystykiButton;
    private JButton wyświetlBazęButton;


    public MainMenu() {
        setContentPane(contentPane);
        setModal(true);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        edytujInformacjeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModificationTypeMenu modifyType=new ModificationTypeMenu();
                modifyType.pack();
                modifyType.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        MainMenu dialog = new MainMenu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
