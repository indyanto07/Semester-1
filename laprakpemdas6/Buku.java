package laprakpemdas6;

import java.util.ArrayList;


 class Buku {
     private String judul;
    private ArrayList<Penulis> daftarpenulis;

    public Buku(String judul) {
        this.judul = judul;
        this.daftarpenulis = new ArrayList<>();
    }

    public void tambahPenulis(Penulis penulis) {
        daftarpenulis.add(penulis);
    }

    public String getJudul() {
        return judul;
    }

    public ArrayList<Penulis> getdaftarpenulis() {
        return daftarpenulis;
    }
    
    public static String formatPenulis(ArrayList<Penulis> list) {
            
        if (list.size() == 1) {
            return list.get(0).getNama();
        }

        if (list.size() == 2) {
            return list.get(0).getNama() + " & " + list.get(1).getNama();
        }

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                result += "& " + list.get(i).getNama();
            } else {
                result += list.get(i).getNama() + ", ";
            }
        }

        return result;
    }
}
