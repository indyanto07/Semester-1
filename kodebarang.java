package TugasSelainLaprak;

import java.util.Scanner;

public class kodebarang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] kodeBarang = {"A12","B45","C20","A35","D78"};
        
        String input = in.nextLine();
        
        for (int i =0;i < kodeBarang.length;i++){
            String barang = kodeBarang[i];
            if (input.equalsIgnoreCase(barang)){
                System.out.println("Kode ditemukan");
                return;
            }
            
            in.close();
        }
        System.out.println("Kode tidak ditemukan");
    }
}
