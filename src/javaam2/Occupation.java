/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;

import java.util.*;

/**
 *Using Inheritance Hierarchies
 * @author theet
 */
public class Occupation {
    private int level;
    private String prefix;
    private int income;
    private int specialDamage;
    private Random rand = new Random();
    
    public Occupation(String inPrefix,int inIncome,int inSpecialDamage){
        prefix = inPrefix;
        income = inIncome;
        level  = 1;
        specialDamage = inSpecialDamage;
    }
    
    public void levelUp(){
        level = level + 1;
         System.out.println("Your level is up");
    }
    
    public void incomeUp(){
        int comingup = rand.nextInt(100);
        System.out.println("You got Income/Salary up  " + comingup +" coins");
        income = income + comingup;
    }
    
    public String returnPrefix(){
        return prefix;
    }

    public int returnLevel(){
        return level;
    }

}
