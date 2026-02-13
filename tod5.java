package gipiti;

import java.util.Scanner;

public class tod5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int angka = in.nextInt();
        jmlhbil(angka);

        System.out.println("Jumlah bilangan genap dari 1 sampai "+angka+" adalah "+jmlhbil(angka));
        in.close();
    }
    public static int jmlhbil(int input){
        int total=0;
        for (int i = 0 ; i <= input;i++){
            if (i % 2 == 0){
                total+=i;
            }
        }
        return total;
    }
}
