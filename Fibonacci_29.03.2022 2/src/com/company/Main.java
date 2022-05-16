package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Fibonacci Folge
        int a = 2, b = 1, c = 1;
        Scanner user = new Scanner(System.in);
        System.out.print("Enter value of n: ");//take number of user
        int n = user.nextInt();
        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++){
            a = b;
            b = c;
            c = a + b;
        System.out.println(a + " ");
        }
    }
}
