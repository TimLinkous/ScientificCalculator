package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static double sin(double a) { //sin method
        double inRad = Math.sin(a);
        double inDeg = Math.toRadians(a);//calculate sin automatically in radian
        Scanner radDeg = new Scanner(System.in);
        System.out.println("Radians: R \nDegrees: D"); //Ask user if the want display in Radians or degrees
        String entry = radDeg.nextLine();
        if (entry.equals("R") || entry.equals("r")) {  //conditional statement based on user response
            System.out.println(inRad);
        } else if (entry.equals("D") || entry.equals("d")) {
            System.out.println(Math.sin(inDeg)); //convert radians to degrees
        } else {
            System.out.println("ERR");
        }//print
        return inRad;
    }

    public static void main(String[] args) {
        sin(5);


    }
}
//double sinRad = Math.toRadians(sin); //convert to radian



