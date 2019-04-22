package javaam2;

import java.util.*;

/**
 * javaam2
 */
public class javaam2 {


    public static void main(String[] args) {
        Novice player = new Novice("Doraemon");
        Bag playerBag = new Bag();
        Monster angrybird = new Monster("Angry Bird Red","angrybird.jpg");
        Monster angrybird_yellow = new Monster("Angry Bird Yellow","angrybirdyellow.jpg");
        Monster angrypig = new Monster("Angry Bird Pig","angrypig.jpg");
        new MainUI(player,playerBag,angrybird,angrybird_yellow,angrypig);

    }


}