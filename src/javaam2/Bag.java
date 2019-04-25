/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;

import java.util.Random;

/**
 * From Item
 * private int price;
   private int amount;
   private int damage;
 * @author theet
 */
public class Bag {
//    private Item friendWatch,tank,submarine ;
//    private Podium podium;
//    private Standy standy;
    private int money;
    private Random random = new Random();

    public Bag(){
        //Prototype public Item(int itemPrice,int itemAmount,int itemDamage)
        money = 1000;
//        podium = new Podium(100,2,200);
//        standy = new Standy(200,1,300);
//        friendWatch = new Item(300,0,500);
//        tank = new Item(500,0,800);
//        submarine = new Item(800,0,1000);
    }
    
     public void inputMoney(int amount){
        money = money + amount;
    }
    
    public int showMoney(){
        return money;
    }

     public void letMoneyDown(){
        money = money -100;
     }

     public int addingRandomMoney(){
        int inMoney=random.nextInt(100);
        money = money + inMoney;
        return inMoney;
     }

}
