package com.DSA;

import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println( "You are " + (isEligible(age)?"" : "not " ) + "eligible to vote!");
    }

    static boolean isEligible(int age){
        return age>=18;
    }
}
