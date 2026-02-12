package gipiti;

import java.util.Scanner;

public class tod3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= 5;
        for (int i =0;i<n;i++){
            System.out.print("Masukkan angka ke-"+(i+1)+": " );
            int angka = in.nextInt();
            ganjilgenap(angka);
        }
        in.close();
    }
    
    static void ganjilgenap (int cek){
        
        if (cek % 2 ==0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}
