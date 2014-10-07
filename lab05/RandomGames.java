//Brittany Le Jouan
//Random Games java program
//9/23/14

import java.util.Scanner; //declare scanner
public class RandomGames { //open class
    public static void main(String[] args) { //main method
        
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //accept user input
        //prompt user to pick a game
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card:");
        String aString = myScanner.next();
        char aChar = aString.charAt(0); //accept character as user
        
        //int variables
        int output,
            min,
            max,
            minTwo,
            maxTwo,
            outputTwo;
        switch(aChar){ //switch statement for picking a game
            case 'R': case 'r':
            //random number between 0 and 36
            min= 0;
            max = 36;
            output = min + (int)(Math.random()*((max - min) + 1));
            System.out.println("Roulette: "+output+".");
            break;
        
        
            case 'C': case 'c':
            //two separate random numbers between 1 and 6 from rolling 2 dice
            min = 1;
            max = 6;
            output = min + (int)(Math.random()*((max - min) + 1));
            minTwo = 1;
            maxTwo = 6;
            outputTwo = min + (int)(Math.random()*((maxTwo - minTwo) + 1));
            System.out.println("Craps: " +output+" "+outputTwo+".");
            break;
        
            case 'P': case 'p':
            //picking a random card out of a full deck of 52 cards
            min = 1;
            max = 52;
            output = min + (int)(Math.random()*((max - min) + 1)); 
                //each random output number equals a possible card
                if(output == 1){
                    System.out.println("Ace of spades.");
                }
                else if(output == 2){
                    System.out.println("Ace of clubs.");
                }
                else if(output == 3){
                    System.out.println("Ace of hearts.");
                }
                else if(output == 4){
                    System.out.println("Ace of diamonds.");
                }
                else if(output == 5){
                    System.out.println("2 of spades.");
                }
                else if(output == 6){
                    System.out.println("2 of clubs.");
                }
                else if(output == 7){
                    System.out.println("2 of hearts.");
                }
                else if(output == 8){
                    System.out.println("2 of diamonds.");
                }
                else if(output == 9){
                    System.out.println("3 of spades.");
                }
                else if(output == 10){
                    System.out.println("3 of clubs.");
                }
                else if(output == 11){
                    System.out.println("3 of hearts.");
                }
                else if(output == 12){
                    System.out.println("3 of diamonds.");
                }
                else if(output == 13){
                    System.out.println("4 of spades.");
                }
                else if(output == 14){
                    System.out.println("4 of clubs.");
                }
                else if(output == 15){
                    System.out.println("4 of hearts.");
                }
                else if(output == 16){
                    System.out.println("3 of diamonds.");
                }
                else if(output == 17){
                    System.out.println("5 of spades.");
                }
                else if(output == 18){
                    System.out.println("5 of clubs.");
                }
                else if(output == 19){
                    System.out.println("5 of hearts.");
                }
                else if(output == 20){
                    System.out.println("5 of diamonds.");
                }
                else if(output == 21){
                    System.out.println("6 of spades.");
                }
                else if(output == 22){
                    System.out.println("6 of clubs.");
                }
                else if(output == 23){
                    System.out.println("6 of hearts.");
                }
                else if(output == 24){
                    System.out.println("6 of diamonds.");
                }
                else if(output == 25){
                    System.out.println("7 of spades.");
                }
                else if(output == 26){
                    System.out.println("7 of clubs.");
                }
                else if(output == 27){
                    System.out.println("7 of hearts.");
                }
                else if(output == 28){
                    System.out.println("7 of diamonds.");
                }
                else if(output == 29){
                    System.out.println("8 of spades.");
                }
                else if(output == 30){
                    System.out.println("8 of clubs.");
                }
                else if(output == 31){
                    System.out.println("8 of hearts.");
                }
                else if(output == 32){
                    System.out.println("8 of diamonds.");
                }
                else if(output == 33){
                    System.out.println("9 of spades.");
                }
                else if(output == 34){
                    System.out.println("9 of clubs.");
                }
                else if(output == 35){
                    System.out.println("9 of hearts.");
                }
                else if(output == 36){
                    System.out.println("9 of diamonds.");
                }
                else if(output == 37){
                    System.out.println("10 of spades.");
                }
                else if(output == 38){
                    System.out.println("10 of clubs.");
                }
                else if(output == 39){
                    System.out.println("10 of hearts.");
                }
                else if(output == 40){
                    System.out.println("10 of diamonds.");
                }
                else if(output == 41){
                    System.out.println("King of spades.");
                }
                else if(output == 42){
                    System.out.println("King of clubs.");
                }
                else if(output == 43){
                    System.out.println("King of hearts.");
                }
                else if(output == 44){
                    System.out.println("King of diamonds.");
                }
                else if(output == 45){
                    System.out.println("Queen of spades.");
                }
                else if(output == 46){
                    System.out.println("Queen of clubs.");
                }
                else if(output == 47){
                    System.out.println("Queen of hearts.");
                }
                else if(output == 48){
                    System.out.println("Queen of diamonds.");
                }
                else if(output == 49){
                    System.out.println("Jack of spades.");
                }
                else if(output == 50){
                    System.out.println("Jack of clubs.");
                }
                else if(output == 51){
                    System.out.println("Jack of hearts.");
                }
                else if(output == 52){
                    System.out.println("Jack of diamonds.");
                }
            break;
        default: //if the user does not enter either of the 3 letters
            System.out.println("You did not enter R,r,C,c,P, or p.");
        } //close switch statement
        
        
    } //close method
} //close class