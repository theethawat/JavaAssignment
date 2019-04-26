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

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu helpMenu = new JMenu("Help");
        JMenu fileMenu = new JMenu("File");
        JMenuItem helpItem = new JMenuItem("How to Play");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem closeItem = new JMenuItem("close");

        helpItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(allContainer,"Kill the Monster that come from Angry Bird Until \n " +
                        "they are died, Upter You kill health of Monster will reduce 100 hp.\n" +
                        "You can Increment your money or your special \nItem but it not useful hahaha." +
                        "Enjoy the Game");
            }
        });
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(allContainer,"Theethawat Savastham \n " +
                        "3CoE Computer Engineering " +
                        "But debut and beginner in Software Developer\n" +
                        "Programing Techniques (Java) Assignment" +
                        "theethawat.s@outlook.co.th");
            }
        });
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        helpMenu.add(helpItem);
        helpMenu.add(aboutItem);
        fileMenu.add(closeItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

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
        allContainer.add(new RightCorner(monster,player,indexMainPanel),BorderLayout.EAST);

        //Left
        allContainer.add(new LeftCorner(bag,indexMainPanel),BorderLayout.WEST);
        
        //Main

        allContainer.add(indexMainPanel,BorderLayout.CENTER);

        JLabel copyrightPanel = new JLabel("Copyleft 2019 Theethawat Savastham All Right Reserved, For Education Working");
        //Bottom
        allContainer.add(copyrightPanel,BorderLayout.SOUTH);
        allContainer.setBackground(Color.WHITE);

        //Initial UI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850,700);
        setLocationRelativeTo(null);
        invalidate();
        setVisible(true);
    }





}
