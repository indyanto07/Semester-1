package TugasSelainLaprak;

import java.util.Scanner;

public class trynerorSC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean lanjut = true;
        while (lanjut) {
            int totalAwal = 0;
            boolean adaAyamBakar = false;
            int jenisMakanan = 0;

            System.out.println("=== Menu WarungMakanNusantara ===");
            System.out.println("1. Nasi Goreng Spesial - Rp15000");
            System.out.println("2. Ayam Bakar Madu    - Rp25000");
            System.out.println("3. Soto Ayam Lamongan - Rp12000");
            System.out.println("4. Es Teh Manis       - Rp5000");
            System.out.println("5. Es Jeruk           - Rp7000");

            // input item
            while (true) {
                System.out.print("Masukkan kode menu (0 untuk selesai): ");
                int kode = sc.nextInt();
                if (kode == 0) break;

                System.out.print("Jumlah: ");
                int jumlah = sc.nextInt();

                int harga = 0;
                String nama = "";
                String jenis = "";

                switch (kode) {
                    case 1:
                        nama = "Nasi Goreng Spesial";
                        harga = 15000;
                        jenis = "makanan";
                        break;
                    case 2:
                        nama = "Ayam Bakar Madu";
                        harga = 25000;
                        jenis = "makanan";
                        adaAyamBakar = true;
                        break;
                    case 3:
                        nama = "Soto Ayam Lamongan";
                        harga = 12000;
                        jenis = "makanan";
                        break;
                    case 4:
                        nama = "Es Teh Manis";
                        harga = 5000;
                        jenis = "minuman";
                        break;
                    case 5:
                        nama = "Es Jeruk";
                        harga = 7000;
                        jenis = "minuman";
                        break;
                    default:
                        System.out.println("Kode tidak valid!");
                        continue;
                }

                int subtotal = harga * jumlah;
                totalAwal += subtotal;
                System.out.println(nama + " x" + jumlah + " = Rp" + subtotal);

                if (jenis.equals("makanan")) {
                    jenisMakanan++;
                }
            }

            // hitung diskon
            double diskon = 0;
            if (totalAwal > 100000) {
                diskon = totalAwal * 0.15;
            } else if (totalAwal > 50000) {
                diskon = totalAwal * 0.10;
            }
            double totalSetelahDiskon = totalAwal - diskon;

            // diskon jumat + ayam bakar madu
            // misal untuk contoh, kita input manual hari
            System.out.print("\nApakah hari ini Jumat? (y/n): ");
            String hari = sc.next();
            if (hari.equalsIgnoreCase("y") && adaAyamBakar) {
                totalSetelahDiskon -= 5000;
                System.out.println("Diskon Jumat Rp5000 diterapkan!");
            }

            // biaya bungkus
            System.out.print("\nApakah pesanan dibungkus? (y/n): ");
            String bungkus = sc.next();
            int biayaBungkus = 0;
            if (bungkus.equalsIgnoreCase("y")) {
                biayaBungkus = jenisMakanan * 2000;
            }

            double totalDenganBiaya = totalSetelahDiskon + biayaBungkus;

            // pajak 10%
            double pajak = totalDenganBiaya * 0.10;
            double totalAkhir = totalDenganBiaya + pajak;

            // cetak struk ringkas
            System.out.println("\n========== STRUK ==========");
            System.out.println("Total Awal       : Rp" + totalAwal);
            System.out.println("Diskon           : Rp" + (int)diskon);
            if (biayaBungkus > 0) {
                System.out.println("Biaya Bungkus    : Rp" + biayaBungkus);
            }
            System.out.println("Pajak 10%        : Rp" + (int)pajak);
            System.out.println("---------------------------");
            System.out.println("TOTAL BAYAR      : Rp" + (int)totalAkhir);
            System.out.println("===========================\n");

            // ulang transaksi?
            System.out.print("Transaksi lagi? (y/n): ");
            String lagi = sc.next();
            if (!lagi.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        sc.close();
        System.out.println("Aplikasi kasir ditutup.");
    }
}
