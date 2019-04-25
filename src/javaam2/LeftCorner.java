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
        Primemin minnion = new Primemin("General Badge", 500, 40);
        JLabel minnionName = new JLabel("Minnion General");
        JLabel minnionLevel = new JLabel("Level "+ minnion.returnLevel());
        JLabel minnnionGif = new JLabel(new ImageIcon(getClass().getResource("minnion.gif")));
//        minnnionGif.setMaximumSize(new Dimension(100,200));
        add(minnionName);
        add(minnionLevel);
        add(minnnionGif);
    }
}