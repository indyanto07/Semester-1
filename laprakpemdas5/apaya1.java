package laprakpemdas5;
import java.util.*;
public class apaya1 {
     public static void main(String[] args) { 
          Scanner in = new Scanner(System.in); 
          int pilih = 3; 
          do { 
              System.out.println("Program Menghitung Sederhana "); 
              System.out.println("Pilih salah satu :"); 
              System.out.println("1. luas & keliling segitiga sembarang"); 
              System.out.println("2. luas & keliling segitiga siku siku"); 
              System.out.println("3. Keluar"); 
              System.out.print("Masukkan Pilihan Anda : "); 
              pilih = in.nextInt(); 
             switch (pilih) { 
                 case 1: 
                     volPrismaSegitiga(in); 
                     break; 
                 case 2: 
                     volBalok(in);                      
                      break;
             } 
             System.out.println();
            } while (pilih != 3); 
         in.close();
        } 
        
         private static void volPrismaSegitiga(Scanner in) {          
        float alas,tinggiSegitiga,luas,tinggiPrisma,volume;
         System.out.print("Masukkan nilai panjang alas : "); 
         alas = in.nextFloat(); 
         System.out.print("Masukkan nilai tinggi segitiga : "); 
         tinggiSegitiga = in.nextFloat(); 
         luas = (alas * tinggiSegitiga) / 2; 
         System.out.print("Masukkan nilai tinggi prisma : "); 
         tinggiPrisma = in.nextFloat(); 
         volume = luas * tinggiPrisma;
         System.out.println("Volume Prisma Segitiga :" + volume); 
         
         
        } 
        
        static void volBalok(Scanner in) {            
            float panjang,lebar,tinggi,volume;
            System.out.print("Masukkan panjang balok : "); 
            panjang = in.nextFloat(); 
            System.out.print("Masukkan lebar balok : "); 
            lebar = in.nextFloat(); 
            System.out.print("Masukkan tinggi balok : "); 
            tinggi = in.nextFloat(); 
            volume = panjang * lebar * tinggi; 
            System.out.println("Volume balok : " + volume);
            
            
        }
        
    }
    //  double sisi1,sisi2,sisi3,luas,keliling,setengahkll; 
    //  System.out.print("Masukkan panjang sisi 1: ");
    //  sisi1 = in.nextDouble();
    //  System.out.print("Masukkan panjang sisi 2: ");
    //  sisi2 = in.nextDouble();
    //  System.out.print("Masukkan panjang sisi 3: ");
    //  sisi3 = in.nextDouble();
    //  keliling = sisi1 + sisi2 + sisi3;
    //  setengahkll = keliling / 2; 
    //  luas = Math.sqrt(setengahkll*(setengahkll-sisi1)*(setengahkll-sisi2)*(setengahkll-sisi3));
    //  System.out.printf("Keliling segitiga sembarang: %.2f",keliling);
    //  System.out.printf("luas segitiga sembarang: %.2f",luas);

    //  float alas, tinggi, luas,keliling;
    //  double sisiMiring;
    //  System.out.print("Masukkan alas segitiga: ");
    //  alas = in.nextFloat();
    //  System.out.print("Masukkan tinggi segitiga: ");
    //  tinggi = in.nextFloat();
    //  System.out.println();
    //  luas = 0.5f*alas*tinggi;
    //  sisiMiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
    //  keliling = alas + tinggi + (float)sisiMiring;
    //  System.out.printf("Luas segitiga: %.2f\n",luas);
    //  System.out.printf("Sisi miring segitiga: %.2f\n",sisiMiring);
    //  System.out.printf("keliling segitiga: %.2f\n",keliling);
