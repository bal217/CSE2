//brittany le jouan
//10/14/14
//root program
//find square root of a number by bisection method


import java.util.Scanner; //declare scanner
public class Root { //open class
    public static void main(String[] args) { //main method
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter a double greater than 0: "); //prompt user for number
        double number = myScanner.nextDouble();
            //if the number is not a double greater than 0
            if (number <= 0){
                System.out.println("Please enter a double greater than 0."); 
            }
            else {
            //declare variables
            double min = 0;
            double max = number + 1;
            double difference = max - min;
            double median = (difference/2)+min;
            double medSq;
            //while loop to decrease max and min by increments
            while (difference > 0.0000001*(1 + number)){
                if (Math.pow(median,2)>2){ 
                    medSq = max;
                }
                else if (Math.pow(median,2)<2){
                    medSq = min;
                }
            difference ++; 
            median ++;
            
            }
        
            System.out.println("The square root of "+number+ " is "+median+"."); //statement
            
            }
    } //close method   
} //close class        