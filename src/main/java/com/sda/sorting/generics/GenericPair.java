package com.sda.sorting.generics;

public class GenericPair<L, R> {
    private L lewy;
    private R prawy;

    public GenericPair(L lewy, R prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public L getLewy() {
        return lewy;
    }

    public void setLewy(L lewy) {
        this.lewy = lewy;
    }

    public R getPrawy() {
        return prawy;
    }

    public void setPrawy(R prawy) {
        this.prawy = prawy;
    }
}
