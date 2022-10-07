package com.DSA;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 23597;  //Output: 79532
        ReverseNumber rn = new ReverseNumber();
        System.out.println(rn.reverseNumber(num));

    }
    public int reverseNumber(int num){
        int output = 0;
        while(num>0){
            int remainder =num %10;
            output = (output * 10) + remainder;
            num = num / 10;
        }
        return output;
    }
}
