package com.DSA;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Please enter your name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", how are you?");
    }
}
