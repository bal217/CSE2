//brittany le jouan
//9/30/2014
//burger king java program
//
//prompt user to ask for a certain number of big macs
//if the int is over 0, ask if they want fries
//if they want fries, add $2.15 to order
//if not, multiply big macs and cost (2.22) without adding fries to find total cost

import java.util.Scanner; //declare scanner
public class BigMacAgain { //open class
    public static void main(String[] args) { //main method
        
        Scanner myScanner; //declare scanner 
        myScanner = new Scanner( System.in ); //user input
        
        System.out.print("Enter the number of Big Macs: "); //promptuser for number of big macs
        int nBigMacs = myScanner.nextInt(); 
        double costBigMac = 2.22; //cost of big macs
        double costFries = 2.15; //cost of fries
        if (nBigMacs <= 0){ //make sure user input is over 0
            System.out.println("You did not enter an int > 0.");
        }
        else if (nBigMacs>0){
            System.out.println("You ordered" + nBigMacs + " Big Macs for a cost of " + nBigMacs+"x"+costBigMac+ " = " +(nBigMacs*costBigMac)+".");
            System.out.print("Do you want an order of fries (Y/y/N/n)? "); //ask for fries if user input if > 0 for big macs
                String aString = myScanner.next(); //declare character
                char aChar = aString.charAt(0);
                switch (aChar){ //switch statement to read user answer
                        case 'Y': case 'y':
                        System.out.println("You ordered fries at a cost of $2.15.");
                        System.out.println("The total cost of your meal is "+((nBigMacs*costBigMac)+costFries)+".");
                        break;
                        case 'N': case 'n':
                        System.out.println("The total cost of your meal is "+(nBigMacs*costBigMac)+".");
                        break;
                default:
                System.out.println("You did not enter y,Y,n, or N.");
                break;
                }
                
        
        } //close if else
    } //close main method
}  // close class