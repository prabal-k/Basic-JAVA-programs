import javax.swing.*;
import java.awt.*;

public class layout

{
    JFrame frame= new JFrame();

    JPanel button_panel = new JPanel();
    JPanel button_panel2 = new JPanel();
    JPanel button_panel3 = new JPanel();
    JPanel button_panel4 = new JPanel();
    JPanel button_panel5 = new JPanel();
    JButton[] buttons = new JButton[4];
    layout() {
        //FOR FRAME
        frame.setSize(700, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //FOR BUTTON_PANEL WEST
        // button_panel.setBounds(0,30,700,60);
        // button_panel.setLayout(new GridLayout(4,4));
        button_panel.setBackground(new Color(2));
        frame.setLayout(new BorderLayout());
        button_panel.setBounds(0,30,700,100);
         button_panel.setLayout(new GridLayout(4,4));
        button_panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        for (int i = 0; i < 4; i++)
        {
            buttons[i] = new JButton("HELLO");
            buttons[i].setFont(new Font("Ink free",Font.BOLD,40));
            buttons[i].setBackground(Color.GREEN);
            button_panel.add(buttons[i]);
        }
            //frame.add(button_panel,BorderLayout.WEST);

            // frame.add(button_panel,BorderLayout.WEST);


//        //for button panel east
//        button_panel2.setBackground(new Color(2));
//        frame.add(button_panel2,BorderLayout.EAST);
//
//        //for button panel SOUTH
//        button_panel3.setBackground(Color.RED);
//        frame.add(button_panel3,BorderLayout.SOUTH);
//
//        //for button panel NORTH
//        button_panel4.setBackground(Color.cyan);
//        frame.add(button_panel4,BorderLayout.NORTH);

            //  for button panel east
//        button_panel4.setBackground(Color.GREEN);
//        frame.add(button_panel4,BorderLayout.CENTER);


            //for 4 buttons;

            frame.add(button_panel);
            frame.setLayout(null);
            frame.setVisible(true);
        }

}
