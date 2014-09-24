//Brittany Le Jouan
//Income tax java program
//9/23/14

import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter an int giving the number of thousands: ");
        int nIncome = myScanner.nextInt();
        double taxRate;    
        if (nIncome < 20){
            taxRate = .05;
            System.out.println("The tax rate on $"+nIncome+",000 is " + (taxRate*100) +"%, and the tax is $"+(int)(nIncome*taxRate*1000)+".");
        }
        else if (nIncome >=20 && nIncome<40){
            taxRate = .07;
            System.out.println("The tax rate on $"+nIncome+",000 is " + (taxRate*100) +"%, and the tax is $"+(int)(nIncome*taxRate*1000)+".");
        }
        else if (nIncome >=40 && nIncome<78){
            taxRate = .12;
            System.out.println("The tax rate on $"+nIncome+",000 is " + (taxRate*100) +"%, and the tax is $"+(int)(nIncome*taxRate*1000)+".");
        }
        else if (nIncome >=78){
            taxRate = .14;
            System.out.println("The tax rate on $"+nIncome+",000 is " + (taxRate*100) +"%, and the tax is $"+(int)(nIncome*taxRate*1000)+".");
        }
        else if (nIncome <=0){
            System.out.println("You did not enter a positive int.");
        }
        else{ 
            System.out.println("You did not enter an int.");
        }
        
    }
}