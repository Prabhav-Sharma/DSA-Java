package com.DSA;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println("The number is " + (isEven(num)?"Even":"Odd"));
    }

    static boolean isEven(int num){
        return num%2==0;
    }
}
