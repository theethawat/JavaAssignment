/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.*;

public class CartoonViewer extends JFrame{
    public CartoonViewer(){
        super("Image Viewer Windows");
        Container contentArea = getContentPane();
        JLabel mainlable = new JLabel("Hello");
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
        JMenuItem profileItem = new JMenuItem("View Profile");
        optionMenu.add(profileItem);

        JMenuItem settingProfile = new JMenuItem("Setting Profile");
        optionMenu.add(settingProfile);

        JMenuItem quitItem = new JMenuItem("Quit");
        optionMenu.add(quitItem);
    }
    public static void main(String[] aStrings) {
        new CartoonViewer();
    }
}
