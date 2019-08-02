import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
        JFrame frame = new JFrame();
        frame.show();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel panel = new JPanel();

        frame.add(panel);

        panel.setLayout(new FlowLayout());
        JLabel label1 = new JLabel();
        JButton button1 = new JButton("Senden");
        button1.setPreferredSize(new Dimension(100,20));
        label1.setText("Adresseingabe");

        panel.add(label1);
        panel.add(button1);
    }

    public static void main (String [] args){
        GUI gui = new GUI();
    }
}
