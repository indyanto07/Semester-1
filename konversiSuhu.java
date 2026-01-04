package TugasSelainLaprak;

import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("===== Konversi Suhu =====");
        System.out.print("Masukkan suhu dalam celcius : ");
        double suhu = scan.nextDouble();
        
        double konversi = (suhu * 9/5) + 32;
        
        System.out.println("===== Hasil =====");
        System.out.printf("Suhu dalam Fahrenheit %.2f °F ", konversi);
        
        scan.close();
    }
}
