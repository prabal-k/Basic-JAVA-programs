import javax.swing.*;
import java.awt.*;

public class Graphics {
    JFrame frame = new JFrame();
    JPanel panel =new JPanel();
    void forframe()
    {
        bOX box= new bOX();
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(700,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(box);
        frame.setVisible(true);

    }


}
