/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author theet
 */
public class MainPanel extends JPanel{
    private Novice playerNovice;
    private Bag playerBag;
    public MainPanel(Novice player,Bag bag){
        playerNovice = player;
        playerBag = bag;
        invalidate();
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        //Decaring
        JLabel welcomeLabel1 = new JLabel("Hello Welcome to my Ragnarok to jail Program");
        JLabel noviceName = new JLabel("Name: " + playerNovice.returnName());
        JLabel noviceImage = new JLabel(new ImageIcon(getClass().getResource("doraemon1.gif")));


        JLabel describe = new JLabel("<html> โดเรม่อนงุ่นงิ่น เป็น โดเรม่อนโนวิก ชนิดหนึ่งที่" +
                "<br>สามารถเอาของวิเศษออกมาได้ โดยไม่ต้องยืมเพื่อน <br> เป็นโนวิก เริ่มต้นของคุณ</html>");
       describe.setSize(30,40);
        describe.setBounds(10,10,200,200);
        JPanel statuspanel = createStatusPanel();
        //Adding
        add(welcomeLabel1);
        add(noviceName);
        add(noviceImage);

        add(describe);
        add(statuspanel);

        playerNovice.printStatus();
    }

    private JPanel  createStatusPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,1,1));
        setSize(30,30);

        //Declare
        JLabel healthLabel = new JLabel("Health : ",SwingConstants.RIGHT);
        JLabel expLabel = new JLabel("Experiance : ",SwingConstants.RIGHT);
        JLabel moneyLabel = new JLabel("Money : ",SwingConstants.RIGHT);
        JLabel healthInfo = new JLabel(String.valueOf(playerNovice.returnHealth()));
        JLabel expInfo = new JLabel(String.valueOf(playerNovice.returnExp()));
        JLabel moneyInfo = new JLabel(String.valueOf(playerBag.showMoney()));

        //Adding
        panel.add(healthLabel);
        panel.add(healthInfo);
        panel.add(expLabel);
        panel.add(expInfo);
        panel.add(moneyLabel);
        panel.add(moneyInfo);

        return  panel;
    }

}
