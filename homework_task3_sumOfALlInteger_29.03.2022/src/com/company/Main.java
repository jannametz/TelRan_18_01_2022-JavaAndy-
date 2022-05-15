package com.company;
// Implement the program that read Integers from
// Scanner and prints the sum of all integers were input.
// The program will finish when 0 input.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter value of n: ");//take number of user
        int n = user.nextInt();
        int result = 0;
        for (int i = 0; i <=n ;i++ ) {
            result = result + n;
            n = user.nextInt();
        }
        System.out.println("Answer: " + result);
    }
}
