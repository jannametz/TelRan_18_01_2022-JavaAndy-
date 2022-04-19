package com.company;

import java.util.Scanner;

public class Main {
/*Implement the previous task for phrase.
Ignore spaces, punctuation marks ( “, . –“)
and regardless of case. Hint: use the String.toLowerCase method
  isPalindrome(“А роза упала на лапу Азора”) -> true*/

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the string phrase: ");
        String str = user.nextLine();
        //String jana = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(str));
        //System.out.println(jana.toLowerCase());
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // String is Lowercase
        String without_a_gaps = " ";
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) { // Vergleicht Zeichen ob sie  gleich sind
            char getI = str.charAt(i);
            char getJ = str.charAt(j);
            if (!(getI >= ' ' && getI <= ' ')) /// Wenn es links ist anderes Symbol gibt
                i++;
               else
                if (!(getJ >= ' ' && getJ <= ' ')) //enn es rechts ist anderes Symbol gibt
                    j--;
            else
                    if (getI == getJ) { // wenn sie gleich sind
                        i++;
                        j--;
                    } else //Wenn die Zeichen dann nicht gleich sind.Der Satz ist kein Palindrome

                        return false;
                }
                return true; // Hier ist Satz Palindrome
            }
        }
