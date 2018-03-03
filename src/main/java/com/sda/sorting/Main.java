package com.sda.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int[] tablica = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] tablica = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        BubbleSort.sort(tablica);
//        CountingSort.sort(tablica);
        InsertionSort.sort(tablica);

        System.out.println(Arrays.toString(tablica));
    }
}
