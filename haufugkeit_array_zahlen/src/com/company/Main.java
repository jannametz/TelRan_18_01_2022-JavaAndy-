package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int[] x = {10, 2, 2, 9, 1, 45};
        int[] y = {0, 2, 2, 8, 1, 9, 3};
        int[] z = repeatNumber(sortieren(kombinieren(x, y)));
        System.out.print("{");
        for (int i = 0; i < z.length; i++) {
            System.out.print(i == 0 ? "" : ", ");
            System.out.print(z[i]);
        }
        System.out.println("}" + " --> " + "The element occuring " + z.length + " times. ");
    }

    public static int[] kombinieren(int[] n, int[] m) { //writing together array n+m
        int[] result = new int[n.length + m.length];
        for (int i = 0; i < n.length; i++) {
            result[i] = n[i];
        }
        for (int i = 0; i < m.length; i++) {
            result[n.length + i] = m[i];
        }
        return result;
    }


    public static int[] sortieren(int[] arr) { //here  make array sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int gleich = arr[i];
                    arr[i] = arr[j];
                    arr[j] = gleich;
                }
            }
        }
        return arr;
    }

    public static int[] repeatNumber(int[] arr) { // suchen nach diferent
        int[] gleich = new int[arr.length];
        if (arr.length == 0) {
            return gleich;
        }

        int last = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[last]) {
                if (i != last + 1) {
                    gleich[count++] = arr[last];
                }
                last = i;
            }
        }
        if (last == arr.length - 2) {
            gleich[count++] = arr[last];
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = gleich[i];
        }

        return result;
    }
}
