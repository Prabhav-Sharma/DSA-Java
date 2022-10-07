package com.DSA;

import java.util.Scanner;

public class CalcHCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int HCF=1;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1 % i ==0 && num2 %i == 0){
                if(i>HCF){
                    HCF =i;
                }
            }
        }
        System.out.println("HCF is : " + HCF);
    }
}
