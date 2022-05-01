package com.company;
/*Implement the method that print the String,
which consists of given char of the given source string
and repeated as many times as the given character occurs in the source string
“It’s new task for me”,’e’ -> “ee”*/
public class Main {

    public static void main(String[] args) {

        System.out.println(secondCharacter("It's new task for me"));
        System.out.println(secondCharacter("abcde"));
        System.out.println(secondCharacter("Hello Peter, how are you?"));
         }
        public static String secondCharacter(String str) {
        String count = " ";
        for (int i = 0; i < str.length(); i++) {
        //count = count + str.charAt(i);
        if (str.charAt(i) == 'e'){
            count = count + str.charAt(i) ;
            }
                  }
              System.out.print("The repeat method String as many times: ");
                return count;
    }
}
