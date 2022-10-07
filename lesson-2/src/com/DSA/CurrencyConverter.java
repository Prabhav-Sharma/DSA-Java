package com.DSA;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        double amountInINR = scanner.nextDouble();
        System.out.println("Amount in USD: $" + amountInINR/80);
    }

}
