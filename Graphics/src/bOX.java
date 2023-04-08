import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bOX extends JPanel implements ActionListener {
        JButton button = new JButton("Click me");
        int box1=200;
        int box2=200;

    bOX() {
        setBackground(Color.ORANGE);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //FOR rectangle -1
        g.setColor(Color.BLUE);
        g.fillRect(10,10,100,100);

        //FOR rectangle 2
        g.setColor(Color.RED);
        g.fillRect(200,10,100,100);

        //for oval size
        g.fillOval(box1,box2,40,40);

        //for button

        button.setBounds(300,500,80,40);
        button.setBackground(Color.BLACK);
        add(button);

        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        box1=box1+20;
        box2=box2+20;
        repaint();



    }
}
