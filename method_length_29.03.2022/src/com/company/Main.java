package com.company;

public class Main {

    public static void main(String[] args) {
	// method length read string length including gaps(probelu)
        String str = "Hello class";//ssalc olleH
        System.out.println(str.length());// calcul symbol
        System.out.println(str.charAt(0));// gibt züruck sympol irgendwelche position
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        char ch = str.charAt(4);// 0 1 2 3 4 // gibt züruck typ char
        System.out.println(ch); // H e l l o
        System.out.println("---------------print column------------------------");
        printColumn(str);
        System.out.println("---------------print reverse------------------------");
        System.out.println(getReversString(str));
    }
    // 0.............end of the String
    public static void printColumn(String str) {
       for (int i = 0; i<str.length(); i++) {
           System.out.println(str.charAt(i));
       }
    }

    public static String getReversString(String str) { //Method "Hello class" -> "ssalc olleHwird" line ausgeben
        String result = "";//leer Zeichen hier liegt
        //hello
        for (int i = str.length()-1; i>=0 ; i--) {
            result = result + str.charAt(i);
            System.out.println(str.charAt(i));
        }
        return result;
    }
}
