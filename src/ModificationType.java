import javax.swing.*;

public class ModificationType extends JDialog {
    private JPanel contentPane;
    private JButton studenciButton;
    private JButton grupyPrzedmiotówButton;
    private JButton pracownicyButton;
    private JButton przedmiotyButton;
    private JButton wróćButton;
    private JButton buttonOK;


    public ModificationType() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        ModificationType dialog = new ModificationType();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
