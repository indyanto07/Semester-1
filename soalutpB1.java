package latihan;

import java.util.Scanner;

public class soalutpB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int banyakbarang = sc.nextInt();

        // int hargatertinggi = 0;
        // String namahargater ="";
        // int totalpembayaran = 0;
        
        
        for (int i = 0; i < banyakbarang; i++){
            String nama = sc.next();
            int jumlah = sc.nextInt();
            int harga = sc.nextInt();

            int total =0;
            total = harga*jumlah;
            // totalpembayaran += total;
            
            // for (int j =0; j < banyakbarang ;j++){
                System.out.println(nama + ": " + jumlah +"x"+harga+"= "+total);
            // }
            
            
            
            
        }
        // int rata2 = totalpembayaran/banyakbarang;


        // String [] judul = new String[banyakjudul];
        // for (int i = 0; i < banyakjudul;i++){
        //     judul[i] = sc.nextLine();
        // }
        sc.close();
    }
    
}
