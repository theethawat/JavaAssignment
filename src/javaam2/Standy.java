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
public class Standy extends Item{
    
    private String standyStyle;
    
    public Standy(int itemPrice, int itemAmount, int itemDamage) {
        super(itemPrice, itemAmount, itemDamage);
        standyStyle = "Suite";
    }
    
    public void upgradeStyle(){
        standyStyle = "Biker";
    }
    
    public String returnStyle(){
        return standyStyle;
    }
    
}
