package com.DSA;

import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int radius = in.nextInt();
        System.out.println("Area: " + areaOfCircle(radius) + " units \nCircumference: " + circumferenceOfCircle(radius) + " units");
    }

    static double areaOfCircle(int r){
        return Math.PI * Math.pow(r, 2);
    }

    static double circumferenceOfCircle(int r){
        return 2 * Math.PI *r;
    }
}
