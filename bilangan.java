package TugasSelainLaprak;

import java.util.Scanner;

public class bilangan {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int batas = (int) Math.sqrt(n);
        for (int i = 2; i <= batas; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka");
        int n = in.nextInt();
        int[] angka = new int[n];
        System.out.println("Masukkan "+n+" angka:");
        for (int i = 0; i < n; i++) angka[i] = in.nextInt();

        String prima = "";
        String ganjil = "";
        String genap = "";

        for (int a : angka) {
            if (isPrime(a)) prima += a + ", ";
            if (a % 2 != 0) ganjil += a + ", ";
            if (a % 2 == 0) genap += a + ", ";
        }   
        
        System.out.println("\n--- HASIL ANALISIS ---");
        System.out.println("Bilangan Prima  : " +"["+ prima+"]");
        System.out.println("Bilangan Ganjil : " +"["+ ganjil+"]");
        System.out.println("Bilangan Genap  : " +"["+ genap+"]");
        in.close();
    }
}
