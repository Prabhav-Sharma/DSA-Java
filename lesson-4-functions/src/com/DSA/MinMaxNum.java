package com.DSA;

import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputArr =new int[3];
        for(int i=0; i<inputArr.length;i++){
            int num = in.nextInt();
           inputArr[i]=num;
        }
        System.out.println("Minimum no. " + minNum(inputArr) +"\nMaximum no. " + maxNum(inputArr));
    }

    static int minNum(int[] num){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }

    static int maxNum(int[] num){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<num.length; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
}
