package com.company;
/*Given two integers number1 and number2.
Implement method that returns the
sum of all numbers between number1 and number2 that divisible by 3.
Example: getSumDivisibleByTreeNumbers(20,10) -> 45 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the number: ");
        int a = user.nextInt();
        System.out.println(" Please Enter the number: ");
        int b = user.nextInt();

        System.out.println("Sum of  NUM1 to NUM2 that divisible by 3 is: " + getSumDivisibleByTreeNumbers(a, b));
    }

    /* for (int i = a; i <= b/3; i++) {
         int teilbar = i *3;
         System.out.println(teilbar);*/

    static int getSumDivisibleByTreeNumbers(int a, int b)
    {
        // Variable to store the sum
        int sum = 0;
        // Running a loop from A to B and check
        // if a number is divisible by i. (here requirements!) B<A
        for (int i = b; i <= a; i++)
            // If the number is divisible,
            // then add it to sum
            if (i % 3 == 0)
                sum += i;
        // Return the sum
        return sum;
    }
}



