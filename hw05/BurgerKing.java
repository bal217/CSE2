//brittany le jouan
//9/30/2014
//burger king java program
//
//prompt user to ask for a certain item, and then specify how that customer wants that item
//use strings and various switch statements
//some nested switch statements 

import java.util.Scanner; //declare scanner
public class BurgerKing { //open class
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //scanner
        //prompt user for burger soda or fries
        System.out.print("Enter a letter to indicate a choice of burger (B or b), soda (S or s), or fries (F or f):");
         String aString = myScanner.next();
        char aChar = aString.charAt(0);
        //switch statements for choosing characters for choice of burger fries or soda
        switch (aChar){
            case 'B': case 'b': //burger
                System.out.print("Enter A or a for all the fixins C or c for cheese N or n for none of the above:"); //prompt user for make of burger
                    String aStringTwo = myScanner.next(); //second string
                    char aBurger = aStringTwo.charAt(0); //aBurger is new character that tells how customer wants burger
                    switch (aBurger){
                        case 'A': case 'a': //fixens
                            System.out.println("You have ordered a burger with all the fixens");
                        break;
                        case 'C': case 'c': //cheese
                            System.out.println("You have ordered a burger with cheese");
                        break;
                        case 'N': case 'n': //nothing
                            System.out.println("You have ordered a regular burger");
                        break;
                    default: 
                    System.out.println("You did not print A,a,C,c,N,or n"); //if user does not print one of 3 letters
                    break;
                    }
            break;
            case 'S': case 's': //soda
                System.out.print("Do you want Pepsi (p or P),Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)?");
                    String aStringThree = myScanner.next(); //third string
                    char aSoda = aStringThree.charAt(0); //aSoda is new character that tells what kind of soda user wants
                    switch (aSoda){
                        case 'p': case 'P': //pepsi
                            System.out.println("You have ordered a pepsi");
                        break;
                        case 'C': case 'c': //coke
                            System.out.println("You have ordered a coke");
                        break;
                        case 'S': case 's': //sprite
                            System.out.println("You have ordered a sprite");
                        break;
                        case 'M': case 'm': //mountain dew
                        System.out.println("You have ordered a mountain dew");
                        break;
                    default:
                        System.out.println("You did not enter P,p,C,c,S,s,M, or m"); //if user does not enter one of those 4 letter
                    break;
                    }
            break;
            case 'F': case 'f':
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)?");
                    String aStringFour = myScanner.next(); //fourth string
                    char aFries = aStringFour.charAt(0); //aFries is the new character that indicates the size of fries
                    switch (aFries){
                        case 'l': case 'L': //large
                            System.out.println("You have ordered large fries");
                        break;
                        case'S': case 's': //small
                        System.out.println("You have ordered small fries");
                        break;
                    default:
                        System.out.println("You did not enter L,l,S, or s"); // if user does not enter one of those 2 sizes
                    break;
                    }
            break;        
        default:
            System.out.println("You did not enter B,b,S,s,F,or f"); //if user enters a character that does not indicate burger,soda or fries
        break;
        } //close original switch
        
    } //close main string
} //close class
        