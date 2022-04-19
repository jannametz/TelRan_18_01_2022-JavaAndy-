package com.company;
import java.util.Scanner;

public class Main {
/* *Write method boolean
isPalindrome(String) that checks whether a given word is a palindrome.
A palindrome is a word that reads the same from the front and the back.
isPalindrome(“довод”) -> true
isPalindrome(“невод”) -> false*/

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = user.nextLine();
        isPolindrome(str);
    }

        public static void isPolindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {

            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                break;
            }
        }
        if (i >= j) {
            System.out.println(str + " --> " + "true");
        }
        else {
            System.out.println(str + " --> " + "false");
        }
    }
}



