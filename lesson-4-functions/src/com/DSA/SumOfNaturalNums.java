package com.DSA;

import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        System.out.println("The sum is: " +  sum(in.nextInt()));
    }

    static int sum(int n){
        return n * (n +1)/2;
    }
}
