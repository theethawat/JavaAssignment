/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;

/**
 *
 * @author theethawat
 */
public class Podium extends Item {
    
    private int level;
    
    //let damage be 200
    public Podium(int itemPrice, int itemAmount, int itemDamage) {
        super(itemPrice, itemAmount, itemDamage);
        level = 0;
    }
    
    public void upLevel(){
        System.out.println("Your Podium is up Level by Uncle Too");
        level = level +1;
    }
    
    public int returnLevel(){
        return level;
    }
}
