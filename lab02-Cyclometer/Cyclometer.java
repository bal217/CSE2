//Brittany Le Jouan
//Cyclometer Java Program

public class Cyclometer {
    
    //main method
    public static void main(String[] args) {
        //input data
        int secsTrip1=480; //time of trip 1 in seconds
        int secsTrip2=3220; //time of trip 2 in seconds
        int countsTrip1=1516; //number of counts for trip 1
        int countsTrip2=9037; //number of counts for trip 2
        
        //out intermediate variables and output data
        double wheelDiameter=27.0, //bike wheel diameter
        PI=3.14159, //value of pi
        feetPerMile=5280, //number of feet per mile
        inchesPerFoot=12, //number of inches in a foot
        secondsPerMinute=60; //number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //output data
        
        //print numbers stored in the variables that store number of seconds and counts
        System.out.println("Trip 1 took " + 
            (secsTrip1/secondsPerMinute)+"minutes and had "+ 
            countsTrip1+"counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had"+
            countsTrip2+"counts.");
            
        //compute values for the ditances
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distance in inches
        //each count, a rotation of the wheel travels the diameter in inches*pi
        distanceTrip1/=inchesPerFoot*feetPerMile; //distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //print output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
    
    } //end of main method
} //end of class