import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] arg) {


        ImageIcon icon =new ImageIcon("tower.png");
        JLabel label = new JLabel();
        label.setText("hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,79,75);


       JPanel redpanel = new JPanel();
       redpanel.setBackground(Color.RED);
       redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0,250,500,250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
//        frame.setLayout(null);
        frame.setVisible(true);
        bluepanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

      //  frame.pack(); //resizable option for set layout
    }
}
