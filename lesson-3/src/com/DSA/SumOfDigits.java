package com.DSA;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;
        while(num>0){
            int remainder = num %10;
            num/=10;
            sum+=remainder;
        }
        System.out.println(sum);
    }
}
