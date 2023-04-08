import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    static Scanner obj =new Scanner(System.in);
    public static void main(String[] args)
    {
        //FOR FRAME OR FORM
        JFrame frame = new JFrame("title");
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setResizable(false);
        //FOR BUTTON
        JButton button = new JButton("click here");
        button.setBounds(200,200,100,50);
        button.setForeground(Color.CYAN);

        //FOR TEXTFIELD OR TEXTBOX
        JTextField textfield= new JTextField();
        textfield.setBounds(200,100,90,40);
        textfield.setForeground(Color.BLUE);

        frame.add(button);
        frame.add(textfield);

        frame.setVisible(true);

    }
}