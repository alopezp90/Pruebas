package pruebas;

/**
 * @author Alberto López Puertas 
 * <alopezp90@gmail.com>
 */
import static java.lang.Thread.sleep;
import javax.swing.JFrame;

public class JFrameEnThreads implements Runnable{

    JFrame theFrame;


    public JFrameEnThreads(JFrame f) {
        this.theFrame = f;
    }


    // Run two Frames in separate therads
    public static void main(String[] arguments) throws InterruptedException {
        JFrame f1 = new JFrame("f1 title");
        JFrame f2 = new JFrame("f2 title");

        Thread t1 = new Thread(new JFrameEnThreads(f1));
        Thread t2 = new Thread(new JFrameEnThreads(f2));

        t2.start();
        t2.sleep(5000);
        t1.start();
    }


    @Override
    public void run() {
        theFrame.setSize(200, 200);
        theFrame.setVisible(true);

        // Attention: This closes the app, and therefore both frames!
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

} // end class TestTwoFrames
