package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Реализовать метод boolean isDivisible(int number1, int number2)
	который возвращает true если number1 делится на number2 без остатка.
	 Аналогично первой задаче реализовать метод печати результата.
     */
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the number: ");
        int number1 = user.nextInt();
        int number2 = user.nextInt();
 System.out.println(isDivisible(number1,number2));

    }
    public static boolean isDivisible(int number1, int number2) {

        boolean result;
        if (number1 % number2 == 0) {
            result = true;
            System.out.println(number1 + " --> делится на number2 без остатка. ");
        } else {
            result = false;
            System.out.println(number1 +  " --> нe делится на number2 без остатка. ");
        }
        return result;
    }
}
