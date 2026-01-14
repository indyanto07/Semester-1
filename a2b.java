package ououpee;
import java.util.*;
public class a2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a2 siswa = new a2();
        a2 siswa2 = new a2();
        System.out.print("Masukkan nama siswa: ");
        String namaSiswa = sc.nextLine();
        System.out.print("Masukkan nama siswa 2: ");
        String namaSiswa2 = sc.nextLine();

        siswa.setNama(namaSiswa);
        siswa2.setNama(namaSiswa2);
        System.out.println("Nama siswa yang dimasukkan: "+ siswa.getNama());
        System.out.println("Nama siswa yang dimasukkan: "+ siswa2.getNama());

        sc.close();
   }
    
}
