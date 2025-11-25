package laprakpemdas6;

import java.util.ArrayList;


 class Kategori {
    private String namaKategori;
    private ArrayList<Buku> daftarbuku;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarbuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarbuku.add(buku);
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public ArrayList<Buku> getdaftarbuku() {
        return daftarbuku;
    }
}
