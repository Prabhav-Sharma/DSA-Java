package com.DSA;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ReverseNumber rn = new ReverseNumber();
        int num = in.nextInt();
        System.out.println(num == rn.reverseNumber(num)? "Palindrome": "Not a Palindrome");
    }
}
