package com.DSA;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Math.sqrt(Math.pow(in.nextInt() - in.nextInt(), 2)  + Math.pow(in.nextInt() - in.nextInt(), 2) + Math.pow(in.nextInt() -in.nextInt(),2)));
    }
}
