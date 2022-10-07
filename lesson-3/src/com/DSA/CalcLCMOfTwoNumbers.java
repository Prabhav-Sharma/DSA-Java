package com.DSA;

import java.util.Scanner;


public class CalcLCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int i=1;
      while(true){
            if(Math.max(num1,num2) * i % Math.min(num1,num2) == 0){
                System.out.println(Math.max(num1,num2) * i);
                break;
            }else{
                i++;
                if(i>Math.max(num1,num2)){
                    System.out.println(num1 * num2);
                    break;
                }
            }
        }
    }

}
