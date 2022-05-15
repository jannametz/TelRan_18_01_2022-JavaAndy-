package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the day: ");
        int day = user.nextInt();
        System.out.println(" Please Enter the month: ");
        int month = user.nextInt();
        System.out.println(" Please Enter the year: ");
        int year = user.nextInt();
        System.out.print(day + "/" + month + "/" + year + " -> " );
        System.out.print(dayMonthYear(day, month, year));
    }

    public static boolean isYearLeap(int year) {

        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return (year % 4 == 0);
    }

    public static boolean dayMonthYear(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (isYearLeap(year))
                return (day <= 29);
            else
                return (day <= 28);
        }
        if (month==4 || month==6 || month==9 || month==11)
            return (day<=30);
        return true;
    }
}

