package pruebas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * @author Alberto López Puertas 
 * <alopezp90@gmail.com>
 */
public class PruebaPunto extends JFrame {

    public PruebaPunto() {
        this.setPreferredSize(new Dimension(400, 400));
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // define the position
        int locX = 200;
        int locY = 200;

        // draw a line (there is no drawPoint..)
       // g.draw(locX, locY, locX, locY); 
    }

    public static void main(String[] args) {
        PruebaPunto test = new PruebaPunto(); 
    }
}
