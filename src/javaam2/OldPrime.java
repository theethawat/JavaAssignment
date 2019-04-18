/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaam2;

import java.util.*;

/**
 *
 * @author theet
 */
public class OldPrime extends Occupation{
    private String overseaPlace;
    private int specialMoney;
    private Random rand = new Random();
    
    public OldPrime(String inPrefix, int inIncome, int inSpecialDamage, String place) {
        super(inPrefix, inIncome, inSpecialDamage);
        overseaPlace = place;
        specialMoney = 0;
    }
    
    public int addSpecialMoney(){
        int specialMoney = rand.nextInt(10000);
        return specialMoney;
    }
    
    
}
