package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;
import java.util.Scanner;

public class ScientificFeatures {

    double a = 5;

    public static double sin(double a){ //sin method
        double sin = Math.sin(a); //calculate sin
        double sinRadian = Math.toRadians(sin); //convert to radian
        System.out.println(Math.sin(sinRadian)); //print
        return sinRadian;
    }
}



