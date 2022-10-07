package com.DSA;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        if(isArmstrongNum(num1) && isArmstrongNum(num2)){
            System.out.println("Both " + num1 + " and " + num2 + " are Armstrong numbers");
        }else if(isArmstrongNum(num1) && !isArmstrongNum(num2)){
            System.out.println("Only " + num1 + " is an Armstrong number");
        } else if(!isArmstrongNum(num1) && isArmstrongNum(num2)){
            System.out.println("Only " + num2 + " is an Armstrong number");
        }else {
            System.out.println("None of the two numbers are Armstrong numbers");
        }
    }

    public static boolean isArmstrongNum(int num){
        int remainder = num;
        int sumOfCubes=0;
        while(remainder > 0){
            int lastDigit = remainder % 10;
            remainder = remainder / 10;
            sumOfCubes += Math.pow(lastDigit,3);
        }
        return sumOfCubes == num;
    }

}
