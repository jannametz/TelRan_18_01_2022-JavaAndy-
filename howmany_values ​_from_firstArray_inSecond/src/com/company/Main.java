package com.company;

public class Main {
/*21. *Дано два массива int. Написать метод, который считает,
сколько значений из первого массива присутствуют во втором.
Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3*/
    public static void main(String[] args) {
            int[] x = {10,14,1,4,3};
            int[] y = {0,1,6,10,1,4,13};
            int[] z = diferent(sortieren(kombinieren(x, y)));
            System.out.print("(");
            for (int i = 0; i < z.length; i++) {
                System.out.print(i == 0 ? "" : ", ");
                System.out.print(z[i]);
            }
            System.out.println(")" + " --> 3 Elements");
    }

    private static int[] kombinieren(int[] n, int[] m) { //zusammen schreibt den Array n+m
        int[] result = new int[n.length + m.length];
        for (int i = 0; i < n.length; i++) {
            result[i] = n[i];
        }
        for (int i = 0; i < m.length; i++) {
            result[n.length + i] = m[i];
        }
        return result;
    }

    private static int[] sortieren(int[] arr) { //sortieren die Elemente
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

    private static int[] diferent(int[] arr) { // suchen nach diferent
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