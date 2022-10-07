package com.DSA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operand: ");
        String operand = scanner.next();
        if(operand.equals("+")){
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 +num2));
        }else if(operand.equals("-")){
            System.out.println("The difference between " + num1 + " and " + num2 + " is " + (num1 - num2) );
        }else if(operand.equals("*")){
            System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2) );
        }else if(operand.equals("/")){
            System.out.println("The remainder of " + num1 + " and " + num2 + " is " + (num1 / num2) );
        }else if(operand.equals("%")) {
            System.out.println("The quotient of " + num1 + " and " + num2 + " is " + (num1 % num2));
        }else {
            System.out.println("Invalid operand");
        }
    }
}
