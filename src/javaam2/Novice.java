/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;

/**
 *
 * @author theet
 */
import java.util.*;

public class Novice {
    private String name;
    private int health;
    private int exp;
    private Random rand = new Random();
    
    public Novice(String noviceName){
        name = noviceName;
        health = 1000;
        exp = 0;
    }
    
    public void killed(int attract){
        health = health - attract;
    }
    
    public int killing(int attract){
        if(health < 100){
            System.out.println("You have not enough health to kill Go to buy health");
            return 0;
        }
        int reward = rand.nextInt(300);
        exp = exp + attract;
        System.out.println("Kill Success you got money: " + reward +" coins");
        return reward;
    }
    
    public void healing(){
        int healthReward = rand.nextInt(400);
        health = health + healthReward;
        System.out.println("Congratulation you got" + healthReward +" Health Value");
    }
    
    public int questionKilled(){
        health = health - 100;
        return health;
    }
    
    public void printStatus(){
        System.out.println("############");
        System.out.println("Hello  " + name + " Your status is");
        System.out.println("health: " + health + " exp:" + exp );
    }

    public int returnHealth(){
        return  health;
    }

    public int returnExp(){
        return  exp;
    }
   
   public String returnName(){
       return name;
   }
   public void increaseExp(){
        int inExp = rand.nextInt(300);
        exp = exp + inExp;
   }
}
