package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the number: ");
        int number = user.nextInt();
        System.out.println(isEven(number));// 1. task one
        System.out.println("---------------------------------");
        printCheckResultMessage(number); //   1.task two
        System.out.println("---------------------------------");

    }

    //-------------------------------------------------------
    public static boolean isEven(int number) { /*Реализовать метод boolean isEven(int number) который возвращает true если переданное
число четное иначе возвращает false.*/
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }



   public static void printCheckResultMessage(int number) { /* Реализовать метод void printCheckResultMessage(int
number, boolean result) который выводит на экран строку вида «10 это четное число» или
“15 это не четное число»
Подсказка: Используем конструкцию if и оператор % modulo*/
       boolean result;
       if (number % 2 == 0) {
           result = true;
           System.out.println(number + " is even --> это четное число.");
       }
            if (number % 2 == 1) {
                result = false;
                System.out.println(number  + " is odd --> это не четное число.");
            }
        }
    }
