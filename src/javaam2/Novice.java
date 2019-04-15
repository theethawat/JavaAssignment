package javaam2;
/**
 * Novice
 */
public class Novice {
    private int hp;
    private String noviceName;
    private int health;
    
    public Novice(String nameOfNovice){
        hp = 0;
        noviceName = nameOfNovice;
        health = 100;
    }

    public int getHp() {
        return hp;
    }
}