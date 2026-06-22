package app.data;

public class Buku {

    private String judul;
    private double harga;
    private int stok;

    public Buku(String judul, double harga, int stok) {
        this.judul = judul;
        this.harga = harga;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}