package laprakpemdas2;

import java.util.Scanner;

public class imt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("===== Kriteria Kegemukan Menggunakan Metode IMT =====");
        System.out.print("Masukkan berat badan anda (kg) : ");
        float berat = scan.nextFloat();
        System.out.print("Masukkan tinggi badan anda (m) : ");
        float tinggi = scan.nextFloat();
        float hasil = berat/(tinggi*tinggi);
        
        System.out.println("===== Hasil =====");
        if(hasil <= 18.5) {
            System.out.printf("IMT = %.2f %s", hasil,"Termasuk Kurus");
        } else if (hasil <= 25) {
            System.out.printf("IMT = %.2f %s", hasil,"Termasuk Normal");
        } else if (hasil <= 30){
            System.out.printf("IMT = %.2f %s", hasil,"Termasuk Gemuk");
        } else {
            System.out.printf("IMT = %.2f %s", hasil,"Termasuk Kegemukan");
        }
        scan.close();
    }
}