//brittany le jouan
//9/30/2014
//boolean java program
//

import java.util.Scanner; //declare scanner
public class BoolaBoola { //open class
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //scanner
        
        
        boolean a = myRandom.nextBoolean();
        boolean b = myRandom.nextBoolean();
        
        
       
        boolean one = false; two = false; three = false;
        int firstOutcome = (int)Math.random*2;
        int secondOutcome = (int)Math.random*2;
        int thirdOutcome = (int)Math.random*2;
        
        int operatorOne = (int)Math.random*2;
        int operatorTwo = (int)Math.random*2;
        
        if(firstOutcome < 1){
            one = true;
        }
        if(secondOutcome < 1){
            two = true;
        }
        if(thirdOutcome < 1){
            three = true; 
        }
            
        
        String exp1 = "";
            if (a == 1){
                
                exp1 = "&&";
            }
            
            else {
                
                exp1 = "||";
            }
        System.out.print(
            "Does " + string1 + " "+ exp1 + " "+ string2 +" "+ exp1 + " "+ string3+ " have the value true(t/T) or false (f/F)?");
        String statement = myScanner.next();
        boolean input = false;
        switch(statement){
            case "T": case "t":
                input = true; break;
            case "F": case "f":
                input = false; break;
        }
        
        boolean answer = false;
        if ((statement.equals("F"))||(statement.equals("f"))||(statement.equals("T"))||(statement.equals("t"))){
            if (operatorOne.equals("||") && operatorTwo.equals("||")){
                if(one || two || three)
                answer = true;
                else 
                answer = false;
            }
            else if (operatorOne.equals("||") && operatorTwo.equals("&&")){
                if(one || two || three)
                answer = true;
                else 
                answer = false;
            }   
            else if (operatorOne.equals("&&") && operatorTwo.equals("||")){
                if(one || two || three)
                answer = true;
                else 
                answer = false;
            }   
            else if (operatorOne.equals("&&") && operatorTwo.equals("&&")){
                if(one || two || three)
                answer = true;
                else 
                answer = false;
            }
            if (answer && input)
                System.out.println("Correct!");
            else if (!answer && input)
                System.out.println("Incorrect; try again!");
            else if (answer && !input)
                System.out.println("Incorrect; try again!");
            else if (!answer && !input)
                System.out.println("Correct!");
        
        }
        else
            System.out.println("Wrong; try again");
        //"String1RealAnswer".equalsIgnoreCase(useranswer)
        
    }
}