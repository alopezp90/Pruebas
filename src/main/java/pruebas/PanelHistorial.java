package pruebas;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class PanelHistorial extends JScrollPane{

    private static final int SIZE_X = 366;
    private static final int SIZE_Y = 766;
    
    private JLabel textoHistorial;
    private JScrollPane panelScroll;

    public PanelHistorial(String historial) {
        inicializarComponentes(historial);
    }
    
    private void inicializarComponentes(String historial) {
        this.textoHistorial = new JLabel(historial);
        this.textoHistorial.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        
        this.panelScroll = new JScrollPane(this.textoHistorial);
        this.panelScroll.setPreferredSize(new Dimension(SIZE_X, SIZE_Y));
    }
}
