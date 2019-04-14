package javaam2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * TextFieldTest
 */
public class TextFieldTest extends JFrame{
    private JTextField jtf;
    public TextFieldTest(){
        super("Testing TextField");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Enter Your Text");
        jtf = new JTextField(25);
        c.add(label1);
        c.add(jtf);

        jtf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("You Enter " + e.getActionCommand());
                jtf.setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,100);
        setVisible(true);
    }
    public static void main(String args[]) {
        new TextFieldTest();
    }
}