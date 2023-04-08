import javax.swing.*;
import java.awt.*;

public class Swing {
    static void form()
    {
        JFrame frame = new JFrame("TITLE");
        frame.setSize(2000,1100);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);          //TO CLOSE THE PROGRAM ON EXIT
        frame.setResizable(false);


        //FOR BUTTON
        JButton butt = new JButton("Click me ! ");
        butt.setBounds(700,500,90,40);
        butt.setForeground(Color.BLUE);
        frame.add(butt);

        ImageIcon image = new ImageIcon("Barca.png");              //IMPORT LOGO OF OWN IN TITLE
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(Color.green);              //CHANGE THE BACKGROUND COLOR OF PANEL

        frame.setVisible(true);


    }

}
