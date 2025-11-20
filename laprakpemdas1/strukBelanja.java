package laprakpemdas1;

import java.util.Scanner;

public class strukBelanja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tanggal Beli : ");
        int tangggalBeli = scan.nextInt();

        System.out.print("Bulan Beli : ");
        int bulanBeli = scan.nextInt();

        System.out.print("Tahun beli : ");
        int tahunBeli = scan.nextInt();
        scan.nextLine();

        System.out.print("Belanja Barang : ");
        String belanjaBarang = scan.nextLine();

        System.out.print("Jumlah Barang : ");
        int jumlahBarang = scan.nextInt();

        System.out.print("Harga barang : ");
        double hargaBarang = scan.nextDouble();

        System.out.print("diskon : ");
        float diskon = scan.nextFloat();

        System.out.print("Jenis Pembayaran : ");
        boolean jenisPembayaran = scan.nextBoolean();

        double totalharga = hargaBarang*jumlahBarang;  

        double hargafinal = totalharga-(totalharga*(diskon/100));

        System.out.println("========= List Barang =========");
        System.out.printf("%-17s: %s\n", "Tanggal", (tangggalBeli + "-" +  bulanBeli + "-" +  tahunBeli));
        System.out.printf("%-17s: %s\n", "Barang belanja",belanjaBarang);
        System.out.printf("%-17s: %s\n","Jumlah barang", jumlahBarang);
        System.out.printf("%-17s: %,.2f\n","Harga Barang", hargaBarang);
        System.out.printf("%-17s: %.1f %s\n","Diskon",diskon,"%");
        System.out.println("-------------------------------");
        System.out.printf("%-17s: Rp%,.2f\n","Total harga",totalharga);
        System.out.printf("%-17s: Rp%,.2f\n","Pembayaran",hargafinal);
        System.out.printf("%-17s: %b","Pembayaran tunai",jenisPembayaran);
       
        scan.close();
    }
}
