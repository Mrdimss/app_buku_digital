package app.ui;

import app.logic.TokoService;
import app.data.Buku;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TokoService service = new TokoService();

        List<Buku> daftar = service.getSemuaBuku();

        System.out.println("=== TOKO BUKU DIGITAL ===");

        for (int i = 0; i < daftar.size(); i++) {

            Buku b = daftar.get(i);

            System.out.println(
                    (i + 1) + ". "
                            + b.getJudul()
                            + " | Harga : "
                            + b.getHarga()
                            + " | Stok : "
                            + b.getStok());
        }

                int pilih;
                while (true) {
                        System.out.print("\nPilih Buku : ");
                        if (!input.hasNextInt()) {
                                System.out.println("Masukkan angka yang valid.");
                                input.next(); // consume invalid token
                                continue;
                        }
                        pilih = input.nextInt();
                        if (pilih < 1 || pilih > daftar.size()) {
                                System.out.println("Pilihan tidak valid.");
                                continue;
                        }
                        break;
                }

                Buku buku = daftar.get(pilih - 1);

        if (service.cekStok(buku)) {

            double diskon =
                    service.hitungDiskon(
                            buku.getHarga());

            double total =
                    service.hitungTotal(
                            buku.getHarga());

            System.out.println("\nJudul : "
                    + buku.getJudul());

            System.out.println("Harga : "
                    + buku.getHarga());

            System.out.println("Diskon : "
                    + diskon);

            System.out.println("Total Bayar : "
                    + total);

        } else {

            System.out.println("Stok Habis");
        }

        input.close();
    }
}