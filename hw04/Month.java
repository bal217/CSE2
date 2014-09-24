//brittany Le Jouan
//month java program
//9/23/14

import java.util.Scanner;
public class Month { //open class
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //announce scanner
        
        System.out.print("Enter an int giving the number of the month (1-12): ");
        int nMonth = myScanner.nextInt();
        //all 31 day months
        if (nMonth == 1){ 
            System.out.println("The month has 31 days.");
        }
        else if (nMonth == 3){ 
            System.out.println("The month has 31 days.");
        }
        else if (nMonth == 5){
            System.out.println("The month has 31 days.");
        }
        else if (nMonth == 7){
            System.out.println("The month has 31 days.");
        }
        else if (nMonth == 8){
            System.out.println("The month has 31 days.");
        }
        else if (nMonth == 10){
            System.out.println("The month has 31 days.");
        }
        else if (nMonth == 12){
            System.out.println("The month has 31 days.");
        } 
        //all 30 day months
        else if (nMonth == 4){
            System.out.println("The month has 30 days.");
        }
        else if (nMonth == 6){
            System.out.println("The month has 30 days.");
        }
        else if (nMonth == 9){
            System.out.println("The month has 30 days.");
        }
        else if (nMonth == 11){
            System.out.println("The month has 30 days.");
        }
        else if (nMonth == 2){ //february leap year vs. non-leap year
                System.out.print("Enter an int giving the year: ");
                int nYear = myScanner.nextInt();
                boolean isLeapYear = (nYear % 4 == 0 && nYear % 100 !=0) || (nYear % 400 == 0);
                
                if (isLeapYear) {
                    System.out.println("The month has 29 days.");
                }
                else {
                    System.out.println("The month has 28 days.");   
                }    
                }
        else{
            System.out.println("You did not enter an int between 1 and 12.");
        }
    }
}