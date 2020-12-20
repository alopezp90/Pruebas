package pruebas;

import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JFrame;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class VentanaPrincipal extends JFrame {

    // Tamaño de la ventana. Constantes
    public static final int SIZE_X = 600;
    public static final int SIZE_Y = 200;

    // Atributos
    private PanelHistorial panelHistorial;

    // Constructor de la clase 
    public VentanaPrincipal(String historial) {
        crearVentana();
        // Incializa el atributo de tipo Panel
        panelHistorial = new PanelHistorial(historial);
        // Añade el panel a la ventana
        this.add(panelHistorial, BorderLayout.EAST);
        // Cuando todos los elementos están creados se hace visible la ventana
        this.setVisible(true);
    }

    // Método privado para inicializar el JFrame
    private void crearVentana() {
        // Tamaño del JFrame
        this.setSize(SIZE_X, SIZE_Y);
        // Ventana no redimensionable
        this.setResizable(false);
        // Tipo de layout
        this.setLayout(new BorderLayout());
        // Comportamiento al cerrar la ventana
        // Terminar el programa
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
