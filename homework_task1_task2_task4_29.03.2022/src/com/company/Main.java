package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*Implement the method that takes
 String and print the first word of the String
  (all chars before the first space)(“Пример строки”) ->”Пример”/*/
        // method length read string length including gaps(probelu)
        String str = "Пример строки";//ssalc olleH  + "\t"
        System.out.println(str.length());// calcul symbol
        System.out.println("--------------------------------");
        System.out.println(str.charAt(0));// gibt züruck sympol irgendwelche position
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        char ch = str.charAt(5);// 0 1 2 3 4 // gibt züruck typ char
        System.out.println(ch);
        System.out.println("--------------------------------");
        printColumn(str);
        System.out.println("--------------------------------");
        stringToTwoChar("MAMA", 'M', 'P');
        System.out.println("--------------------------------");
        subString("It is my own method ",9,12);

    }
    public static void printColumn(String str){
        for (int i = 0; i<str.length()-6;i++) {
            char ch = str.charAt(i);// 0 1 2 3 4 // gibt züruck typ char
            System.out.println(str.charAt(i)); // H e l l o \
        }
    }
/* Implement the method that takes String,
int startIndex, int endIndex. The method returns the substring
of the given String between startIndex and endIndex
(startIndex inclusive endIndex exclusive).
You have to use only length() and charAt() methods of String class.
substring(“It is my own method”,9,12) ->”own”*/

    public static void subString(String str, int startIndex,int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            System.out.print(str.charAt(i));
        }
    }
/* Write a method that takes a String and a two chars.
As the result it returns the given String, where each the first
char was replaced by the second char.
You have to use only length() and charAt() methods of String class.*/

    public static void stringToTwoChar (String str, char x, char y){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                System.out.println(y);
            } else {
                System.out.println(str.charAt(i));
            }
        }
    }
}


