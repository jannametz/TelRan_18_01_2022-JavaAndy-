package com.company;

public class Main {
/**Implement the method that takes a
 strings and returns the new string that
 contains every second character of the original string
 “abcde” -> “bd”
 “Hello Java” -> “el aa”*/
    public static void main(String[] args) {
        System.out.println(secondCharacter("abcde"));
        System.out.println(secondCharacter("Hello Java"));
    }

    public static String secondCharacter(String str) {
        String count = " ";
        for (int i = 1; i < str.length(); i++) {
            count = count + str.charAt(i);
             i++;
            }
        System.out.print("Every second character in String is: ");
        return count;
    }
}


