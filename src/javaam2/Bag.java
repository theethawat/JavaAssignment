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
    
//    public boolean buyStandy(){
//        if(money < standy.getPrice()){
//            System.out.println("You don't have enough money");
//            return false;
//        }
//        money = money - standy.getPrice();
//        standy.buyMoreItem();
//        System.out.println("Congratulation you can buy it");
//        return true;
//    }
    
//     public boolean buyPodium(){
//        if(money < podium.getPrice()){
//            System.out.println("You don't have enough money");
//            return false;
//        }
//        money = money - podium.getPrice();
//        podium.buyMoreItem();
//        System.out.println("Congratulation you can buy it");
//        return true;
//    }
     
//       public boolean buyFriendWatch(){
//        if(money < friendWatch.getPrice()){
//            System.out.println("You don't have enough money");
//            return false;
//        }
//        money = money - friendWatch.getPrice();
//        friendWatch.buyMoreItem();
//        System.out.println("Congratulation you can buy it");
//        return true;
//    }
//       public void checkStatus(){
//           System.out.println("#########################");
//           System.out.println("The Status of Items in your bag");
//           System.out.println("Podium: " + this.podium.getAmount()  + " All Dameage: " + (this.podium.getDamage() * this.podium.getAmount() ));
//           System.out.println("Special item of Podium is level | Current level is Level : " + this.podium.returnLevel());
//           System.out.println("Standy: " + this.standy.getAmount()  + " All Dameage: " + (this.standy.getDamage() * this.standy.getAmount() ));
//           System.out.println("Special item of Standy is Standy style now is PM in " + this.standy.returnStyle());
//           System.out.println("FriendWatch: " + this.friendWatch.getAmount()  + " All Dameage: " + (this.friendWatch.getDamage() * this.friendWatch.getAmount() ));
//           System.out.println("Your Money is " + this.money +" Coins");
//           System.out.println("#########################");
//       }
//
//     public void storeList(){
//          System.out.println("The Store have items to buy: ");
//          System.out.println("Podium -  Price" + podium.getPrice() + "Damage" + podium.getDamage() );
//          System.out.println("Standy -  Price" + standy.getPrice() + "Damage" + standy.getDamage() );
//          System.out.println("FriendWatch -  Price" + friendWatch.getPrice() + "Damage" + friendWatch.getDamage() );
//          System.out.println("Tank #Coming Soon # -  Price" + tank.getPrice() + "Damage" + tank.getDamage() );
//          System.out.println("Submarine #Coming Sonn# -  Price" + submarine.getPrice() + "Damage" + submarine.getDamage() );
//     }

     public void letMoneyDown(){
        money = money -100;
     }

     public int addingRandomMoney(){
        int inMoney=random.nextInt(100);
        money = money + inMoney;
        return inMoney;
     }

}
