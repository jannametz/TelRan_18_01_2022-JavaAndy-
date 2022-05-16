package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" Please Enter the Day Number 1 to 7: ");
        int weekday = user.nextInt();
        System.out.println(getDayOfWeek(weekday));
    }

    public static String getDayOfWeek(int weekday) {
        String nameOfDay;
        switch (weekday) {
            case 1:
                nameOfDay = "Today is MONDAY";
                break;
            case 2:
                nameOfDay = "Today is TUESDAY";
                break;
            case 3:
                nameOfDay = "Today is WEDNESDAY";
                break;
            case 4:
                nameOfDay = "Today is THURSDAY";
                break;
            case 5:
                nameOfDay = "Today is FRIDAY";
                break;
            case 6:
                nameOfDay = "Today is SATURDAY";
                break;
            case 7:
                nameOfDay = "Today is SUNDAY";
                break;
            default:
                nameOfDay = "Please enter Valid Number between 1 to 7";
        }
        return nameOfDay;

    }
}
