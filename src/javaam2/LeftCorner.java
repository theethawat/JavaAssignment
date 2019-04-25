package javaam2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import  java.awt.*;
import java.awt.event.*;

public class LeftCorner extends JPanel {
    public LeftCorner(Bag playerBag) {
        //Initial
        setBorder(new EmptyBorder(0, 5, 15, 15));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 18);

        //Creating Components
        JLabel head = new JLabel("Your Item");
        head.setFont(f1);
        add(head);
        //Priminister
        Primemin priMinnion = new Primemin("General Badge", 500, 40);
        JLabel priMinnionName = new JLabel("Prime Minister Minnion");
        JLabel priMinnionLevel = new JLabel("Level "+ priMinnion.returnPrefix()+"  "+priMinnion.returnLevel());
        JLabel priMinnnionGif = new JLabel(new ImageIcon(getClass().getResource("minnion.gif")));

        add(priMinnionName);
        add(priMinnionLevel);
        add(priMinnnionGif);

        //OldPrime
        OldPrime ultraman = new OldPrime("Old Gardian",1000,500,"Singapore");
        JLabel ultramanName = new JLabel("Ultraman 80");
        JLabel ultramanLevel = new JLabel("Level "+ ultraman.returnPrefix()+" " + ultraman.returnLevel());
        JLabel ultramanImg = new JLabel(new ImageIcon(getClass().getResource("ultraman.jpg")));
        add(ultramanName);
        add(ultramanLevel);
        add(ultramanImg);
    }
}