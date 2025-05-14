import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class konwencjaCelsjuszaNaFarenheita extends JFrame {
    private JPanel KonwencjaJPanel;
    private JTextField inputTempC;
    private JButton konwertujButton;
    private JLabel TempCLabel;
    private JLabel TempFLabel;
    private JLabel WynikF;
    double valueCelsius, wynikFarenheit;

    public konwencjaCelsjuszaNaFarenheita() {
        super("Konwencja");
        this.setContentPane(this.KonwencjaJPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300; //nie trzeba tego definiowac ale moze sie przydac na pozniej
        this.setSize(width, height);

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueCelsius = Double.parseDouble(inputTempC.getText().trim());
                wynikFarenheit = valueCelsius * 9/5 + 32;
                WynikF.setText(wynikFarenheit+ "F");
            }
        });
    }
}
