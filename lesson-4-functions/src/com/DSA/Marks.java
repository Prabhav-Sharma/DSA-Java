package com.DSA;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        /*
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        System.out.println("Your grade is " + getGrade(in.nextInt()));
    }


    static String getGrade(int marks){
        String grade;
         marks = marks - marks %10;
        switch (marks) {
            case 90:
                grade = "AA";
                break;
            case 80:
                grade = "AB";
                break;
            case 70:
                grade = "BB";
                break;
            case 60:
                grade = "BC";
                break;
            case 50:
                grade = "CD";
                break;
            case 40:
                grade = "DD";
                break;
            default:
                grade = "Fail";
                break;
        }
        return grade;
    }
}
