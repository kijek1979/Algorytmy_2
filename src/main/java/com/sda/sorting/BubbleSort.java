package com.sda.sorting;

public class BubbleSort {
    public static void sort(int[] tablica) {

        int operationCounter = 0;
        int n = tablica.length;
        do {
            for (int i = 0; i < tablica.length - 1; i++) {
                operationCounter++;
                if (tablica[i] > tablica[i + 1]) {
                    // swap
                    int tmp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = tmp;
                }
            }
            n = n - 1;
        } while (n > 1);

        System.out.println("Counter " + operationCounter);
    }
}
