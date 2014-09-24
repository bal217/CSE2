//Brittany Le Jouan
//Course number java program
//9/23/14

import java.util.Scanner;
public class CourseNumber { //open class
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //declare scanner
        
        System.out.print("Enter a six digit number giving the course semester: "); //prompt user for course number
        int courseNom = myScanner.nextInt(); 
        double nCourseNom = courseNom%100, //course number formula
            nCourseYear = (int)(courseNom/100); //course year formula
         if (courseNom > 186510 && courseNom < 201440 && nCourseYear >=1865 && nCourseNom =< 2014){
            if (nCourseNom == 10){ 
                System.out.println("The course was offered in "+(int)(courseNom/100)+" in the spring semester.");
            }
            else if (nCourseNom ==20){
                System.out.println("The course was offered in "+(int)(courseNom/100)+" in the summer 1 semester.");
            }
         
            else if (nCourseNom == 30){
                System.out.println("The course was offered in "+(int)(courseNom/100)+" in the summer 2 semester.");
            }
         
            else if (nCourseNom == 40){
                System.out.println("The course was offered in "+(int)(courseNom/100)+" in the fall semester.");
            }
         }
        else if (courseNom < 186510 && courseNom > 201440){
            System.out.println("The number was outside the range [186510,201440].");
        }
        else 
            System.out.println("That is not a legitimate semster.");
        }
    }
}