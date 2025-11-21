package laprakpemdas4;

import java.util.Scanner;

public class VPL4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        int n = scan.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        
        final int XX = 25;
        int letterMax = id + XX;
        int spasi = id + XX + 1;
        
        StringBuilder pesan = new StringBuilder();
        int[] invalid = new int[n];
        int countinvalid = 0;
        
        for(int i = 0;i < n; i++){
            int x = arr[i];
            if (x >= id && x <= letterMax){
                char huruf = (char) ('A' + (x - id));
                pesan.append(huruf);
            } else if (x == spasi){
                pesan.append(' ');
            } else {
                invalid[countinvalid] = x;
                countinvalid++;
            }
        }
        
        System.out.println("\nOutput pesan: " + pesan.toString().toUpperCase());
        
        System.out.print("Elemen tidak valid ditemukan: [");
        for (int i = 0; i < countinvalid; i++){
            System.out.print(invalid[i]);
            if (i < countinvalid - 1){
                System.out.print(" ");
            }
        }
        System.out.print("]");
        scan.close();
    }
}
