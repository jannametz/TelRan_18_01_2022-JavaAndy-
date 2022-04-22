package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
/* * Given the String like “20*((876/8)+19)” ,
implements the method that check if the parentheses are correct.
Try to solve it yourself without help of Google
“9*(8+3)-( (9+1)5)” -> true
"9(8+3)-( (9+1)*5)" -> true
“9(8+3)- (9+1)5)” -> false
“98+3)-( (9+1)*5” -> false*/

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("Enter the Expression: ");
        String str = user.nextLine();
        System.out.println(isBalancedParentheses(str));
    }

           public static boolean isBalancedParentheses(String str) {
                boolean result = true;
                ArrayList<String> list = new ArrayList<String>();

                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == '(')
                    {
                        list.add(Character.toString(str.charAt(i)));
                    }

                    else if(str.charAt(i) == ')') {
                        if(list.size() != 0 && list.get(list.size()-1).equals("(") && str.charAt(i) == ')') { //Получение общего размера спискаиспользуя метод size()
                            list.remove(list.size()-1);
                        } else {
                            return false;
                        }
                    }
                }
                if(list.isEmpty() == true) {
                    return true;
                }
                return result;
            }
        }


