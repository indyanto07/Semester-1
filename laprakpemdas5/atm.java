package laprakpemdas5;
import java.util.*;
public class atm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long saldo =0;
        ArrayList<String> riwayat = new ArrayList<>();
        int pilihan = 5;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. keluar");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo anda saat ini: Rp"+saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setoran: ");
                    long setor = in.nextLong();
                    if (setor > 0 && saldo + setor <1000000000){
                        saldo += setor;
                        System.out.println("Setoran berhasil! Saldo sekarang: Rp"+saldo);
                        riwayatTransaksi(riwayat, "Setor", setor);
                    } else {
                        System.out.println("Jumlah setoran tidak valid!");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan jumlah penarikan: ");
                    long tarik = in.nextLong();
                    if (tarik > saldo){
                        System.out.println("Saldo tidak mencukupi!");
                    } else if (tarik <= 0){
                        System.out.println("Jumlah tidak valid!");
                    }else{
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil! Saldo sekarang: Rp"+saldo);
                        riwayatTransaksi(riwayat,"Tarik", tarik);
                    }
                    break;
                case 4: 
                    System.out.println("=== Riwayat Transaksi ===");
                    if (riwayat.size()==0){
                        System.out.println("Belum ada transaksi.");
                    }else{
                        for (int i = 0; i < riwayat.size();i++){
                            System.out.println((i+1)+". "+riwayat.get(i));
                        }
                    }
                    break;
                case 5:
                System.out.println("Terima kasih telah menggunakan ATM ini.");
                break;
                default:
                System.out.println("");
                    break;
            }
        } while (pilihan != 5); 
            
        in.close();
    }

    private static void riwayatTransaksi(ArrayList<String> riwayat,String jenisTransaksi, long jumlahTransaksi ){
        if (riwayat.size() == 10){
            riwayat.remove(0);
        }else{
            riwayat.add(jenisTransaksi + " - Rp" + jumlahTransaksi);
        }

    }

    
}
