package com.DSA;

import java.util.Scanner;

public class CalculateNPR {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long NPR = f.factorial(n) / f.factorial(n-r);
        System.out.println(NPR);
    }
}
