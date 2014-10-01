//Brittany Le Jouan
//Random Games java program
//9/23/14

import java.util.Scanner;
public class RandomGames {
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card:");
        String aString = myScanner.next();
        char aChar = aString.charAt(0);
        
        
        int output,
            min,
            max;
            
        if (aChar == 'R'){
            min= 0;
            max = 36;
            output = min + (int)(Math.random()*((max - min) + 1));
            System.out.println("Roulette: "+output+".");
        }
        if (aChar == 'r'){
            min= 0;
            max = 36;
            output = min + (int)(Math.random()*((max - min) + 1));
            System.out.println("Roulette: "+output+".");
        }
        if (aChar == 'C'){
            min = 1;
            max = 6;
            output = min + (int)(Math.random()*((max - min) + 1));
            System.out.println("Craps: " +output+output+".");
        }
        if (aChar == 'c'){
            min = 1;
            max = 6;
            output = min + (int)(Math.random()*((max - min) + 1));
            System.out.println("Craps: " +output+output+".");
        }
    }
}