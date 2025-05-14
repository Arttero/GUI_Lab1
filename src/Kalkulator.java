import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JLabel wynikLabel;
    private JLabel inputBLabel;
    private JLabel inputALabel;
    private JButton sumaButton;
    private JButton różnicaButton;
    private JButton wyjścieButton;
    private JTextField inputA;
    private JTextField inputB;
    private JPanel wyborJPanel;
    private JPanel wynikJPanel;
    private JPanel inputBJPanel;
    private JPanel inputAJPanel;
    private JPanel KalkulatorJPanel;
    double valueA, valueB, score;

    public Kalkulator() {
        super("Kalkulator");
        this.setContentPane(this.KalkulatorJPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300; //nie trzeba tego definiowac ale moze sie przydac na pozniej
        this.setSize(width, height);


        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(inputA.getText());
                valueB = Double.parseDouble(inputB.getText());
                score = valueA + valueB;
                wynikLabel.setText("Suma "+ String.valueOf(valueA) + " + " + String.valueOf(valueB) + " = " + String.valueOf(score));
                inputALabel.setText(" ");
                inputBLabel.setText(" ");
            }
        });
    }
}
