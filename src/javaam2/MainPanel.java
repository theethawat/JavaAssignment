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
    public MainPanel(){
        setBackground(Color.WHITE);
        invalidate();
        JLabel welcomeLabel1 = new JLabel("Hello Welcome to my Ragnarok to jail Program");
        add(welcomeLabel1);
    }
}
