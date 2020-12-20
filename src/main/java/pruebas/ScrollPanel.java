package pruebas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class ScrollPanel {

    public static void main(String[] args) {
        JPanel middlePanel = new JPanel();
        middlePanel.setBorder(new TitledBorder(new EtchedBorder(), "Historial"));

        // create the middle panel components
        JTextArea display = new JTextArea(16, 58);
        display.append("ola q ase");
        display.setEditable(false); // set textArea non-editable
        JScrollPane scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        //Add Textarea in to middle panel
        middlePanel.add(scroll);

        // My code
        JFrame frame = new JFrame();
        frame.add(middlePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
