package com.DSA;

public class CountOccurrences {
    public static void main(String[] args) {
        int num = 197347547;
        int count =0;
        while(num > 0){
            int remainder =  num % 10;
            num = num  / 10;
            if(remainder == 7){
                count++;
            }
        }
        System.out.println("The number 7 occurred " +  count + " times.");
    }
}
