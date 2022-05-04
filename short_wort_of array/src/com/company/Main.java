package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] str = {"Mama", "Max","Papa","Family", "Ay"};
       System.out.println(smallestArray(str));
    }
        public static String smallestArray(String str[]) {
            if (str == null || str.length < 1) {
                return "";
            }
            String smallestArray = str[0];
            for (int i = 1; i < str.length; i++) {
                if (str[i].length() < smallestArray.length()) {
                    smallestArray = str[i];
                }
            }
            return smallestArray;
        } // smallest
    }

