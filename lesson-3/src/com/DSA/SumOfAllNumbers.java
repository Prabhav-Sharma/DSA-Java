package com.DSA;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negativeSum=0;
        int evenSum=0;
        int oddSum=0;
        while(true){
            int num = in.nextInt();
            if(num==0){
                break;
            }
            if(0>num){
                negativeSum+=num;
            }else if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
        }
        System.out.println(" Sum of negative numbers: " + negativeSum + "\n Sum of positive even numbers: " + evenSum + "\n Sum of positive odd numbers: " + oddSum);

    }
}
