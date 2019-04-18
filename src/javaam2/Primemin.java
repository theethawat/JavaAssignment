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
public class Primemin extends Occupation {
    private int premierCouncil;
    private int reporter;
    
    public Primemin(String inPrefix, int inIncome, int inSpecialDamage) {
        super(inPrefix, inIncome, inSpecialDamage);
        premierCouncil = 250;
        reporter = 20;
    }
    
    public void Backmell(int premierBackMail){
        premierCouncil = premierCouncil - premierBackMail;
    }
    
    public void reporterBackmell(){
        reporter = reporter - 5;
        System.out.println("Hey Your Reporter get out from they");
    }
    
    public void increaseReporter(){
        reporter = reporter + 5;
        System.out.println("Hey they got more reporters");
    }
    
    public int returnPremierNo(){
        return premierCouncil;
    }
}
