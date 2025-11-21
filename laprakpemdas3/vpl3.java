package laprakpemdas3;

import java.util.Scanner;

public class vpl3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double hasil = 0;
        boolean kondisi = true;
        double nilai1 = 0;
        int operator;

        while(kondisi){
            operator = scan.nextInt();
            switch(operator){

                case 1:
                nilai1 = scan.nextDouble();
                hasil += nilai1;
                break;
                case 2:
                nilai1 = scan.nextDouble();
                hasil -= nilai1;
                break;
                case 3:
                nilai1 = scan.nextDouble();
                hasil *= nilai1;
                break;
                case 4 :
                nilai1 = scan.nextDouble();
                hasil /= nilai1;
                break;
                case 0 :
                System.out.printf("%s: %.1f\n","Hasil akhir:",hasil);
                System.out.println("Kakulator dimatikan");
                kondisi = false;
                break;
                default:
                System.out.println("Opsi tidak ditemukan");
                break;
            }
            }scan.close();
            }
}
