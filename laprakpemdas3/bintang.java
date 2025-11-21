package laprakpemdas3;

import java.util.Scanner;

public class bintang {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris : ");
        int baris = scan.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int k = 1;k<= baris-i;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
                System.out.println();
            }
            scan.close();
        }
}