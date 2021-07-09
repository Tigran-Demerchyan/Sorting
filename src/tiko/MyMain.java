package tiko;

import java.util.Arrays;

public class MyMain {


    public static void main(String[] args) {
        int[] arr1 = {89, 32, 76, 45, 23, 98, 33, 111, 1, 23};
        SortAlgorithms.insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(".............................");

        int[] arr2 = {89, 32, 76, 45, 23, 98, 33, 111, 1, 23};
        SortAlgorithms.bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println(".............................");


        int[] arr3 = {89, 32, 76, 45, 23, 98, 33, 111, 1, 23};

        SortAlgorithms.quickSort(arr3);

        System.out.println(Arrays.toString(arr3));


    }


}
