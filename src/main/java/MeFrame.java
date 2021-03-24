import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeFrame extends JFrame implements ActionListener {

JButton button;



    MeFrame(){

        JButton button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setText("i AM BUTTON");
        button.setFocusable(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);// set x-dimension and y-dimension
        this.setLayout(null);
        this.setVisible(true); //make this visible
        this.add(button);

    }
@Override
public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            System.out.println("pooo");

        }
        }

}
