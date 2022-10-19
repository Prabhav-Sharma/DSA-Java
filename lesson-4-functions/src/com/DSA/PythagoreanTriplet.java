package com.DSA;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three number ");
        System.out.println("They " + (isPythagoreanTriplet(in.nextInt(), in.nextInt(), in.nextInt())?"":"don't ") + "form a Pythagorean triplet");

    }

    static boolean isPythagoreanTriplet(int a, int b, int c){
        int aSquared = a *a;
        int bSquared = b* b;
        int cSquared =c *c;
        return aSquared + bSquared == cSquared || bSquared + cSquared == aSquared || cSquared + aSquared == bSquared;
    }
}
