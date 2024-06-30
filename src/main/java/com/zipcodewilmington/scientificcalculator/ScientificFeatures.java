package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;
import java.util.Scanner;

public class ScientificFeatures {

//        public static double sin(double a) { //sin method
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
//public static double tan(double a) { //tan method
//    double inRad = Math.tan(a);
//    double inDeg = Math.toRadians(a);//calculate tan automatically in radian
//    Scanner radDeg = new Scanner(System.in);
//    System.out.println("Radians: R \nDegrees: D"); //Ask user if the want display in Radians or degrees
//    String entry = radDeg.nextLine();
//    if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
//        System.out.println(inRad);
//    } else if (entry.equalsIgnoreCase("D")) {
//        System.out.println(Math.tan(inDeg)); //convert radians to degrees
//    } else {
//        System.out.println("ERR");
//    }//print
//    return inRad;

    public static double arcsin(double a) { //sin method
        double inRad = Math.asin(a); //calculate sin automatically in radian
        double inDeg = Math.toRadians(a); // convert degree input into radian
        Scanner radDeg = new Scanner(System.in);
        System.out.println("Display in Radians: R \nDDisplay in Degrees: D"); //Ask user if the want display in Radians or degrees
        String entry = radDeg.nextLine();
        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
            if (a >= -1 && a <= 1) {
                System.out.println(inRad);
            } else {
                System.out.println("ERROR: NaN");
            }
        } else if (entry.equalsIgnoreCase("D")) {
            System.out.println(Math.asin(inDeg)); //convert radians back to degrees
        } else {
            System.out.println("ERR");
        }//print
        return inRad;
    }

    public static double arccos(double a) { //sin method
        double inRad = Math.acos(a); //calculate sin automatically in radian
        double inDeg = Math.toRadians(a); // convert degree input into radian
        Scanner radDeg = new Scanner(System.in);
        System.out.println("Display in Radians: R \nDDisplay in Degrees: D"); //Ask user if the want display in Radians or degrees
        String entry = radDeg.nextLine();
        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
            if (a >= -1 && a <= 1) {  // arccos is between -1 and 1. outside of that range is NaN
                System.out.println(inRad);
            } else {
                System.out.println("ERROR: NaN");
            }
        } else if (entry.equalsIgnoreCase("D")) {
            System.out.println(Math.acos(inDeg)); //convert radians back to degrees
        } else {
            System.out.println("ERR");
        }//print
        return inRad;
    }


    public static double arctan(double a) { //sin method
        double inRad = Math.atan(a); //calculate sin automatically in radian
        double inDeg = Math.toRadians(a); // convert degree input into radian
        Scanner radDeg = new Scanner(System.in);
        System.out.println("Display in Radians: R \nDisplay in Degrees: D"); //Ask user if
        String entry = radDeg.nextLine();
        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
            System.out.println(inRad);
        } else if (entry.equalsIgnoreCase("D")) {
            System.out.println(Math.atan(inDeg)); //convert radians back to degrees
        } else {
            System.out.println("ERR");
        }//print
        return inRad;
    }

    public static void convertToInt(double a) {
        int intValue = (int) Math.round(a);
        String binary = Integer.toBinaryString(intValue);
        String octal = Integer.toOctalString(intValue);
        String hex = Integer.toHexString(intValue);

        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hex);
    }

//
//    Scanner smile = new Scanner(System.in);
//    String emoji = smile.nextLine();
//        if(emoji.equals(":)")||emoji.equals("(:")){
//        System.out.println("\uD83D\uDE42");
//    }
//        else if(emoji.equals(":(")||emoji.equals("):")){
//        System.out.println("\u2639");
//    }
//        else if(emoji.equals(";)")||emoji.equals("(;")){
//        System.out.println("\uD83D\uDE09");
//    }
//        else if(emoji.equals("<3"))
//    {
//        System.out.println("\u2764\uFE0F");
//    }
//        else System.out.println("");
//        System.out.println("");
//

    //
    public static int factorial(int n) {

        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(sum);
        return sum;
    }
}






