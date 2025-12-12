package gipiti;

import java.util.Scanner;

public class tod1 {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan nilai anda: ");
    int angka = in.nextInt();
    cekKelulusan(angka);

    in.close();
 }
   


public static int cekKelulusan(int nilai){
    
    if (nilai >= 60){
        System.out.println("Lulus");
    }else{
        System.out.println("Tidak lulus");
    }
    return nilai;
}
}