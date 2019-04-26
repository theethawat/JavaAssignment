/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author theet
 */
public class MainPanel extends JPanel{
    private Novice playerNovice;
    private Bag playerBag;
    private File font_file = new File("D:\\A Tin 2019\\JavaAM2\\src\\javaam2\\Fonts\\leelawad.ttf");
    private Font f2 = new Font(Font.SANS_SERIF,Font.BOLD,18);
    private Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,12); ;
    private JLabel moneyInfo = new JLabel();
    private  JLabel expInfo;
    public MainPanel(Novice player,Bag bag){


        playerNovice = player;
        playerBag = bag;
        invalidate();
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);

        //Decaring
        JLabel header = new JLabel("Player Area");
        header.setFont(f2);
        JLabel welcomeLabel1 = new JLabel("Hello Welcome to my Ragnarok to jail Program");
        JLabel noviceName = new JLabel("Name: " + playerNovice.returnName());
        JLabel noviceImage = new JLabel(new ImageIcon(getClass().getResource("doraemon1.gif")));


        JLabel describe = new JLabel("<html> Nguen Ngin Doraemon one of the Doraemon Novice" +
                "<br>Can bring a magic thing from it bag with out borrow Doraemy Bag. <br> This is your Innitial Novice</html>");
       describe.setFont(f1);

       describe.setSize(30,40);
        describe.setBounds(10,10,200,200);
        JPanel statuspanel = createStatusPanel();

        JButton randomMoney = new JButton("Get More Money");

        randomMoney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int recieveMoney = bag.addingRandomMoney();
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"You got " + recieveMoney + " From Gachapon Random Congrat!");
                moneyInfo.setText(String.valueOf(playerBag.showMoney()));
            }
        });


        //Adding
        add(header);
        add(welcomeLabel1);
        add(noviceName);
        add(noviceImage);

        add(describe);
        add(statuspanel);
        add(randomMoney);


        playerNovice.printStatus();


        setBorder(new EmptyBorder(0,5,10,0));
    }

    private JPanel  createStatusPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,1,1));
        panel.setSize(30,30);
        panel.setBackground(Color.WHITE);
        //Declare
        JLabel healthLabel = new JLabel("Health : ",SwingConstants.RIGHT);
        JLabel expLabel = new JLabel("Experiance : ",SwingConstants.RIGHT);
        JLabel moneyLabel = new JLabel("Money : ",SwingConstants.RIGHT);
        JLabel healthInfo = new JLabel(String.valueOf(playerNovice.returnHealth()));
        expInfo = new JLabel(String.valueOf(playerNovice.returnExp()));
        moneyInfo.setText(String.valueOf(playerBag.showMoney()));

        //Adding
        panel.add(healthLabel);
        panel.add(healthInfo);
        panel.add(expLabel);
        panel.add(expInfo);
        panel.add(moneyLabel);
        panel.add(moneyInfo);

        panel.setMaximumSize(new Dimension(700,70));
        invalidate();
        return  panel;
    }

    public void updateEXP(){
        expInfo.setText(String.valueOf(playerNovice.returnExp()));
    }

    public void updateMoney(){
        moneyInfo.setText(String.valueOf(playerBag.showMoney()));
    }

}
