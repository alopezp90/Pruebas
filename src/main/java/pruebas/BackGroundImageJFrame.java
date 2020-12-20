package pruebas;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BackgroundImageJFrame extends JFrame {

    JButton b1;
    JLabel l1;

    public BackgroundImageJFrame() {
        setTitle("Background Color for JFrame");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);

        //One way
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("gato400.jpeg"));
        add(background);
        background.setLayout(new FlowLayout());
        l1 = new JLabel("Here is a button");
        b1 = new JButton("I am a button");
        background.add(l1);
        background.add(b1);

//        // Another way
//        setLayout(new BorderLayout());
//        setContentPane(new JLabel(new ImageIcon("gato400.jpeg")));
//        setLayout(new FlowLayout());
//        l1=new JLabel("Here is a button");
//        b1=new JButton("I am a button");
//        add(l1);
//        add(b1);
//        // Just for refresh :) Not optional!
//        setSize(399,399);
//        setSize(400,400);
    }

    public static void main(String args[]) {
        BackgroundImageJFrame backgroundImageJFrame = new BackgroundImageJFrame();
        backgroundImageJFrame.setVisible(true);
    }
}
