package latihan;

import java.util.Scanner;

public class rawr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yeye;
        System.out.println("=== Silahkan login User1234 ===");
        do{ System.out.print("Masukkan password: ");
            yeye = scan.nextInt();

        } while( yeye != 621312);
        System.out.println("Login berhasil!");
        scan.close();
    }
}
