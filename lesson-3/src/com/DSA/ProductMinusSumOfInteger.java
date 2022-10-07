package com.DSA;

import java.util.Scanner;

public class ProductMinusSumOfInteger {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        int product =1;
        int sum =0;
        while(num>0){
            int remainder = num % 10;
            num /=10;
            product *= remainder;
            sum+=remainder;
        }
        System.out.println(product - sum);
    }
}
