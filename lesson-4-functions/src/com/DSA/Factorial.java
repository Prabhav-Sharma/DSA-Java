package com.DSA;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number: ");
        System.out.println("Factorial is " + getFactorial(in.nextInt()));

    }

    static int getFactorial(int num){
        int factorial=1;
        if(num==0) return factorial;

        for(int i=num; i>=1;i--){
            factorial *=i;
        }
        return factorial;
    }
}
