package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array2D = {{1, 2} ,{ 3, 4}, {5, 6}};
        //({ {1,2},{3,4},{5,6} })
        int[] result = convert2DArrayTo1D(array2D);
        System.out.println("Takes a 2D array and return 1D array --> " + Arrays.toString(result));
        //{1,2,3,4,5,6}
    }

    public static int[] convert2DArrayTo1D(int[][] input) {
        //zuerst zählen...
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == null)
                continue;
            count += input[i].length;
        }

        //ergebnis aufbauen
        int[] result = new int[count];

        //und umkopieren
        int current = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == null)
                continue;
            for (int j = 0; j < input[i].length; j++) {
                result[current] = input[i][j];
                current++;
            }
        }
        return result;
    }
}


