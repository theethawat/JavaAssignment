/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Using Javax.swing Java.awt and Java.awt.event
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CartoonViewer extends JFrame implements ActionListener{
    //Don't Forget to declare class Field Variable the constructor field
    private JMenuItem profileItem,quitItem;
    private JLabel mainlable;
    public CartoonViewer(){
        super("Image Viewer Windows");
        Container contentArea = getContentPane();
        
        mainlable = new JLabel("Hello");
        contentArea.add(mainlable);

        //Call Menubar
        makeMenubar();

        //Set close behavior when JFrame as exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        
        //Very Important Assignment
        setVisible(true);
    }

    private void makeMenubar(){
        JMenuBar myMenubar = new JMenuBar();
        setJMenuBar(myMenubar);

        //Create Menu Items
        JMenu optionMenu = new JMenu("Options");
        myMenubar.add(optionMenu);

        //Menu Item Inside
        profileItem = new JMenuItem("View Profile");
        profileItem.addActionListener(this);
        optionMenu.add(profileItem);

        JMenuItem settingProfile = new JMenuItem("Setting Profile");
        optionMenu.add(settingProfile);

        quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(this);
        optionMenu.add(quitItem);
    }
    
    //actionPerformed is a method not a constructor
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        if(source == profileItem)
            System.out.println("Your Profile isn't Avaliable coming soon");
        else if(source == quitItem)
            System.exit(0);
        else
            System.out.println("Cannot Working");
    } 
    
    public static void main(String[] aStrings) {
        new CartoonViewer();
    }
}
