import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

public class LoginGUI extends JFrame {

    // Componentes principais
    // Left Panel
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    public LoginGUI() {
        super();
        // Components

        //Panel Left Components
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");
        button5 = new JButton("button5");
        button6 = new JButton("button6");

        // Layouts
        GridLayout buttonsLayout = new GridLayout(2,2);
        GridLayout freeLayout = new GridLayout(1, 1);

        // WELCOME JLabel
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(buttonsLayout);
        panelLeft.add(button1);
        panelLeft.add(button2);
        panelLeft.add(button3);
        panelLeft.add(button4);
        panelLeft.add(button5);
        panelLeft.add(button6);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(freeLayout);
        mainPanel.add(panelLeft);

        // Jframe Build
        ImageIcon icon = new ImageIcon("logo\\ACMEDrone-logo.png");
        this.setIconImage(icon.getImage());
        this.add(mainPanel);
        this.setSize(800,600);
        this.setTitle("ACMEDrones");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        LoginGUI app = new LoginGUI();
    }
}
