package laprakpemdas2;

import java.util.Scanner;

public class jamkerja {
     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int MaxJam = 60;
        int MinJam = 50;
        int bayaranbiasa = 5000;
        int bayaranlembur = 6000;
        int biayadenda = 1000;

        int upah = 0;
        int lembur = 0;
        int denda = 0;

        System.out.print("Masukkan jam kerja : ");
        int jamkerja = scan.nextInt();

        if (jamkerja > MaxJam) {
            int jamNormal = MaxJam;
            int jamLembur = jamkerja - MaxJam;
            upah = jamNormal * bayaranbiasa;
            lembur = jamLembur * bayaranlembur;
            int total1 = upah + lembur - denda;

            System.out.printf("%-15s: %d\n", "Jam kerja",jamkerja);
            System.out.printf("%-15s= Rp. %d\n","Upah",upah);
            System.out.printf("%-15s= Rp. %d\n","Lembur",lembur);
            System.out.printf("%-15s= Rp. %d\n","Denda",denda);
            System.out.println("--------------------");
            System.out.printf("%-15s= Rp. %d\n","Total",total1);
            
        } else if (jamkerja >= MinJam && jamkerja <= MaxJam) {
            upah = jamkerja * bayaranbiasa;
            int total2 = upah + lembur - denda;
            
            System.out.printf("%-15s: Rp. %d\n", "Jam kerja",jamkerja);
            System.out.printf("%-15s= Rp. %d\n","Upah",upah);
            System.out.printf("%-15s= Rp. %d\n","Lembur",lembur);
            System.out.printf("%-15s= Rp. %d\n","Denda",denda);
            System.out.println("--------------------");
            System.out.printf("%-15s= Rp. %d\n","Total",total2);
            
            
        } else {
            upah = jamkerja * bayaranbiasa;
            int jamKurang = MinJam - jamkerja;
            denda = jamKurang * biayadenda;
            
            int total3 = upah + lembur - denda;
            System.out.printf("%-15s: Rp. %d\n", "Jam kerja",jamkerja);
            System.out.printf("%-15s= Rp. %d\n","Upah",upah);
            System.out.printf("%-15s= Rp. %d\n","Lembur",lembur);
            System.out.printf("%-15s= Rp. %d\n","Denda",denda);
            System.out.println("--------------------");
            System.out.printf("%-15s= Rp. %d\n","Total",total3);
        }
    scan.close();
    }
}
