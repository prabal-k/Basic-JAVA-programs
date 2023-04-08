import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Transparency.TRANSLUCENT;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("\t \t SATISH PARAJULI MANAGEMNET SYSTEM");
        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
//        frame.setBackground(Color.BLACK);

        //FOR BUTTON

        JButton button = new JButton("click me");
        button.setBounds(100,100,100,100);
        button.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        frame.getContentPane().setBackground(Color.red);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null,"continue");
            }
        });

        frame.setVisible(true);


        //DISPLAY MESSAGE BOX
        //JOptionPane.showMessageDialog(null , " CONTINUE ? ", "DISPLAY",JOptionPane.INFORMATION_MESSAGE);



    }
}