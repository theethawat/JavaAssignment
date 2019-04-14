package javaam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonTest extends JFrame{
    private int pressCount  = 0;
    //Create GUI by Using Constructor
    public ButtonTest(){
        super("Button Testing");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton jb = new JButton("Press me");
        c.add(jb);

        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Press" + pressCount++);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

   public static void main(String args[]) {
       new ButtonTest();
   }
}