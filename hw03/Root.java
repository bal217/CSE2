//Brittany Le Jouan
//9/16/14
//Root Java Program

import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter number that you want to print cube root in the form of (xx.xx): ");
            double nForCubing = myScanner.nextDouble();
            
            double cubeRoot;
            cubeRoot= Math.pow(nForCubing, (1.0/3));
        System.out.println("The cubed root of "+ (nForCubing) +" is "+(int)(cubeRoot)+"."); 
    }
}