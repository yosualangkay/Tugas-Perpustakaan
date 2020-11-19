package com.company;

import java.util.ArrayList;

public class OpenLibrary {
    private ArrayList<Koleksi> list = new ArrayList<>();


    public ArrayList<Koleksi> getList() {
        return list;
    }

    public void tambahKoleksi(Koleksi koleksi) {
        getList().add(koleksi);
    }

    public void displayAll() {
        getList().forEach(Koleksi::displayKoleksi);
    }

}
