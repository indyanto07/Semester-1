package laprakpemdas4;

import java.util.*;

public class summaxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[1000];
        int banyakAngka = 0;
        boolean kondisi = true;
        
        

        while (kondisi) {
            System.out.println("\n======== MENU PILIHAN ========");
            System.out.println("|(1) | Input Data            |");
            System.out.println("|(2) | Lihat Data            |");
            System.out.println("|(3) | Average (Rata-rata)   |");
            System.out.println("|(4) | Sum (Jumlah)          |");
            System.out.println("|(5) | Max (Nilai Tertinggi) |");
            System.out.println("|(6) | Min (Nilai Terendah)  |");
            System.out.println("|(0) | Keluar                |");
            System.out.println("==============================");
            System.out.print("Masukkan pilihan: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                System.out.println("\n=============== INPUT DATA ===============");
                boolean tambahdata = true;
                while (tambahdata) {
                    System.out.print("\nMasukkan angka: ");
                    data[banyakAngka]=sc.nextInt();
                    banyakAngka++;
                    System.out.print("Apakah ingin menambah data lagi (y/n) ? ");
                    String jawaban = sc.next().toLowerCase();
                    if(jawaban.equals("n")){
                        System.out.println("\n==========================================");
                        tambahdata = false;
                    }
                }
                break;
                
                case 2:
                System.out.println("\n=========== LIHAT DATA ===========");
                if (banyakAngka == 0){
                    System.out.println("Belum ada angka yang kamu masukkan ke data!!");
                }else{
                    for (int i = 0; i < banyakAngka; i++){
                        System.out.printf("| Data ke-%-3d | %-3d |\n",(i + 1), data[i]);
                    }
                    System.out.println("==================================");
                }
                break;

                case 3:
                int totalrata = 0;
                System.out.println("\n=========== AVERAGE ===========");
                if (banyakAngka == 0){
                    System.out.println("Belum ada angka yang kamu masukkan ke data!!");
                }else{
                    for (int i = 0;i < banyakAngka;i++){
                        totalrata += data[i];
                    }
                    double rata = (double) totalrata / banyakAngka;
                    System.out.printf("| Average (Rata-rata): %.2f%2s|", rata,"");
                }
                System.out.println("\n===============================");
                break;

                case 4:
                int totalsum = 0;
                System.out.println("\n=========== SUM ===========");
                for (int i = 0;i < banyakAngka;i++){
                    totalsum += data[i];
                }
                System.out.printf("| Sum (jumlah) = %d%6s|",totalsum,"");
                System.out.println("\n===========================");
                break;
                
                case 5 :
                int max = data[0];
                System.out.println("\n============= MAX =============");
                for (int i = 0; i < banyakAngka; i++){
                    if (data[i] > max){
                        max = data[i];
                    }
                }
                System.out.printf("| Max (Nilai Tertinggi): %d%3s|",max,"");
                System.out.println("\n===============================");
                break;
                case 6:
                int min = data[0];
                System.out.println("\n============= MIN =============");
                for (int i = 0; i < banyakAngka; i++){
                    if (data[i] < min){
                        max = data[i];
                    }
                }
                System.out.printf("| Min (Nilai Terendah): %d%3s|",min,"");
                System.out.println("\n===============================");
                break;
                case 0:
                
                System.out.println("\n============= KELUAR =============");
                System.out.printf("| Program berhenti....%11s|","");
                System.out.println("\n==================================");
                kondisi = false;
                break;
                default:
                System.out.println("\nPilihan tidak valid");
                    break;
            }

            
        }
        sc.close();
    }
}
