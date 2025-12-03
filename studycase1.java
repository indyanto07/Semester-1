package TugasSelainLaprak;

import java.util.Scanner;

public class studycase1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner

        //Deklarasi harga dan jumlah
        String end; //String untuk mngakhiri kasir
        
        //Input
        do { //Loop untuk kembali menghitung
            int kode = 0, NG = 0, AB = 0, SL = 0, St= 0, Sj = 0; //kode dan jumlah makanan
            double hNG = 15000, hAB = 25000, hSL = 12000, hSt = 5000, hSj = 7000; //harga makanan
            double hNGAkhir = 0, hABAkhir = 0, hSLAkhir = 0;
            double jbks = 0, kbks = 0, lbks = 0;
            double pajak = 0,totalAkhir =0,diskon = 0,setelahdiskon = 0,totalAwal = 0;
            String hari = "", o = "";
        
                //Output daftar harga
                System.out.println("==================================================");
                System.out.println("Daftar Makanan dan Minuman:");
                System.out.printf("%-30s%s%n", "Kode 1: Nasi Goreng Spesial", "(Harga: Rp 15.000)");
                System.out.printf("%-30s%s%n", "Kode 2: Ayam Bakar Madu", "(Harga: Rp 25.000)");
                System.out.printf("%-30s%s%n", "Kode 3: Soto Lamongan", "(Harga: Rp 12.000)");
                System.out.printf("%-30s%s%n", "Kode 4: Es Teh Manis", "(Harga: Rp 5.000)");
                System.out.printf("%-30s%s%n", "Kode 5: Es Jeruk", "(Harga: Rp 7.000)");
                System.out.println("==================================================");

                    //Tambahan biaya bungkus
                System.out.print("Makan langsung atau bungkus? (bungkus = Makanan + 2000) <M/B>: "); //tambahan biaya bungkus
                String makan = input.next().toLowerCase();
                    if (makan.charAt(0) == 'm' || makan.charAt (0) == 'b') {
                        do {
                            input.nextLine();
                            System.out.print("Masukkan kode pembelian: ");
                            kode = input.nextInt();
                            switch (kode) {
                                case 1:
                                System.out.print("Masukkan jumlah: ");
                                int j = input.nextInt();
                                NG += j; //jumlah pembelian bertambah berdasarkan jumlah
                                if (makan.charAt (0) == 'b') { //tambahan biaya bungkus
                                    hNGAkhir=hNG + 2000;
                                    jbks = j * 2000;
                                }
                                System.out.printf("%-20s%s%d    = Rp %,.0f%n", "Nasi Goreng Spesial", "x",j, hNG*j);
                                break;
                                
                                case 2: 
                                System.out.print("Masukkan jumlah: ");
                                int k = input.nextInt();
                                AB += k;  //jumlah pembelian bertambah berdasarkan jumlah
                                if (makan.charAt (0) == 'b') { //tambahan biaya bungkus
                                    hABAkhir= hAB + 2000;
                                    kbks = k * 2000;
                                }
                                System.out.printf("%-20s%s%d    = Rp %,.0f%n", "Ayam Bakar Madu", "x",k, hAB*k);                            
                                break;
                                
                                case 3: 
                                System.out.print("Masukkan jumlah: ");
                                int l = input.nextInt();
                                SL += l;  //jumlah pembelian bertambah berdasarkan jumlah
                                if (makan.charAt (0) == 'b') { //tambahan biaya bungkus
                                    hSLAkhir = hSL + 2000;
                                    lbks = l * 2000;
                                }
                                System.out.printf("%-20s%s%d    = Rp %,.0f%n", "Soto Ayam Lamongan", "x",l, hSL*l);
                                break;
                                
                                case 4:
                                System.out.print("Masukkan jumlah: ");
                                int m = input.nextInt();
                                St += m;  //jumlah pembelian bertambah berdasarkan jumlah
                                System.out.printf("%-20s%s%d    = Rp %,.0f%n", "Es Teh Manis", "x",m, hSt*m);
                                break;
                                
                                case 5:
                                System.out.print("Masukkan jumlah: ");
                                int n = input.nextInt();
                                Sj += n;  //jumlah pembelian bertambah berdasarkan jumlah
                                System.out.printf("%-20s%s%d    = Rp %,.0f%n", "Es Jeruk", "x",n, hSj*n);
                                break;
                                
                                default:
                                System.out.println("Kode Tidak valid");
                                break;
                            } 
                            System.out.print("Tambah menu? <Ya/Tidak>: "); //Menambah menu karena tidak pakai array /pun hashmap dan sejenisnya
                            o = input.next().toLowerCase();
                        } while (o.charAt (0) =='y');
                        
                        System.out.print("Apakah hari ini hari jumat? <Ya/Tidak>: "); //Penentu diskon jumat
                        hari = input.next().toLowerCase();
                        //Menghitung total
                        double TotNG = hNG * NG;
                        double TotAB = hAB * AB;
                        if (hari.charAt(0) == 'y') { //diskon hari jumat
                                        TotAB -= 5000;
                        }
                        double TotSL = hSL * SL;
                        double TotSt = hSt * St;
                        double TotSj = hSj * Sj;
                        if (makan.charAt (0) == 'b') {
                            TotNG = hNGAkhir * NG;
                            TotAB = hABAkhir * AB;
                            if (hari.charAt(0) == 'y') { //diskon hari jumat
                            TotAB -= 5000;}
                            TotSL = hSLAkhir * SL;
                        }

                        double Totbiayatambahan = jbks + kbks + lbks;
                        
                        totalAwal = TotAB + TotNG + TotSL +TotSj +TotSt; //Total harga seluruh
                        
                        ////////// start hitung diskon dan pajak
                        if(totalAwal > 100000){
                        diskon = totalAwal*0.15;                  
                        } else if (totalAwal > 50000){
                        diskon = totalAwal*0.10;
                        }
                        setelahdiskon = totalAwal - diskon;

                        pajak = setelahdiskon*0.10;
                        totalAkhir = setelahdiskon+pajak;

                        //Struk
                        System.out.println("================== Struk =================");
                        if (NG > 0) {
                            System.out.printf("%-20s%s%d    = Rp %,.0f%n", " Nasi Goreng Spesial", "x",NG, TotNG); }
                        if (AB > 0) {
                            System.out.printf("%-20s%s%d    = Rp %,.0f%n", " Ayam Bakar Madu", "x",AB, TotAB); }
                        if (SL > 0) {
                            System.out.printf("%-20s%s%d    = Rp %,.0f%n", " Soto Ayam Lamongan", "x",SL, TotSL); }
                        if (St > 0) {
                            System.out.printf("%-20s%s%d    = Rp %,.0f%n", " Es Teh", "x",St, TotSt); }
                        if (Sj > 0) {
                            System.out.printf("%-20s%s%d    = Rp %,.0f%n", " Es Jeruk", "x",Sj, TotSj); }
                        System.out.println("------------------------------------------");
                        System.out.printf("%-25s: Rp %,.0f\n"," Total",totalAwal);
                        System.out.println("------------------------------------------");
                        if (totalAwal > 100000){
                            System.out.printf("%-25s: Rp %,.0f\n"," Diskon 15%",diskon);
                        }else if (totalAwal > 50000){
                            System.out.printf("%-25s: Rp %,.0f\n"," Diskon 10%",diskon);
                        }else {
                            System.out.printf("%-25s: Rp %,.0f\n"," Diskon",diskon);
                        }
                        System.out.printf("%-25s: Rp %,.0f\n"," Biaya Tambahan",Totbiayatambahan);
                        System.out.println("------------------------------------------");
                        System.out.printf("%-25s: Rp %,.0f\n"," Total",setelahdiskon);
                        System.out.println("------------------------------------------");
                        System.out.printf("%-25s: Rp %,.0f\n"," Pajak 10%",pajak);
                        System.out.println("------------------------------------------");
                        System.out.printf("\n%-25s: Rp %,.0f\n"," TOTAL BAYAR",totalAkhir);
                        System.out.println("\n==========================================");
                        System.out.println("Terima kasih sudah makan di sini, semoga puas dan ditunggu kedatangannya kembali.\n");
                       
                    } else {
                        System.out.println("Perhitungan dihentikan");
                    }
            System.out.print("Menghitung lagi? <Ya/Tidak>: ");
            end = input.next().toLowerCase();
        } while (end.charAt(0) == 'y');{
            System.out.println("Terima Kasih");
        }input.close();
    }
}
