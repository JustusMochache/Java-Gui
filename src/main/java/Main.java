import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;


public class Main {

    public static void main(String[] arg) {
        // Jframe a gui window to add components to
        
        
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("Jframe first GUI ");
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);// set x-dimension and y-dimension
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("tower.jpeg");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(new Color(230, 227, 255));
    }
}
