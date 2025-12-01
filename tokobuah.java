package TugasSelainLaprak;

import java.util.Scanner;

public class tokobuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaBuah = {"Pisang","Apel","Buah Naga","Anggur","Semangka"};
        int[][] harganstock = {
            {15000,10},{17000,7},{14000,8},{12000,9},{20000,11}
        };

        boolean kondisi = true;
        
        while (kondisi) {
            System.out.println("\n=== Data Toko Buah Lowokwaru ===");
            System.out.println("1. Daftar Buah, harga, dan stock");
            System.out.println("2. Ubah Stock buah");
            System.out.println("3. Melihat buah yang stock paling dikit");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Daftar Buah, harga, dan stock ===");
                    for (int i = 0; i < namaBuah.length; i++) {
                        System.out.printf("| Buah : %-12s | Harga : Rp %,7d | Stock : %-5d |\n",
                                namaBuah[i], harganstock[i][0], harganstock[i][1]);
                    }
                    break;

                case 2:
                    System.out.println("\n=== Ubah stock buah ===");
                    for (int i = 0; i < namaBuah.length; i++) {
                        System.out.printf("|(%d) %-12s | Stock : %-5d |\n", (i + 1), namaBuah[i], harganstock[i][1]);
                    }
                    System.out.print("Masukkan nomor buah untuk diubah stocknya: ");
                    int stockdiubah = sc.nextInt();
                    int kodebuah = stockdiubah - 1;

                    if (kodebuah < 0 || kodebuah >= namaBuah.length) {
                        System.out.println("Nomor buah tidak valid!");
                        break;
                    }

                    System.out.println("--------------------");
                    System.out.println("1. Menambah stock");
                    System.out.println("2. Mengurangi stock (ada pembeli)");
                    System.out.print("Masukkan pilihan: ");
                    int tambahkurang = sc.nextInt();

                    switch (tambahkurang) {
                        case 1:
                            System.out.print("Berapa stock yang ditambah: ");
                            int tambah = sc.nextInt();
                            harganstock[kodebuah][1] += tambah;
                            System.out.println("Stock berhasil diperbarui!\n");
                            System.out.println("=========== Stock Bertambah ===========");
                            System.out.printf("| %s sekarang memiliki stock: %d |\n",
                                    namaBuah[kodebuah], harganstock[kodebuah][1]);
                            System.out.println("=======================================\n");
                            break;

                        case 2:
                            System.out.print("Berapa stock yang dikurang (terjual): ");
                            int kurang = sc.nextInt();

                            if (kurang > harganstock[kodebuah][1]) {
                                System.out.println("Stock tidak mencukupi!");
                            } else {
                                harganstock[kodebuah][1] -= kurang;
                                int totalharga = harganstock[kodebuah][0] * kurang;
                                System.out.println("Stock berhasil diperbarui!\n");
                                System.out.println("=================== Pembelian ===================");
                                System.out.printf("| Pembelian: %s sebanyak x%d, total Rp %,d |\n",
                                        namaBuah[kodebuah], kurang, totalharga);
                                System.out.println("=================================================\n");
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
                            break;
                    }
                    break;

                case 3:
                    int stockpalingkecil = harganstock[0][1];
                    for (int i = 1; i < harganstock.length; i++) {
                        if (harganstock[i][1] < stockpalingkecil) {
                            stockpalingkecil = harganstock[i][1];
                        }
                    }

                    System.out.println("\n=== Buah yang paling sedikit stocknya ===");
                    for (int i = 0; i < harganstock.length; i++) {
                        if (harganstock[i][1] == stockpalingkecil) {
                            System.out.printf("| Buah : %-12s | Stock : %-7d |\n", namaBuah[i], harganstock[i][1]);
                        }
                    }
                    System.out.println("=========================================");
                    break;

                case 0:
                    System.out.println("\nTerima kasih, program berhenti...");
                    kondisi = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }

        sc.close();
    }
}
