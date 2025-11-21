package laprakpemdas3;

import java.util.Scanner;

public class volumeBangunRuang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA\n");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang balok: ");
                    int pbalok = scan.nextInt();
                    System.out.print("Masukkan lebar balok: ");
                    int lbalok = scan.nextInt();
                    System.out.print("Masukkan tinggi balok: ");
                    int tbalok = scan.nextInt();
                    int volbalok = pbalok * lbalok * tbalok;
                    System.out.println("=== Hasil ===");
                    System.out.printf("%-25s: %d cm3\n", "Volume balok", volbalok);
                    break;

                case 2:
                    System.out.print("Masukkan jari jari bola: ");
                    double rbola = scan.nextDouble();
                    double volbola = (4.0 / 3.0) * Math.PI * rbola * rbola * rbola;
                    System.out.println("=== Hasil ===");
                    System.out.printf("%-25s: %.2f cm3\n", "Volume bola", volbola);
                    break;

                case 3:
                    System.out.print("Masukkan jari jari kerucut: ");
                    double rkerucut = scan.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tkerucut = scan.nextDouble();
                    double volkerucut = (1.0 / 3.0) * Math.PI * rkerucut * rkerucut * tkerucut;
                    System.out.println("=== Hasil ===");
                    System.out.printf("%-25s: %.2f cm3\n", "Volume kerucut", volkerucut);
                    break;

                case 4:
                    System.out.print("Masukkan jari jari silinder: ");
                    double rsilinder = scan.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    double tsilinder = scan.nextDouble();
                    double volsilinder = Math.PI * rsilinder * rsilinder * tsilinder;
                    System.out.println("=== Hasil ===");
                    System.out.printf("%-25s: %.2f cm3\n", "Volume silinder", volsilinder);
                    break;

                case 5:
                    System.out.print("Masukkan alas segitiga: ");
                    double alssegitiga = scan.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tsegitiga = scan.nextDouble();
                    double luasalaslimas = 0.5 * alssegitiga * tsegitiga;
                    System.out.print("Masukkan tinggi limas: ");
                    double tlimas = scan.nextDouble();
                    double vollimas = (1.0 / 3.0) * luasalaslimas * tlimas;
                    System.out.println("=== Hasil ===");
                    System.out.printf("%-25s: %.2f cm3\n", "Volume limas segitiga", vollimas);
                    break;

                case 0:
                    System.out.println("=== PROGRAM BERHENTI ===");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        } while (pilihan != 0);

        scan.close();
    }
}