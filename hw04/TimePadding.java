//Brittany Le Jouan
//time padding java program
//9/23/14

import java.util.Scanner;
public class TimePadding { //announce class
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //declare scanner
        
        System.out.print("Enter the time in seconds: "); //prompt user for time
        int nSec = myScanner.nextInt();
        int nHours, //define hours minutes and seconds for time padding
            nMinutes,
            nSeconds;
        
        if (nSec >= 0){ //only print if integer is not negative
            nHours = (nSec/60/60); //hours
            nMinutes = ((nHours - (int)(nHours))*60);//dont understad why this equation is not working
            nSeconds = ((nMinutes - (int)(nMinutes))*60);
            System.out.println("The time is "+(int)(nHours)+"."+(nMinutes)+"."+(nSeconds)+".");
        }
        else {
            System.out.println("You did not enter a legitimate time.");
        }
    }
}    