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

    public MainUI(Novice player){

        super("Ragnarok Babokotak Version 1.0.0");
        playerNovice = player;
        Container allContainer = getContentPane();
        allContainer.setLayout(new BorderLayout(10,10));
        MainPanel indexMainPanel = new MainPanel(player);
        
        //Inserting into right and main
        //Top
        JLabel topLabelTest = new JLabel(new ImageIcon(getClass().getResource("banner.gif")));
        allContainer.add(topLabelTest,BorderLayout.NORTH);
        
        //Right
        JLabel rightLabelTest = new JLabel("Hello I'm Right");
        allContainer.add(rightLabelTest,BorderLayout.EAST);
        
        
        //Main

        allContainer.add(indexMainPanel,BorderLayout.CENTER);
        
        
        
        //Initial UI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }



}
