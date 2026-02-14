package gipiti;

import java.util.Scanner;
public class tod6 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] huruf = new String[5];
        System.out.println("Masukkan 5 nilai huruf (misal: A B+ C D E): ");
        for (int i = 0; i < 5; i++) {
            huruf[i] = in.next();
        }

        // Konversi nilai huruf ke angka
        double n1 = konversiNilai(huruf[0]);
        double n2 = konversiNilai(huruf[1]);
        double n3 = konversiNilai(huruf[2]);
        double n4 = konversiNilai(huruf[3]);
        double n5 = konversiNilai(huruf[4]);

        // Hitung rata-rata, min, dan max
        double rata = hitungRata(n1, n2, n3, n4, n5);
        double min = cariMin(n1, n2, n3, n4, n5);
        double max = cariMax(n1, n2, n3, n4, n5);

        // Tampilkan hasil akhir
        tampilkanHasil(rata, min, max);

        in.close();
    }

    // Konversi nilai huruf ke IPK numerik
    static double konversiNilai(String huruf) {
        huruf = huruf.toUpperCase(); // tidak peka huruf besar-kecil
        switch (huruf) {
            case "A": return 4.00;
            case "B+": return 3.50;
            case "B": return 3.00;
            case "C+": return 2.50;
            case "C": return 2.00;
            case "D+": return 1.50;
            case "D": return 1.00;
            case "E":
            case "K": return 0.00;
            default:
                System.out.println("Nilai tidak valid: " + huruf + " (dianggap 0.00)");
                return 0.00;
        }
    }

    // Hitung rata-rata IPK
    static double hitungRata(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5.0;
    }

    // Cari nilai minimum
    static double cariMin(double a, double b, double c, double d, double e) {
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        if (e < min) min = e;
        return min;
    }

    // Cari nilai maksimum
    static double cariMax(double a, double b, double c, double d, double e) {
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        if (e > max) max = e;
        return max;
    }

    // Tampilkan hasil akhir
    static void tampilkanHasil(double rata, double min, double max) {
        System.out.println("=== HASIL PERHITUNGAN IPK ===");
        System.out.printf("%-16s: %.2f%n", "IPK Rata-rata", rata);
        System.out.printf("%-16s: %.1f%n", "IPK Tertinggi", max);
        System.out.printf("%-16s: %.1f%n", "IPK Terendah", min);
        if (rata >= 2.75)
            System.out.println("Status: LULUS");
        else
            System.out.println("Status: TIDAK LULUS");
    }
}

    



