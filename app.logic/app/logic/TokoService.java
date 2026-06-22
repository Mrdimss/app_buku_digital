package app.logic;

import app.data.Buku;
import app.data.Database;

import java.util.List;

public class TokoService {

    public List<Buku> getSemuaBuku() {
        return Database.getDataBuku();
    }

    public double hitungDiskon(double harga) {
        if (harga >= 100000) {
            return harga * 0.10;
        }
        return 0;
    }

    public double hitungTotal(double harga) {
        return harga - hitungDiskon(harga);
    }

    public boolean cekStok(Buku buku) {
        return buku.getStok() > 0;
    }
}