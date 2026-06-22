package app.data;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Buku> getDataBuku() {

        List<Buku> daftar = new ArrayList<>();

        daftar.add(new Buku(
                "Pemrograman Java",
                100000,
                10));

        daftar.add(new Buku(
                "Basis Data",
                120000,
                5));

        daftar.add(new Buku(
                "Algoritma",
                90000,
                8));

        return daftar;
    }
}