import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame_class implements ActionListener {
    JFrame frame=new JFrame();
    JButton inc_button=new JButton();
    JButton dec_button=new JButton();
    JLabel label =new JLabel();
    Frame_class()
    {
        //for frame;
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);

        //for label
        label.setBounds(270,100,80,50);
        label.setText("1");
        label.setBackground(Color.white);
        label.setFont(new Font("Ink free",Font.BOLD,40));
        label.setForeground(Color.GREEN);

        frame.add(label);


        //for increase button
        inc_button.setBounds(80,300,180,50);
        inc_button.setText("INCREASE");
        inc_button.setFont(new Font("Ink free",Font.BOLD,25));
        inc_button.setForeground(Color.GREEN);
        frame.add(inc_button);
        inc_button.addActionListener(this);

        //for decrease button
        dec_button.setBounds(330,300,180,50);
        dec_button.setText("DECREASE");
        dec_button.setFont(new Font("Ink free",Font.BOLD,25));
        dec_button.setForeground(Color.GREEN);
        frame.add(dec_button);
        dec_button.addActionListener(this);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==inc_button)
        {
            int ch = Integer.parseInt(label.getText());
            ch++;
            label.setText(String.valueOf(ch));
        }
        else
        {
            int ch2 = Integer.parseInt(label.getText());
            ch2--;
            label.setText(String.valueOf(ch2));

        }

    }
}
