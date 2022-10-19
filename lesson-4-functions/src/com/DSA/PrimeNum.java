package com.DSA;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num + " is " + (isPrime(num)?"": "not ") + "prime");
    }

    public static boolean isPrime(int num){
       int i=2;
       while(i*i<num){
           if(num%i==0) return false;
           i++;
       }
       return true;
    }
}
