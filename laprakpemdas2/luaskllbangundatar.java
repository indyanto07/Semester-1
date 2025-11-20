package laprakpemdas2;

import java.util.Scanner;

public class luaskllbangundatar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda: ");
        int pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nilai panjang : ");
                double p = scan.nextDouble();
                System.out.print("Masukkan nilai lebar : ");
                double l = scan.nextDouble();
                double kllpersegi = 2*(p + l);
                double luaspersegi = p*l;
                System.out.printf("%-20s: %.2f cm\n", "Keliling persegi", kllpersegi);
                System.out.printf("%-20s: %.2f cm2", "Luas persegi", luaspersegi);
            break;
            
            case 2:
                System.out.print("Masukkan nilai jari-jari : ");
                double r = scan.nextDouble();
                double luaslingkaran = Math.PI*r*r;
                double kelilinglingkaran = 2 * Math.PI * r;
                System.out.printf("%-20s: %.2f cm\n", "Keliling lingkaran", kelilinglingkaran);
                System.out.printf("%-20s: %.2f cm2", "Luas lingkaran", luaslingkaran);
            break;
                
            case 3:
                System.out.print("Masukkan alas: ");
                double a = scan.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scan.nextDouble();
                System.out.print("Masukkan sisi miring: ");
                double s = scan.nextDouble();
                double luassegitiga = 0.5 * a * tinggi;
                double kelilingsegitiga = a + tinggi + s;
                System.out.printf("%-20s: %.2f cm\n", "Keliling segitiga", kelilingsegitiga);
                System.out.printf("%-20s: %.2f cm2", "Luas segitiga", luassegitiga);
            break;
            default:
                 System.out.println("Data Tidak Ditemukan, program dihentikan...");
            break;
        }
        scan.close();
    }
}
