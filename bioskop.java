package TugasSelainLaprak;

import java.util.Scanner;

public class bioskop {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        String []judul = new String[a];
        int [] harga = new int[a];
        int [] tiket = new int[a];
        String [] huruf = new String[b];

        for(int i=0;i<a;i++){
            judul[i]=in.next();
            harga[i]=in.nextInt();
            tiket[i]=in.nextInt();
        }

        for(int i=0;i<b;i++){
            huruf[i] = in.next().toUpperCase();
        }
        for(int i=0;i<a;i++){
            switch (huruf[i]) {
                case"A":
                    for(int j=0;j<a;j++){
                        System.out.printf("%-20s| Rp.%-10d| %d\n",judul[j],harga[j],tiket[j]);
                    }
                    break;
                case"B":
                    int banyak = tiket[0];
                    for(int j=0;j<a;j++){
                        if(tiket[j]>banyak){
                            banyak = tiket[j];
                        }
                    }
                    System.out.printf("%-20s| Rp.%-10d| %d\n",judul[i],harga[i],banyak);
                    break;
                case"C":
                    int kecil = tiket[0];
                    for(int j=0;j<a;j++){
                        if(kecil>tiket[j]){
                        kecil = tiket[j];  
                        }
                    }
                    System.out.printf("%-20s| Rp.%-10d| %d\n",judul[i+1],harga[i+1],kecil);
                    break;
                case "D":
                    int total=0;
                    for(int j=0;j<a;j++){
                        int hitung = tiket[j]*harga[j];
                        total =total + hitung;
                    }
                    System.out.println("Rp."+total);
                    break;
                default:
                    break;
            }
        }
        in.close();
    }
}
