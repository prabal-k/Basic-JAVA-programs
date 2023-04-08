import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField text_field = new JTextField();
    JTextField text_field2 = new JTextField();

    JTextField text_field3 = new JTextField();
    JButton button = new JButton("ADD");
    JButton button2 = new JButton("SUB");
    JButton button3 = new JButton("MULT");
    JButton button4 = new JButton("DIVIDE");


    void Render() {
        frame.setSize(700, 700);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);                                            //TO OPEN THE FRAME IN CENTER OF LOCATION


        //for add button
        button.setBounds(150, 400, 100, 40);
        frame.setLayout(null);
        frame.add(button);

        //for sub button
        button2.setBounds(250, 400, 100, 40);
        frame.setLayout(null);
        frame.add(button2);

        //for MULT button
        button3.setBounds(350, 400, 100, 40);
        frame.setLayout(null);
        frame.add(button3);

        //for DIVIDE
        button4.setBounds(450, 400, 100, 40);
        frame.setLayout(null);
        frame.add(button4);


        //FOR TEXTFIELD
        text_field.setBounds(200, 80, 200, 90);
        text_field.setFont(new Font("Ink free", Font.BOLD, 40));
        text_field.setForeground(Color.BLUE);
        frame.add(text_field);



        //for textfield2
        text_field2.setBounds(200, 200, 200, 90);
        text_field2.setFont(new Font("Ink free", Font.BOLD, 40));
        text_field2.setForeground(Color.BLUE);
        frame.add(text_field2);


        //for textfield3
        text_field3.setBounds(200, 300, 200, 90);
        text_field3.setFont(new Font("Ink free", Font.BOLD, 40));
        text_field3.setForeground(Color.BLUE);

        frame.add(text_field3);
        frame.setVisible(true);
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            int num = Integer.parseInt(text_field.getText());
            int num2 = Integer.parseInt(text_field2.getText());
            int num3 = num + num2;
            text_field3.setText(String.valueOf(num3));
        }
        else if(e.getSource()==button2)
        {
            int num = Integer.parseInt(text_field.getText());
            int num2 = Integer.parseInt(text_field2.getText());
            int num3 = num - num2;
            text_field3.setText(String.valueOf(num3));
        }
        else if(e.getSource()==button3)
        {
            int num = Integer.parseInt(text_field.getText());
            int num2 = Integer.parseInt(text_field2.getText());
            int num3 = num * num2;
            text_field3.setText(String.valueOf(num3));
        }
        else if(e.getSource()==button4)
        {
            int num = Integer.parseInt(text_field.getText());
            int num2 = Integer.parseInt(text_field2.getText());
            int num3 = num / num2;
            text_field3.setText(String.valueOf(num3));
        }



    }
}
