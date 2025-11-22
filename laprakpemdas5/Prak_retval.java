package laprakpemdas5;
import java.util.*;


public class Prak_retval {
         public static void main(String[] args) { 
         Scanner in = new Scanner(System.in); 
         System.out.println("Program Pendataan Mahasiswa"); 
         System.out.println(); 
         String nim1, nama1, nim2, nama2, jur1, jur2,tempat1,tempat2,tgl1,tgl2,bln1,bln2,thn1,thn2; 
         System.out.print("Masukan NIM Mahasiswa 1 : "); 
         nim1 = in.nextLine(); 
         System.out.print("Masukan Nama Mahasiswa 1 : "); 
         nama1 = in.nextLine(); 
         System.out.print("Masukan Jurusan Mahasiswa 1 : "); 
         jur1 = in.nextLine(); 
         System.out.print("Masukkan Tempat lahir: ");
         tempat1 = in.nextLine();
         System.out.print("Masukkan Tanggal lahir: ");
         tgl1 = in.nextLine();
         System.out.print("Masukkan Bulan lahir: ");
         bln1 = in.nextLine();
         System.out.print("Masukkan Tahun lahir: ");
         thn1 = in.nextLine();

         System.out.println();

         System.out.print("Masukan NIM Mahasiswa 2 : "); 
         nim2 = in.nextLine(); 
         System.out.print("Masukan Nama Mahasiswa 2 : "); 
         nama2 = in.nextLine(); 
         System.out.print("Masukan Jurusan Mahasiswa 2 : "); 
         jur2 = in.nextLine(); 
         System.out.print("Masukkan Tempat lahir: ");
         tempat2 = in.nextLine();
         System.out.print("Masukkan Tanggal lahir: ");
         tgl2 = in.nextLine();
         System.out.print("Masukkan Bulan lahir: ");
         bln2 = in.nextLine();
         System.out.print("Masukkan Tahun lahir: ");
         thn2 = in.nextLine();

         System.out.println();

         System.out.println("Data Mahasiswa : "); 
         System.out.println(showData(nim1, nama1, jur1,tempat1,tgl1,bln1,thn1)); 
         System.out.println(showData(nim2, nama2, jur2,tempat2,tgl2,bln2,thn2)); 
         in.close();
     } 
      
     public static String showData(String nim, String nama, String jurusan, String Tempat, String tanggal, String bulan, String Tahun) { 
         int tahunsekarang = 2025;
         int umur = tahunsekarang - Integer.parseInt(Tahun);
         String status;
         if (umur > 20){
            status = "Adult";
         } else {
            status = "teen";
         }

         String show = "\nnim : " + nim + "\nnama : " + nama + "\nJurusan : " + jurusan + "\nTempat, tanggal lahir: "+Tempat+ ", " +tanggal+" "+bulan+" "+Tahun +"\n"+ "Umur: "+umur + "\nStatus: "+status; 
         return show; 
     }
  

   
}
