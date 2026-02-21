package gipiti;

import java.util.Scanner;

public class consoldua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int n = sc.nextInt();
        String[] siswa = new String[n];

        for(int i = 0; i < siswa.length;i++){
            System.out.print("Masukkan nama siswa ke-"+(i+1)+": " );
            siswa[i]=sc.next();
        }
        
        System.out.println("\nDaftar nama siswa:");
        for(int i = 0; i < siswa.length;i++){
            System.out.printf("Nama siswa ke-%d: %s\n",(i+1),siswa[i]);
        }
        sc.close();
    }
}
