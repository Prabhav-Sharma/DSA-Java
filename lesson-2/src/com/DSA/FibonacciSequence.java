package com.DSA;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to get Fibonacci Sequence till that number: ");
        int n = scanner.nextInt();
        double prev = 0;
        double current =1;
        System.out.print(prev+" ");
        for(int i =1; i<n; i++){
            System.out.print(current + " ");
            double temp = current;
            current = prev + current;
            prev=temp;
        }

    }
}
