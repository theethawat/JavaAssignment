/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author theet
 */
public class MainUI extends JFrame{
    public MainUI(Novice player,Bag bag,Monster monster1,Monster monster2,Monster monster3){

        super("Ragnarok Babokotak Version 1.0.0");
        Container allContainer = getContentPane();
        allContainer.setLayout(new BorderLayout(10,10));
        MainPanel indexMainPanel = new MainPanel(player, bag);

        //Monster Creating
        Monster[] monster = new Monster[3];
        monster[0] = monster1;
        monster[1] = monster2;
        monster[2] = monster3;


        //Inserting into right and main
        //Top
        JLabel topLabelTest = new JLabel(new ImageIcon(getClass().getResource("banner.gif")));
        allContainer.add(topLabelTest,BorderLayout.NORTH);
        
        //Right
        allContainer.add(new RightCorner(monster),BorderLayout.EAST);

        //Left
        allContainer.add(new LeftCorner(bag),BorderLayout.WEST);
        
        //Main

        allContainer.add(indexMainPanel,BorderLayout.CENTER);
        
        
        allContainer.setBackground(Color.WHITE);
        //Initial UI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }





}
