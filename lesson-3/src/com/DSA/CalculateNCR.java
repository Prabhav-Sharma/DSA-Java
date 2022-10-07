package com.DSA;

import java.util.Scanner;

public class CalculateNCR {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Factorial f = new Factorial();
      int n = in.nextInt();
      int r = in.nextInt();
      int NCR = f.factorial(n)/ (f.factorial(r) * f.factorial(n -r));
      System.out.println(NCR);
    }
}
