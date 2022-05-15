package com.company;

public class Main {

    public static void main(String[] args) {

        countWords("It’s new task for me");
    }

    public static void countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1)!= ' ')){
                count++;
            }
        }
        System.out.println("Count words in String is: " + count);
    }
}
