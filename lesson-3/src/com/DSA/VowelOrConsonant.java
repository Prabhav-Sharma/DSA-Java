package com.DSA;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char[] vowels = new char[]{'a', 'e','i','o','u', 'A','E','I','O','U'};
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        boolean vowel=false;
      for(int i=0; i<= vowels.length -1 ; i++){
          if(vowels[i] == ch){
              vowel=true;
          }
      }
        System.out.println(vowel?"vowel":"consonant");
    }
}
