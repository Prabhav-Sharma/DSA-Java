package com.DSA;

public class ReverseString {
    public static void main(String[] args) {
        String name ="prabhav";
        String output ="";
        for(int i = name.length() -1 ; i>=0; i--){
            output+=name.charAt(i);
        }
        System.out.println(output);
    }
}
