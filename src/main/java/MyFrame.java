import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

    MyFrame(){
//        Jthis this = new Jthis(); //creates a this
        this.setTitle("Jthis first GUI ");


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);// set x-dimension and y-dimension
        this.setVisible(true); //make this visible

        ImageIcon image = new ImageIcon("tower.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon this

        this.getContentPane().setBackground(new Color(230, 227, 255)); //change background color
    }

}
