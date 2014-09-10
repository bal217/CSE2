//Brittany Le Jouan
//hw2 Artithmetic

public class Arithmetic {
    //main method
    public static void main(String[] args) {

//input data
int nSocks=3; 
int nGlasses=6;
int nEnvelopes=1;
//out intermediate variables and output data
double sockCost$=2.58,
    glassCost$=2.29,
    envelopeCost$=3.25,
    taxPercent=0.06;
double totalSockCost$,
    totalGlassCost$,
    totalEnvelopeCost$,
    totalPurchase,
    totalTax,
    totalTransaction;
//print out input data
System.out.println("There are " +nSocks + " pairs of socks being bought and they are " 
    +sockCost$+ " each.");
System.out.println("There are " +nGlasses + " glasses being bought and they are "
    +glassCost$ + " each.");
System.out.println("There is " +nEnvelopes + " box of envelopes being bought and they are "
    +envelopeCost$ + " each.");
//run calculation
totalSockCost$=(nSocks*sockCost$+nSocks*sockCost$*taxPercent);
totalGlassCost$=(nGlasses*glassCost$+nGlasses*glassCost$*taxPercent);
totalEnvelopeCost$=(nEnvelopes*envelopeCost$+nEnvelopes*envelopeCost$*taxPercent);
totalPurchase=(nSocks*sockCost$+nGlasses*glassCost$+nEnvelopes*envelopeCost$);
totalTax=totalPurchase*taxPercent;
totalTransaction=totalPurchase+totalTax;

System.out.println("The socks cost " +totalSockCost$ + " including tax.");
System.out.println("The glasses cost " +totalGlassCost$+ " including tax.");
System.out.println("The envelopes cost " +totalEnvelopeCost$+ " including tax.");
System.out.println("The total cost of the purchase was "+totalPurchase + " before tax.");
System.out.println("The sales tax was " +totalTax+ ".");
System.out.println("The total transaction was " +totalTransaction+ ".");
}
}