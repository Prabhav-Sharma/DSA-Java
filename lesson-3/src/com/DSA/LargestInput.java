package com.DSA;

import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        while(true){
            int input = in.nextInt();
            if(input == 0){
                break;
            }else{
                if(input>max){
                    max =input;
                }
            }
        }
        System.out.println(max);
    }
}
