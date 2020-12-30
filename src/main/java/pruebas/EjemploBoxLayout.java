package pruebas;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
//import java.awt.*;
//import javax.swing.*;
//
//public class VentanPrincipal {
//
//    public static void main(String[] args) {
//
//        JButton b1 = new JButton("b1");
//        JButton b2 = new JButton("b2");
//        
//        b1.setBackground(Color.green);
//        b2.setBackground(Color.pink);
//        
//        b1.setBorderPainted(true);
//        b2.setBorderPainted(true);
//        
//        b1.setSize(100, 100);
//        b2.setSize(300, 300);
//        
//        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
//        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
//        
//        JPanel pane = new JPanel();
//        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
//        pane.add(b1);
//        pane.add(b2);
//        
//        JFrame frame = new JFrame();
//        frame.setSize(400, 400);
//        frame.setLayout(new FlowLayout());
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.pack();
//        frame.setVisible(true);
//    }
//}

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EjemploBoxLayout {
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        addAButton("Button 1", pane);
        addAButton("Button 2", pane);
        addAButton("Button 3", pane);
        addAButton("Long-Named Button 4", pane);
        addAButton("5", pane);
        
    }

    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("BoxLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
