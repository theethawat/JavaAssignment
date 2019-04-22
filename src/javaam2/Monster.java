package javaam2;
import java.util.*;

public class Monster {

    //Field
    private String monsterName;
    private int level;
    private int health;
    private String monsterImage;
    private Random rand = new Random();

    //Constructor
    public Monster(String name,String image){
            monsterName = name;
            level = 4;
            health  = rand.nextInt(300);
            monsterImage = image;
    }

    //Methods
    public int killDamage(){
        int randomDamage = rand.nextInt(100);
        int killingDam;
        killingDam = level * randomDamage;
        return  killingDam;
    }

    public void killed(){
        health = health - 100;
    }

    public boolean checkStatus(){
        if(health <= 0)
            return false;
        else
            return true;
    }

    public int returnHealth(){
        return  health;
    }

    public String returnName(){
        return  monsterName;
    }

    public String returnImage(){
        return  monsterImage;
    }

    public int returnLevel(){
        return level;
    }

    public void levelDown(){
        level = level -1 ;
    }
}

