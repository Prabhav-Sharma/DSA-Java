package com.DSA;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int sum =0;
        while(true){
            int input = in.nextInt();
            if(input == 0){
                break;
            }
            sum+=input;
            count++;
        }
        System.out.println(sum/count);
    }
}
