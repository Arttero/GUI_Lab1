import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example01 extends JFrame {
    private JPanel JPanel1;
    private JButton okButton;
    private JButton witajButton;
    private JPanel JPanelButton;
    private JTextField textInputLabel;
    private JPanel JPanelLabel;
    private JButton killButton;
    private JLabel dataLabel;


    public Example01() {
        super("Moje pierwsze GUI");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300; //nie trzeba tego definiowac ale moze sie przydac na pozniej
        this.setSize(width, height);
        //bez ustawienia siza pojawia sie tylko 3 ikony
        //this.pack();//dostosowywuje rozmiar do maksymalnego rozmiaru elementu z tej tabeli



        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog("Podaj imię: ");//showInputDialog jest metoda przeciazana
                JOptionPane.showMessageDialog(null, "Witaj " + text,"Tytuł",JOptionPane.WARNING_MESSAGE);

                int a = JOptionPane.showConfirmDialog(null,"Wpisano dane: "+ text,
                        "To jest moje okno ",JOptionPane.YES_NO_OPTION);
            }
        });
    }
}
