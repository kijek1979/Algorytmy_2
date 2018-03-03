package com.sda.sorting;

public class InsertionSort {
    public static void sort(int[] tablica) {
        int licznik = 0;
        for (int i = 1; i < tablica.length; i++) {
            int tmp = tablica[i];

            int j = i - 1;
            while (j >= 0) {
                licznik++;
                if (tablica[j] > tmp) {
                    tablica[j + 1] = tablica[j];
                    j--;
                } else {
                    break;
                }
            }
            tablica[j + 1] = tmp;
        }
        System.out.println("Counter " + licznik);
    }
}
