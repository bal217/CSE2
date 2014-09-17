//Brittany Le Jouan
//9/16/14
//Bicyle Java Program

import java.util.Scanner;
public class Bicycle { //open a class
    public static void main(String[] args) { //main method
    
    Scanner myScanner;
    myScanner = new Scanner( System.in ); //call scanner constructor
    System.out.print("Enter the number of seconds (an integer > 0): ");
    int nSeconds = myScanner.nextInt(); //accept user input
    //prompt user for number of counts
    System.out.print("Enter the number of counts (an integer > 0:): ");
    int nCounts = myScanner.nextInt();
    
    //variables
    double wheelDiameter=27.0,
    PI=3.14159,
    feetPerMile=5280,
    inchesPerFoot=12, //number of inches in a foot
    secondsPerMinute=60; //number of seconds in a minute
    double totalDistance;
    
    totalDistance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile);
    nHour=(((nSeconds/secondsPerMinute)/60));
    
    System.out.println("The distance was "+totalDistance+" miles and took "+nHour+"." );
    System.out.println("The average mph "+(int)(totalDistance/nHour)+ " (rounded).");
    
        }
    }
    
    