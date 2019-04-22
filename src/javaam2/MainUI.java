/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author theet
 */
public class MainUI extends JFrame{
    private Novice playerNovice;
    private Bag playerBag;
    private Monster monster[];
    private Font f1 = new Font(Font.SANS_SERIF,Font.BOLD,18);
    public MainUI(Novice player,Bag bag,Monster monster1,Monster monster2,Monster monster3){

        super("Ragnarok Babokotak Version 1.0.0");
        playerNovice = player;
        playerBag = bag;
        Container allContainer = getContentPane();
        allContainer.setLayout(new BorderLayout(10,10));
        MainPanel indexMainPanel = new MainPanel(player,playerBag);

        //Monster Creating
        monster = new Monster[3];
        monster[0] = monster1;
        monster[1] = monster2;
        monster[2] = monster3;


        //Inserting into right and main
        //Top
        JLabel topLabelTest = new JLabel(new ImageIcon(getClass().getResource("banner.gif")));
        allContainer.add(topLabelTest,BorderLayout.NORTH);
        
        //Right
        allContainer.add(createRightPanel(),BorderLayout.EAST);
        
        
        //Main

        allContainer.add(indexMainPanel,BorderLayout.CENTER);
        
        
        allContainer.setBackground(Color.WHITE);
        //Initial UI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650,650);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createRightPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);

        JLabel head = new JLabel("Monster");
        head.setFont(f1);
        //Images
        JLabel monster1Label = new JLabel(new ImageIcon(getClass().getResource(monster[0].returnImage())));
        monster1Label.setSize(2,2);

        JLabel monster2Label = new JLabel(new ImageIcon(getClass().getResource(monster[1].returnImage())));
        monster2Label.setSize(2,2);

        JLabel monster3Label = new JLabel(new ImageIcon(getClass().getResource(monster[2].returnImage())));
        monster3Label.setSize(5,5);

        //Information
        JLabel monster1Name = new JLabel("Name : "+monster[0].returnName());
        JLabel monster2Name = new JLabel("Name : "+monster[1].returnName());
        JLabel monster3Name = new JLabel("Name : "+monster[2].returnName());

        JLabel monster1Info = new JLabel("Health : " + monster[0].returnHealth()+" Damage:"+ monster[0].killDamage());
        JLabel monster2Info = new JLabel("Health : " + monster[1].returnHealth()+" Damage:"+ monster[1].killDamage());
        JLabel monster3Info = new JLabel("Health : " + monster[2].returnHealth()+" Damage:"+ monster[2].killDamage());

        //Adding
        panel.add(head);
        panel.add(monster1Label);
        panel.add(monster1Name);
        panel.add(monster1Info);

        panel.add(monster2Label);
        panel.add(monster2Name);
        panel.add(monster2Info);

        panel.add(monster3Label);
        panel.add(monster3Name);
        panel.add(monster3Info);

        return  panel;
    }



}
