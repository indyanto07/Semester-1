package latihan;

import java.util.Scanner;

public class rawr1 {
     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah kelas: ");
    int kelas = scan.nextInt();
    System.out.print("Masukkan jumlah siswa per kelas: ");
    int siswa = scan.nextInt();
    System.out.printf("\n%1sDaftar Nilai Siswa:","");

    for(int i=1; i<=kelas;i++){
        System.out.printf("\nKelas %d:\n",i);
        for(int a= 1; a<=siswa; a++ ){
            System.out.printf("Masukkan nilai siswa ke-%s: ",a);
            int nilai = scan.nextInt();
            System.out.printf("%7sNilai siswa ke-%d adalah %d\n","",a,nilai);

        }
    }
    scan.close();
   } 
}
