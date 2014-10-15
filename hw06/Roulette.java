//brittany le jouan
//10/14/14
//roulette game
//this program is a simulation of a real game of roulette
//the "person" chooses a number between 1 and 38
//when they match the right number, they win
//1000 times playing 100 times


public class Roulette { //open class
    public static void main(String[] args) { //main method
        
        //intitialize variables
        int number = (int)(Math.random()*39);
        int spin = 0;
        int spinTwo = 0;
        int nWinning = 0;
        int nLosing = 0;
        int nProfit = 0;
        int winnings = 0;
        //outer while loop to run process 1000 times
        while (spin < 1000){
            while (spinTwo < 100){ //inner while loop to run spins 100 times
            int realNumber = (int)(Math.random()*39);
                //if the real number and guessed number math, it is a win
                if (realNumber == number){
                nWinning = nWinning + 1;
                }
                spinTwo++;
            }
            //profit if you win 3 or more times
            if (nWinning >= 3){
                nProfit = nProfit + 1;
                }
            //if you do not win any, you lose    
            else if (nWinning == 0){
                nLosing = nLosing + 1;
                } 
            //calculations for winnings, number of wins, number of losses   
            winnings = (nWinning * 36) + winnings;
            nWinning = 0;
            spinTwo = 0;
            spin++;
            
        }
        //statements
        System.out.println("You did not win " +nLosing+ " times.");
        System.out.println("You profited " +nProfit+ " times.");
        System.out.println("You made $" +winnings+".");
        System.out.println("You made a profit of $"+ (100000 - winnings)+".");
        
    } //close main method
} //close class