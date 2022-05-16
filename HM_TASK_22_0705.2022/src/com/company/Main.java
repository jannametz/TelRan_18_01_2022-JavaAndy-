package com.company;

import java.util.Scanner;

public class Main {
/*  Допустим, дан массив int, каждое значение в котором лежит в диапазоне от 0 до 9.
    Реализовать метод, который вернет число long, которое поразрядно состоит из элементов
    заданного массива
    Например: {1,3,7} -> 137 */
public static void main(String[] args) {

    int array[] = {1,3,7};
    int [] z = ( intArray(array));
    System.out.print("{");
    for (int i = 0; i < z.length; i++) {
        System.out.print(i == 0 ? "" : ", ");
        System.out.print(z[i]);
    }
    System.out.print("}" + " --> ");
    for (int i = 0; i < array.length; i++) {
     System.out.print((array[i]));
    }
}

    private static int[] intArray(int[] array) { //sortieren die Elemente
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int gleich = array[i];
                    array[i] = array[j];
                    array[j] = gleich;
                }
            }
        }
        return array;
    }
}