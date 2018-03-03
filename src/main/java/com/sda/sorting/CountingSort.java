package com.sda.sorting;

public class CountingSort {
    public static void sort(int[] tablica) {
        int zakres = 255;
        int[] liczniki = new int[zakres]; // same zera
        // przykładowa tablica: 1 1 2 3 5 5 5
        // liczniki[1] ++;
        // liczniki[1] ++;
        // liczniki[2] ++;
        // liczniki[3] ++;
        // liczniki[5] ++;
        // liczniki[5] ++;
        // liczniki[5] ++;
        // liczniki = 0, 2, 1, 1, 0, 3
        for (int i = 0; i < tablica.length; i++) {
            liczniki[tablica[i]]++;
        }

        int pozycjaWstawiania = 0;
        for (int i = 0; i < liczniki.length; i++) {
            for (int j = 0; j < liczniki[i]; j++) {
                tablica[pozycjaWstawiania++] = i;
            }
        }
    }
}
