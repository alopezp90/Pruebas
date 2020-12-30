package pruebas;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class JTextPanel {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        JTextPane panel = new JTextPane();
        panel.setContentType("text/html");
        panel.setText("texto de prueba");
        panel.setEditable(false);
        
        frame.add(panel);
        frame.setVisible(true);

        long tick = 10;
        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JTextPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        panel.setText("y ahora ha cambiado");

    }

}
