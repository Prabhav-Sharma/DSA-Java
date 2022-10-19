package com.DSA;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println((isPalindrome(in.nextInt())? "Palindrome": "Not Palindrome"));
    }

    private static boolean isPalindrome(int num) {
        int originalNum =num;
        int palindromeNum=0;

        while(num>0){
            int remainder = num %10;
            num = num /10;
            palindromeNum = palindromeNum * 10 +remainder;
        }
        return palindromeNum == originalNum;
    }
}
