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

        public static void isPolindrome(String str) {   // Andy: лучше было бы метод делать boolean и возвращать true или false
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {  // в данном случае, когда встречный проход по массиву, немного лучше было бы назвать переменные l и r - сразу понятно, какая справа какая слева

            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                break;  // Andy: если бы метод был boolean, можно было бы return false сделать и исбавится от if в конце. 
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



