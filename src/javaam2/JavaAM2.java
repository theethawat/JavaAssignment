package javaam2;

import java.util.*;

/**
 * javaam2
 */
public class javaam2 {

    public static void main(String[] args) {
        new MainUI();

        // TODO code application logic here
        String nameInput, cityInput;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello Welcome to My Game >--< ;) Ragnarok to jail");
        System.out.println("Printing out your name");
        nameInput = scan.nextLine();
        System.out.println("Where do you live (Type City like Dubai) :");
        cityInput = scan.nextLine();

        //Player
        Novice player = new Novice(nameInput);
        Bag playerBag = new Bag();
        System.out.println("Hello you are Dr. " + nameInput + "  that lived in " + cityInput );
        player.printStatus();
        playerBag.checkStatus();
        OldPrime playerOccupation = new OldPrime("Dr.",1000,25,cityInput);

        //Bot
        Novice bot = new Novice("Mickie");
        Primemin botOccupation = new Primemin("General.",400,100);
        System.out.println("Here is your enimies : " + botOccupation.returnPrefix() + bot.returnName() +" Hahahaa" );
        System.out.println("With " + botOccupation.returnPremierNo() + " Amounts of Premier Council");
        System.out.println("Do you want to go to the Battle [Y/N]");
        System.out.println("---------------Game Logic Coming Soon------------");


    }
}