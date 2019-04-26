package javaam2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import  java.awt.*;
import java.awt.event.*;

public class LeftCorner extends JPanel {
    private  MainPanel mainPanel;
    public LeftCorner(Bag playerBag,MainPanel mainPanel) {
        //Initial
        this.mainPanel = mainPanel;
        setBorder(new EmptyBorder(0, 5, 15, 15));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 18);

        //Creating Components
        JLabel head = new JLabel("Your Occupation");
        head.setFont(f1);
        add(head);
        //Priminister
        Primemin priMinnion = new Primemin("General Badge", 500, 40);
        JLabel priMinnionName = new JLabel("Prime Minister Minnion");
        JLabel priMinnionLevel = new JLabel("Level "+ priMinnion.returnPrefix()+"  "+priMinnion.returnLevel());
        JLabel priMinnnionGif = new JLabel(new ImageIcon(getClass().getResource("minnion.gif")));
        JLabel priMinnionInfo = new JLabel("<html> you have 250  <br>" +
                "council member and <br>Reporters for making a fun</html>");
        JLabel reporterLabel = new JLabel("Reporter Amount : " + priMinnion.returnReporterAmount());

        JButton increaseReporter = new JButton("Increase Reporter");
        increaseReporter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerBag.letMoneyDown();
                priMinnion.increaseReporter();
                reporterLabel.setText("Reporter Amount : " + priMinnion.returnReporterAmount());
                mainPanel.updateMoney();
            }
        });
        add(priMinnionName);
        add(priMinnionLevel);
        add(priMinnnionGif);
        add(priMinnionInfo);
        add(reporterLabel);

        add(increaseReporter);
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