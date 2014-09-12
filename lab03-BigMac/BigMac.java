//Brittany Le Jouan
//9/11/14
//Big Mac Java Program

import java.util.Scanner;
public class BigMac { //open a class
    public static void main(String[] args) { //main method
    
    Scanner myScanner;
    myScanner = new Scanner( System.in ); //call scanner constructor
    System.out.print(
        "Enter the number of Big Macs (an integer > 0): "); //prompt user for # tickets
    int nBigMacs = myScanner.nextInt(); //accept user input
    //prompt user for cost of big mac and % sales tax and accept input
    System.out.print("Enter the cost per Big Mac as" +
        " a double (in the form xx.xx): " );
    double bigMac$ = myScanner.nextDouble();
    System.out.print(
        "Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //user enters percent 
    //print out output in pleasing format
    double cost$;
    int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits
            //to right of decimal point
            //for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        // wher ethe % (mod) operator returns the remainder
        // after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" +" sales tax of "+ (int)(taxRate*100) + " %, is $"+dollars+'.'+dimes+pennies);
        
    } //end main method
} //end class