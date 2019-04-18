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
//For Collecting Items
public class Item {
    private int price;
    private int amount;
    private int damage;
    
    public Item(int itemPrice,int itemAmount,int itemDamage){
        price = itemPrice;
        amount = itemAmount;
        damage = itemDamage;
    }
    
    public void buyMoreItem(){
        amount = amount +1 ;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public int getDamage(){
        return damage;
    }
    
  
    
}
