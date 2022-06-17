import  java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        int[] input = new int[]{2, 6, 7, 3, 5, 7, 8, 8, 1, -1, 14, 5, 7};
        System.out.println("Befor sort Array: ");
        System.out.println(Arrays.toString(input));
        int n = input.length;
        QuickSort.quickSort(input, 0, n - 1);
        System.out.println("After sort Array: ");
        System.out.println(Arrays.toString(input));
    }
}