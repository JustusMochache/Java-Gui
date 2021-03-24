import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {

    public static void main(String[] arg) {


        ImageIcon image = new ImageIcon("tower.jpeg");
        Border border = BorderFactory.createLineBorder(Color.BLUE); //for border

        JLabel label = new JLabel();
        label.setText("Hey Bro");

        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00ff00)); //st font color
        label.setFont(new Font("My Boli",Font.PLAIN,20));//set font
        label.setIconTextGap(-25);//sets gap
        label.setBackground(Color.black); // st backgroundcolor
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setBounds(100,100,250,250); //SET Y,X POSITION

        label.setVerticalAlignment(JLabel.CENTER);//STE VERTICAL POSITION WITHIN LABEL
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
      //  frame.pack(); //resizable option for set layout
    }
}
