package pruebas;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class ScrollableJLabel {

    public static void main(String[] args) {
        
        JLabel textoLog = new JLabel("texto");
        textoLog.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        //textoLog.setPreferredSize(new Dimension(180, 180));
        JScrollPane js = new JScrollPane(textoLog);

        js.setPreferredSize(new Dimension(366, 766));

        JFrame ventana = new JFrame();
        ventana.setSize(1368, 768);
        
        ventana.setLayout(new BorderLayout());
        ventana.add(js, BorderLayout.EAST);
        ventana.setVisible(true);
    }
}
