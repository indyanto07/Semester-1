package laprakpemdas2;

import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan waktu berapa lama anda parkir : ");
        double menitParkir = scan.nextDouble();
        
        if (menitParkir <= 0) {
            System.out.println("Misiiii input ga valid nihh!!");
            System.exit(0);
        }
        
        scan.nextLine(); 
        System.out.print("Pilih Tipe kendaraan (Mobil/Motor) : ");
        String kendaraan = scan.nextLine();

        double waktu = menitParkir/60;
        switch (kendaraan.toLowerCase()) {
            case "mobil":
                double biayamob1 = 5000;
                if (menitParkir > 5 && menitParkir <= 120) {
                    System.out.printf("%s %s selama %.1f %s Rp %,.2f","Biaya parkir",kendaraan,waktu,"jam adalah",biayamob1);
                } else if (menitParkir > 120){
                    double waktuLebih = menitParkir - 120;
                    double biayaTambahan = waktuLebih / 10 * 2000;
                    double biayaTotalmob1 = biayamob1 + biayaTambahan;
                    System.out.printf("%s %s selama %.1f %s Rp %,.2f","Biaya parkir",kendaraan,waktu,"jam adalah",biayaTotalmob1);
                } else if (menitParkir > 0 && menitParkir <= 5) {
                    double biayamob2 = 3000;
                    System.out.printf("%s %s hanya Rp%,.2f karena hanya %.1f menit","Biaya parkir",kendaraan,biayamob2,menitParkir);
                }
                break;
                case "motor" :
                double biayamot1 = 5000;
                if (menitParkir > 5 && menitParkir <= 120) {
                    System.out.printf("%s %s selama %.1f %s Rp%,.2f","Biaya parkir",kendaraan,waktu,"jam adalah",biayamot1);
                } else if (menitParkir > 120){
                    double waktuLebih = menitParkir - 120;
                    double biayaTambahan = waktuLebih / 10 * 1000;
                    double biayaTotalmot1 = biayamot1 + biayaTambahan;
                    System.out.printf("%s %s selama %.1f %s Rp%,.2f","Biaya parkir",kendaraan,waktu,"jam adalah",biayaTotalmot1);
                } else if (menitParkir > 0 && menitParkir <= 5) {
                    double biayamot2 = 3000;
                    System.out.printf("%s %s hanya Rp%,.2f karena hanya %.1f menit","Biaya parkir",kendaraan,biayamot2,menitParkir);
                } 
                
            break;
            default:
            System.out.println("Jalan kaki tidak perlu bayar parkir");
                break;
        }
        scan.close();

    }
    
}
