import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table implements ActionListener
{
    JFrame frame=new JFrame();
    JButton button = new JButton("ADD");
    JTable table = new JTable();
    DefaultTableModel model = (DefaultTableModel) table.getModel();



    JLabel label_name=new JLabel();
    JLabel label_city=new JLabel();
    JLabel label_phone=new JLabel();

    JTextField textfield_name =new JTextField();

    JTextField textfield_city =new JTextField();
    String column[] = {"city", "name"};
    Table()
    {

        //FOR FRAME
        frame.setSize(2000,2000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        //FOR NAME LABEL
        label_name.setBounds(150,36,90,40);
        label_name.setText("NAME: ");
        label_name.setFont(new Font("Ink free",Font.BOLD,20));
        label_name.setForeground(Color.BLUE);
        frame.add(label_name);

        //for name textfield
        textfield_name.setBounds(290,30,220,50);
        textfield_name.setForeground(Color.BLUE);
        textfield_name.setFont(new Font("Ink free",Font.BOLD,20));
        frame.add(textfield_name);

        //for CITY LABEL
        label_city.setBounds(150,110,90,40);
        label_city.setText("CITY: ");
        label_city.setFont(new Font("Ink free",Font.BOLD,20));
        label_city.setForeground(Color.BLUE);
        frame.add(label_city);

        //for CITY textfield
        textfield_city.setBounds(290,110,220,50);
        textfield_city.setForeground(Color.BLUE);
        textfield_city.setFont(new Font("Ink free",Font.BOLD,20));
        frame.add(textfield_city);

        //for table
        table=new JTable();
        //table.setBounds(0,300,800,400);

        //for push button
        button.setBounds(250,200,80,30);
        button.setForeground(Color.BLUE);
        frame.add(button);



        button.addActionListener(this);
        frame.add(table);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            String data[] = {textfield_name.getText(),textfield_city.getText()};

            model.addColumn(column);
            model.addRow(data);
            table.setBounds(40,400,900,100);
            table.setModel(model);
            textfield_name.setText("");
            textfield_city.setText("");
    }
}}
