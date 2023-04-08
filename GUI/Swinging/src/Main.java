import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    Font myfont = new Font("Ink Free",Font.BOLD,30);
    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Swing Created");                     //FOR FRAME
        Part2 obj =new Part2();

        JLabel label1 = new JLabel("Enter your username: ");            //FOR FIRST LABEL
        label1.setBounds(250,300,150,30);


        JTextField text = new JTextField();
        text.setBounds(400,300,200,30);                     //FOR FIRST TEXTFIELD


        JLabel label2 = new JLabel("Enter your password: ");
        label2.setBounds(250,350,150,30);



        JTextField text2 = new JTextField();
        text2.setBounds(400,350,200,30);


        JButton butt = new JButton("verify");
        butt.setBounds(380,430,70,30);


        butt.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"CONTINUE ? ");
                frame.dispose();
                obj.display();
            }
        });



        frame.add(label2);
        frame.add(label1);


        frame.add(butt);
        frame.add(text2);
        frame.add(text);
        frame.setSize(900,800);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}