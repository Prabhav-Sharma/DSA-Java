package com.DSA;

import java.util.Scanner;

public class InfiniteAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        while(true){
            int input = in.nextInt();
            if(input == 0){
                break;
            }else {
                sum += input;
            }
        }
        System.out.println(sum);
    }
}
