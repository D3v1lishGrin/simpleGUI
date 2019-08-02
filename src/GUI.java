import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
        JFrame frame = new JFrame();
        frame.show();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        JToolBar toolBar = new JToolBar();
        JButton button1 = new JButton("Weiter zur Adresseingabe");

        frame.add(panel);

        panel.setLayout(new FlowLayout());
        toolBar.setSize(new Dimension(50, this.getWidth()));
        button1.setPreferredSize(new Dimension(50,20));

        addNavigationButton(toolBar);
        panel.add(toolBar);
        panel.add(button1);
    }

    private void addNavigationButton(JToolBar toolBar){
        JButton button = new JButton("Einstellungen");

        toolBar.add(button);

    }

    public static void main (String [] args){
        GUI gui = new GUI();
    }
}
