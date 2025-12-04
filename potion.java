package TugasSelainLaprak;

import java.util.Scanner;

public class potion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jenis = in.nextInt();
        
        int kualitas = in.nextInt();
        cekpotion(jenis, kualitas);
        in.close();
    }
    public static void cekpotion(int jenis,int kualitas){
    double Harga = 0;
        switch (jenis) {
            case 1:
                switch (kualitas) {
                    case 1:
                        Harga = 164;
                        break;
                    case 2:
                        Harga = 273;
                        break;
                    default:
                        System.out.println("Kualitas potion tidak valid");
                        return;
                }
                break;
            case 2:
                switch (kualitas) {
                    case 1:
                        Harga = 531;
                        break;
                    case 2:
                        Harga = 760;
                        break;
                    default:
                        System.out.println("Kualitas potion tidak valid");
                        return;
                    }
                    break;
            case 3:
                switch (kualitas) {
                    case 1:
                        Harga = 1213;
                        break;
                    case 2:
                        Harga = 1795;
                        break;
                    default:
                    System.out.println("Kualitas potion tidak valid");                  
                        return;
                }
                break;
            default:
                System.out.println("Potion tidak ditemukan");
                return;

            }
            System.out.printf("Harga potion : %,.1f Gulden", Harga );
            
        }
}
