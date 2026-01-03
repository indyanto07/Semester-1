package TugasSelainLaprak;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] angka = new int[n][2];

            for(int i=0;i<n;i++){
                angka [i][0]= in.nextInt();
                angka [i][1]= in.nextInt();
            }
            for (int i=0;i<n-1;i++){
                 int kecil = angka [i][0];
                if (angka [i][1]<angka[i+1][0]){
                    kecil = angka[i+1][1];
                    System.out.println(angka[i+1][0]+" "+kecil);
                }else{
                    System.out.println(angka[i][0]+" "+angka[i+1][1]);
                }
            }

in.close();
        }

    }

