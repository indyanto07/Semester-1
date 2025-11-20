package laprakpemdas1;

import java.util.Scanner;

public class tagihanListrik {
     public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

        System.out.print("Masukkan nama : ");
        String nama = scan.nextLine();

        System.out.print("Kelurahan : ");
        String kelurahan = scan.nextLine();
        
        System.out.print("Masukkan posisi awal Kwh Meter : ");
        int awalKwh = scan.nextInt();
        
        System.out.print("Masukkan posisi akhir Kwh Meter : ");
        int akhirKwh = scan.nextInt();
        
        System.out.print("Masukkan biaya beban saat ini : ");
        int biayaBeban = scan.nextInt();
        
        System.out.print("Masukkan PPJ (dalam persen) : ");
        int ppj = scan.nextInt();

        int pemakaian = akhirKwh-awalKwh;
        int tarif = biayaBeban*1000;
        int totalppj = tarif*ppj/100;
        int bayar = tarif+totalppj;

        System.out.printf("%s %s===================\n","===================PLN",kelurahan);
        System.out.printf("%-20s: %s\n","Nama",nama);
        System.out.printf("%-20s: %s\n","Kelurahan", kelurahan);
        System.out.printf("%-20s: %d KWh\n","Pemakaian Bulan ini", pemakaian);
        System.out.printf("%-20s: Rp %d,-\n", "Tarif Listrik", tarif);
        System.out.printf("%-20s: Rp %d,-\n", ("PPJ " + ppj + "%"), totalppj);
        System.out.printf("%-20s: Rp %d,-\n", "Total Bayar", bayar);
        System.out.println("==============================================");

        scan.close();
    }
}
