package com.company;

public class Main {
/* Implement the method that takes String, int startIndex,
 int endIndex. The method returns the substring
 of the given String between startIndex and
 endIndex (startIndex inclusive endIndex exclusive).
 You have to use only length() and charAt() methods of String class.
substring(“It is my own method”,9,12) ->”own”*/
    public static void main(String[] args) {
        String name = "It is my own method";
        String subStringName = name.substring(9,12);
        System.out.println(subStringName);
        //System.out.println(substringMethode(startIndex,endIndex));
    }
}
