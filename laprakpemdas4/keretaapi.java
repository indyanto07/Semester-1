package laprakpemdas4;

import java.util.Scanner;

public class keretaapi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[][] kereta = {
        {"Ekonomi","50000","2","Tidak Ada","Tidak Ada"},
        {"Bisnis","100000","5","Ada","Tidak Ada"},
        {"Eksekutif","200000","7","Ada","Tidak Ada"},
        {"Pariwisata","300000","10","Ada","Ada"}
    };
    
    String[] pesananjenis = new String[1000];
    int [] pesananQty = new int[1000];
    long[] pesananHarga = new long[1000];
    int[] pesananDiskon = new int[1000];
    long[] pesananTotal = new long[1000];
    int jumlahpesanan = 0;
    boolean kondisi = true;
    while(kondisi){
        System.out.println("\nPilihan menu");
        System.out.println("1. Melihat Daftar Kereta Api");
        System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
        System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
        System.out.println("4. Memesan Tiket Kereta Api");
        System.out.println("5. Melihat Pesanan Tiket");
        System.out.println("0. Keluar");
        System.out.print("Masukkan nilai: ");
        int pilihan = sc.nextInt();
        
        switch(pilihan){
            case 1 :
            System.out.println("=".repeat(42) + " Daftar Kereta Api "+"=".repeat(42));
            System.out.printf("| %-2s | %-15s | %-23s | %-12s | %-13s | %-18s |\n",
            "No", "Nama Kereta", "Harga", "Diskon", "AC", "Colokan");
            System.out.println("=".repeat(103));
            for (int i = 0; i < kereta.length;i++){
                System.out.printf("| %-2d | %-15s | Harga: Rp %,10d%3s | Diskon: %-3s%% | AC: %-9s | Colokan: %-9s |\n", 
                (i + 1), kereta[i][0],Integer.parseInt(kereta[i][1]),"", kereta[i][2], kereta[i][3], kereta[i][4]);
            }
            System.out.println("=".repeat(103));
            break;
            case 2 :
            System.out.println("=".repeat(32) + " Kereta dengan AC "+"=".repeat(32));
            System.out.printf("| %-2s | %-15s | %-23s | %-12s | %-13s |\n",
            "No", "Nama Kereta", "Harga", "Diskon", "AC");
            System.out.println("=".repeat(82));
            for (int i = 0; i < kereta.length;i++){
                if (kereta[i][3].equals("Ada")) {
                    System.out.printf("| %-2d | %-15s | Harga: Rp %,10d%3s | Diskon: %-3s%% | AC: %-9s |\n",
                    (i + 1),kereta[i][0],Integer.parseInt(kereta[i][1]),"",kereta[i][2],kereta[i][3]);
                }
            }
            System.out.println("=".repeat(82));
            break;
            
            case 3 :
            System.out.println("=".repeat(31) + " Kereta dengan Colokan "+"=".repeat(31));
            System.out.printf("| %-2s | %-15s | %-23s | %-12s | %-18s |\n",
            "No", "Nama Kereta", "Harga", "Diskon", "Colokan");
            System.out.println("=".repeat(85));
            for (int i = 0; i < kereta.length;i++){
                if (kereta[i][4].equals("Ada")) {
                    System.out.printf("| %2d | %-15s | Harga: Rp %,10d%3s | Diskon: %-3s%% | Colokan: %-9s |\n",
                    (i + 1),kereta[i][0],Integer.parseInt(kereta[i][1]),"",kereta[i][2],kereta[i][4]);
                }
            }
            System.out.println("=".repeat(85));
            break;

            case 4 :
            System.out.println("=".repeat(45) + " Pesan Tiket "+"=".repeat(45));
            System.out.printf("| %-2s | %-15s | %-23s | %-12s | %-13s | %-18s |\n",
            "No", "Nama Kereta", "Harga", "Diskon", "AC", "Colokan");
            System.out.println("=".repeat(103));
            for (int i = 0; i < kereta.length;i++){
                System.out.printf("| %-2d | %-15s | Harga: Rp %,10d%3s | Diskon: %-3s%% | AC: %-9s | Colokan: %-9s |\n", 
                (i + 1), kereta[i][0],Integer.parseInt(kereta[i][1]),"", kereta[i][2], kereta[i][3], kereta[i][4]);
            }
            System.out.println("=".repeat(103));
            System.out.print("pilih nomor jenis berapa: ");
            int pilihnomor = sc.nextInt() - 1;
            System.out.print("Masukkan jumlah tiket: ");
            int jumlahtiket = sc.nextInt();
            sc.nextLine();

            long harga = Long.parseLong(kereta[pilihnomor][1]);
            int diskon = Integer.parseInt(kereta[pilihnomor][2]);

            long subtotal = harga * jumlahtiket;
            long setelahdiskon = subtotal * diskon / 100;
            long total = subtotal - setelahdiskon;

            System.out.printf("%-15s: %,d\n","Subtotal",subtotal);
            for (int i = 0; i < kereta.length;i++){
                if (pilihnomor == i){
                    System.out.printf("%-15s: %,d\n",("Diskon " + kereta[i][2] + "%"),setelahdiskon);
                }  
            }
            System.out.printf("%-15s: %,d\n","Total",total);

            System.out.printf("Konfirmasi pesananan, apakah anda yakin memesan tiket ini? (y/n)");
            String konfirm = sc.nextLine().toLowerCase();

            if(konfirm.equals("y")){
                pesananjenis[jumlahpesanan] = kereta[pilihnomor][0];
                pesananQty[jumlahpesanan] = jumlahtiket;
                pesananHarga[jumlahpesanan] = harga;
                pesananDiskon[jumlahpesanan] = diskon;
                pesananTotal[jumlahpesanan] = total;
                jumlahpesanan++;
                System.out.println("Pesanan berhasil disimpan");
            }else{
                System.out.println("Pesanan dibatalakan");
            }
            break;

            case 5 :
            System.out.println("=".repeat(14) + " Daftar Pesanan " + "=".repeat(14));
            if (jumlahpesanan == 0){
                System.out.println("Belum ada pesanan");
                break;
            } else {
                long akhirtotal = 0;
                for (int i = 0; i < jumlahpesanan;i++){
                    System.out.printf("Tiket Anda : %d. %s x%d\n", (i + 1),pesananjenis[i],pesananQty[i]);
                    System.out.printf("%-30s: %,d\n", "Harga per tiket", pesananHarga[i]);
                    System.out.printf("%-30s: %d%%\n", "Diskon ", pesananDiskon[i]);
                    System.out.printf("%-30s: %,d\n\n", "Total",pesananTotal[i]);
                    akhirtotal += pesananTotal[i];
                    }  
                    System.out.printf("%-30s: %,d\n","Total Akhir Pesanan Anda",akhirtotal);
                }
                System.out.println("=".repeat(44));
                break;

                case 0: 
                System.out.println("Terima kasih. Keluar program");
                kondisi = false;
                break;

                default : 
                System.out.println("Pilihan tidak valid");
                break;
            }   
        }
        sc.close();
    }
}
