/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Using Javax.swing Java.awt and Java.awt.event
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CartoonViewer extends JFrame {
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
        //Using Annonymous Class
        profileItem = new JMenuItem("View Profile");
        profileItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 System.out.println("Your Profile isn't Avaliable coming soon");
            }
        });
        optionMenu.add(profileItem);

        JMenuItem settingProfile = new JMenuItem("Setting Profile");
        optionMenu.add(settingProfile);

        quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        optionMenu.add(quitItem);
    }
    

   
    public static void main(String[] aStrings) {
        new CartoonViewer();
    }
}
