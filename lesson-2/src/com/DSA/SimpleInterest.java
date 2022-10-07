package com.DSA;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loan amount. ");
        double amount =  scanner.nextDouble();
        System.out.print("Enter rate of interest. ");
        double interest =  scanner.nextDouble();
        System.out.print("Enter tenure of loan. ");
        int time = scanner.nextInt();
        System.out.println("The simple interest on your loan is " + amount * interest/100 * time);
    }
}
