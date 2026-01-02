package TugasSelainLaprak;
import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lagu a =new Lagu(null, null, 0);
        int N = sc.nextInt(); // jumlah maksimal lagu
        int Q = sc.nextInt();
        Lagu[] playlist = new Lagu[N];
        int size = 0;
        int current =-1;
        // String [] nama_lagu = new String[N];
        // String [] penulis = new String[N];
        // int [] durasi = new int[N];

        for(int i=0;i<Q;i++){
            String operasi = sc.next().toUpperCase();
            switch (operasi) {
                case "ADD":
                    String nama =sc.next();
                    String penulis =sc.next();
                    int durasi =sc.nextInt();

                    playlist[size]=new Lagu(nama, penulis, durasi);
                    size++;
                    System.out.println("Added: "+nama+" "+penulis+" "+durasi);
                    break;
                case "PLAY":
                    int play = sc.nextInt()-1;
                    current = play;

                    Lagu diputar = playlist[current];
                    System.out.println("Playing: "+diputar.getNama()+" "+diputar.getPenulis()+" "+diputar.getDurasi());
                    break;
                case "CURRENT":
                    if(current==-1){
                        System.out.println("No song is being played");
                    }else{
                        Lagu diputar2 = playlist[current];
                        System.out.println("Currently playing: "+diputar2.getNama()+" "+diputar2.getPenulis()+" "+diputar2.getDurasi());
                    }
                    break;
                case "CHANGE":
                    int indexlagu = sc.nextInt()-1;
                    nama = sc.next();
                    penulis = sc.next();
                    durasi = sc.nextInt();

                    if(indexlagu==current){
                        System.out.println("Cannot change the current playing song");
                    }else{
                        Lagu ganti = playlist[indexlagu];
                        System.out.println("Changed: "+ganti.getNama()+" "+ganti.getPenulis()+" "+ganti.getDurasi());
                    }
                    break;
                default:

                    break;
            }
            sc.close();
        }
        

    }
}
class Lagu {
    // --- Atribut private --- (Don't change this)
    private String nama;
    private String penulis;
    private int durasi;

    // --- Constructor ---
    public Lagu(String nama, String penulis, int durasi) {
        this.nama=nama;
        this.penulis=penulis;
        this.durasi=durasi;
    }

    public String getNama() {
       
        return nama;
    }

    public String getPenulis() {
        
        return penulis;
    }

    public int getDurasi() {
       
        return durasi;
    }

    public void setNama(String nama) {
        this.nama=nama;
    }

    public void setPenulis(String penulis) {
        this.penulis=penulis;
    }

    public void setDurasi(int durasi) {
        this.durasi=durasi;
    }

    
}