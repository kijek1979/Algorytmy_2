package com.sda.sorting.generics.evidence;

// Napisz klasę dowód rzeczowy (taki na policji)
public class Dowod<T extends IEvidence> {

    private T dowod;
    private String opis;

    public Dowod(T dowod, String opis) {
        this.dowod = dowod;
        this.opis = opis;
    }

    public T getDowod() {
        return dowod;
    }

    public void setDowod(T dowod) {
        this.dowod = dowod;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
