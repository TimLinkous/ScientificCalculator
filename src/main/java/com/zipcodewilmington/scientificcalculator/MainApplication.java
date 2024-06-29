package com.zipcodewilmington.scientificcalculator;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    //    public static double sin(double a) { //sin method
//        double inRad = Math.sin(a); //calculate sin automatically in radian
//        double inDeg = Math.toRadians(a); // convert degree input into radian
//        Scanner radDeg = new Scanner(System.in);
//        System.out.println("Radians: R \nDegrees: D"); //Ask user if the want display in Radians or degrees
//        String entry = radDeg.nextLine();
//        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
//            System.out.println(inRad);
//        } else if (entry.equalsIgnoreCase("D")) {
//            System.out.println(Math.sin(inDeg)); //convert radians back to degrees
//        } else {
//            System.out.println("ERR");
//        }//print
//        return inRad;
//    }
//
    public static void main(String[] args) {
//        sin(5);

//        public static double cos(double a) { //cos method
//            double inRad = Math.cos(a);
//            double inDeg = Math.toRadians(a);//calculate cos automatically in radian
//            Scanner radDeg = new Scanner(System.in);
//            System.out.println("Radians: R \nDegrees: D"); //Ask user if the want display in Radians or degrees
//            String entry = radDeg.nextLine();
//            if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
//                System.out.println(inRad);
//            } else if (entry.equalsIgnoreCase("D")) {
//                System.out.println(Math.cos(inDeg)); //convert radians to degrees
//            } else {
//                System.out.println("ERR");
//            }//print
//            return inRad;
//        }
//
//        public static void main(String[] args) {
//            cos(5);
//
//    public static double tan(double a) { //tan method
//        double inRad = Math.tan(a);
//        double inDeg = Math.toRadians(a);//calculate tan automatically in radian
//        Scanner radDeg = new Scanner(System.in);
//        System.out.println("Radians: R \nDegrees: D"); //Ask user if the want display in Radians or degrees
//        String entry = radDeg.nextLine();
//        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
//            System.out.println(inRad);
//        } else if (entry.equalsIgnoreCase("D")) {
//            System.out.println(Math.tan(inDeg)); //convert radians to degrees
//        } else {
//            System.out.println("ERR");
//        }//print
//        return inRad;
//
    }

    public static int factorial(int n) {

        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(sum);
        return sum;
    }
}

//    public static double switchDisplayMode(double a);{
//        System.out.println("Please choose your Display Mode:\n 1. Decimal\n2. Binary\n3.Octal\n4. Hex");
//        Scanner displayMode = new Scanner(System.in);
//        String input = displayMode.nextLine();
//        int toInt = input.
//        int mode;
//        switch (mode) {
//            case 1: display;
//            break;
//            case 2:
//
//        }



