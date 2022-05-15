package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter first Number: ");
        int num1 = user.nextInt();
        System.out.println(" Please Enter second Number: ");
        int num2 = user.nextInt();
        System.out.println(" Please Enter third Number: ");
        int num3 = user.nextInt();

        int getMinimum = Math.min(num1,num2);
        getMinimum = Math.min(getMinimum, num3);
        System.out.println("Smallest Number = " + getMinimum);

        /*if (num1 < num2 && num1 < num3) {
            System.out.println(" Is Minimum of Number : " + num1);*/
        }
    }

