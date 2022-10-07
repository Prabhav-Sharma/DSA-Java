package com.DSA;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = scanner.nextLine();
        String reversedString ="";
      for(int i=0; i<input.length();i++){
          reversedString = input.charAt(i) + reversedString;
      }
        System.out.println(input.equalsIgnoreCase(reversedString)?"Palindrome!": "Not a Palindrome!");
    }
}
