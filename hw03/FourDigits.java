//Brittany Le Jouan
//9/16/14
//Four Digits Java Program

import java.util.Scanner;
public class FourDigits { //open a class
    public static void main(String[] args) { //main method
    
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    
    System.out.print("Enter a decimal (x.xxxx) and display four digits to the right of decimal: ");
    double decimal = myScanner.nextDouble();
    double fourDec, fourDigits;
    fourDec = decimal - (int)(decimal);
    fourDigits = fourDec * 1000;
    
    System.out.print("The four digits are:" +(int)(fourDigits));
    
    }
}
    
    
    