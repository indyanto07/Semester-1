package gipiti;

import java.util.Scanner;

public class tod2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan umur anda: ");
        int input = in.nextInt();
        kategoriUsia(input);
        in.close();
    }
    
    public static void kategoriUsia(int umur){
        if (umur < 12){
            System.out.println("Anak-anak");
        }else if(umur >= 12 && umur <= 17){
            System.out.println("Remaja");
        }else if(umur >= 18 && umur <= 59){
            System.out.println("Dewasa");
        }else{
            System.out.println("Lansia");
        }
    }
}
