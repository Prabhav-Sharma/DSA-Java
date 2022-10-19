package com.DSA;


import java.util.Scanner;

public class PrimeBetweenNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        System.out.println(allPrimeNum(in.nextInt(),in.nextInt()));

    }

    static boolean isPrime(int num){
       int i=2;
       while(i*i <=num){
           if(num%i==0) return false;
           i++;
       }
       return true;
    }

    static String allPrimeNum(int a, int b){
     String primeNum ="";
        for(int i = Math.min(a, b) +1 ; i<Math.max(a,b);i++){
          if(isPrime(i)){
              primeNum+= i+ " ";
          }
        }
        return primeNum;
    }
}
