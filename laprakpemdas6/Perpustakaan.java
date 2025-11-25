package laprakpemdas6;

import java.util.*;

public class Perpustakaan {
    public static void main(String[] args) {
        // teknologi
        ArrayList<Kategori> semuaKategori = new ArrayList<>();
        Kategori teknologi = new Kategori("Teknologi");
        semuaKategori.add(teknologi);

        Penulis tp1 = new Penulis("Yuval Noah Harari");
        Buku tj1 = new Buku("Homo Deus: A Brief History of Tomorrow");
        tj1.tambahPenulis(tp1);
        teknologi.tambahBuku(tj1);
        
        Penulis tp2 = new Penulis("Ray Kurzweil");
        Buku tj2 = new Buku("The Singularity Is Near");
        tj2.tambahPenulis(tp2);
        teknologi.tambahBuku(tj2);
        
        Penulis tp3 = new Penulis("Shoshana Zuboff");
        Buku tj3 = new Buku("The Age of Surveillance Capitalism");
        tj3.tambahPenulis(tp3);
        teknologi.tambahBuku(tj3);

        Penulis tp4 = new Penulis("Kevin Kelly");
        Buku tj4 = new Buku("The Inevitable: Understanding the 12 Technological Forces That Will Shape Our Future");
        tj4.tambahPenulis(tp4);
        teknologi.tambahBuku(tj4);

        Penulis tp5 = new Penulis("Erik Brynjolfsson");
        Penulis tp5b = new Penulis("Andrew McAfee");
        Buku tj5 = new Buku("The Second Machine Age");
        tj5.tambahPenulis(tp5);
        tj5.tambahPenulis(tp5b);
        teknologi.tambahBuku(tj5);

        // filsafat
        Kategori filsafat = new Kategori("Filsafat");
        semuaKategori.add(filsafat);

        Penulis fp1 = new Penulis("Immanuel Kant");
        Buku fj1 = new Buku("Critique of Pure Reason");
        fj1.tambahPenulis(fp1);
        filsafat.tambahBuku(fj1);
        
        Penulis fp2 = new Penulis("Friedrich Nietzsche");
        Buku fj2 = new Buku("Thus Spoke Zarathustra");
        fj2.tambahPenulis(fp2);
        filsafat.tambahBuku(fj2);
        
        Penulis fp3 = new Penulis("Plato");
        Buku fj3 = new Buku("The Republic");
        fj3.tambahPenulis(fp3);
        filsafat.tambahBuku(fj3);

        Penulis fp4 = new Penulis("Aristotle");
        Buku fj4 = new Buku("Nicomachean Ethics");
        fj4.tambahPenulis(fp4);
        filsafat.tambahBuku(fj4);

        Penulis fp5 = new Penulis("Max Horkheimer");
        Penulis fp5b = new Penulis("Theodor Adorno");
        Penulis fp5c = new Penulis("Herbert Marcuse");
        Buku fj5 = new Buku("Critical Theory: Selected Essays");
        fj5.tambahPenulis(fp5);
        fj5.tambahPenulis(fp5b);
        fj5.tambahPenulis(fp5c);
        filsafat.tambahBuku(fj5);

        // sejarah
        Kategori sejarah = new Kategori("Sejarah");
         semuaKategori.add(sejarah);

        Penulis sp1 = new Penulis("Yuval Noah Harari");
        Buku sj1 = new Buku("Sapiens: A Brief History of Humankind");
        sj1.tambahPenulis(sp1);
        sejarah.tambahBuku(sj1);
        
        Penulis sp2 = new Penulis("Jared Diamond");
        Buku sj2 = new Buku("Guns, Germs, and Steel");
        sj2.tambahPenulis(sp2);
        sejarah.tambahBuku(sj2);
        
        Penulis sp3 = new Penulis("Eric Hobsbawm");
        Buku sj3 = new Buku("The Age of Revolution");
        sj3.tambahPenulis(sp3);
        sejarah.tambahBuku (sj3);

        Penulis sp4 = new Penulis("William H. McNeill");
        Penulis sp4b = new Penulis("John R. McNeill");
        Buku sj4 = new Buku("The Human Web: A Bird’s-Eye View of World History");
        sj4.tambahPenulis(sp4);
        sj4.tambahPenulis(sp4b);
        sejarah.tambahBuku(sj4);

        Penulis sp5 = new Penulis("Rhoads Murphey");
        Penulis sp5b = new Penulis("James A. Millward");
        Penulis sp5c = new Penulis("Christopher I. Beckwith");
        Buku sj5 = new Buku("A History of Asia");
        sj5.tambahPenulis(sp5);
        sj5.tambahPenulis(sp5b);
        sj5.tambahPenulis(sp5c);
        sejarah.tambahBuku(sj5);
        
        // agama
        Kategori agama = new Kategori("Agama");
        semuaKategori.add(agama);

        Penulis ap1 = new Penulis("Karen Armstrong");
        Buku aj1 = new Buku("A History of God");
        aj1.tambahPenulis(ap1);
        agama.tambahBuku(aj1);
        
        Penulis ap2 = new Penulis("Huston Smith");
        Buku aj2 = new Buku("The World’s Religions");
        aj2.tambahPenulis(ap2);
        agama.tambahBuku(aj2);
        
        Penulis ap3 = new Penulis("Reza Aslan");
        Buku aj3 = new Buku("No God but God");
        aj3.tambahPenulis(ap3);
        agama.tambahBuku (aj3);

        Penulis ap4 = new Penulis("John Bowker");
        Penulis ap4b = new Penulis("David Ford");
        Buku aj4 = new Buku("The Cambridge Illustrated History of Religions");
        aj4.tambahPenulis(ap4);
        aj4.tambahPenulis(ap4b);
        agama.tambahBuku(aj4);

        Penulis ap5 = new Penulis("Mary Pat Fisher");
        Penulis ap5b = new Penulis("Robin Rinehart");
        Penulis ap5c = new Penulis("Jonathan H. X. Lee");
        Buku aj5 = new Buku("Living Religions");
        aj5.tambahPenulis(ap5);
        aj5.tambahPenulis(ap5b);
        aj5.tambahPenulis(ap5c);
        agama.tambahBuku(aj5);

        // psikologi
        Kategori psikologi = new Kategori("Psikologi");
        semuaKategori.add(psikologi);

        Penulis pp1 = new Penulis("Daniel Kahneman");
        Buku pj1 = new Buku("Thinking, Fast and Slow");
        pj1.tambahPenulis(pp1);
        psikologi.tambahBuku(pj1);
        
        Penulis pp2 = new Penulis("Sigmund Freud");
        Buku pj2 = new Buku("The Interpretation of Dreams");
        pj2.tambahPenulis(pp2);
        psikologi.tambahBuku(pj2);
        
        Penulis pp3 = new Penulis("Carl R. Rogers");
        Buku pj3 = new Buku("On Becoming a Person");
        pj3.tambahPenulis(pp3);
        psikologi.tambahBuku (pj3);

        Penulis pp4 = new Penulis("Richard Gerrig");
        Penulis pp4b = new Penulis("Philip Zimbardo");
        Buku pj4 = new Buku("Psychology and Life");
        pj4.tambahPenulis(pp4);
        pj4.tambahPenulis(pp4b);
        psikologi.tambahBuku(pj4);

        Penulis pp5 = new Penulis("David G. Myers");
        Penulis pp5b = new Penulis("C. Nathan DeWall");
        Penulis pp5c = new Penulis("Kathleen Vohs");
        Buku pj5 = new Buku("Psychology");
        pj5.tambahPenulis(pp5);
        pj5.tambahPenulis(pp5b);
        pj5.tambahPenulis(pp5c);
        psikologi.tambahBuku(pj5);

        // politik
        Kategori politik = new Kategori("Politik");
        semuaKategori.add(politik);

        Penulis polp1 = new Penulis("Niccolò Machiavelli");
        Buku polj1 = new Buku("The Prince");
        polj1.tambahPenulis(polp1);
        politik.tambahBuku(polj1);
        
        Penulis polp2 = new Penulis("Samuel P. Huntington");
        Buku polj2 = new Buku("The Clash of Civilizations");
        polj2.tambahPenulis(polp2);
        politik.tambahBuku(polj2);
        
        Penulis polp3 = new Penulis("Francis Fukuyama");
        Buku polj3 = new Buku("The End of History and the Last Man");
        polj3.tambahPenulis(polp3);
        politik.tambahBuku (polj3);

        Penulis polp4 = new Penulis("Steven Levitsky");
        Penulis polp4b = new Penulis("Daniel Ziblatt");
        Buku polj4 = new Buku("How Democracies Die");
        polj4.tambahPenulis(polp4);
        polj4.tambahPenulis(polp4b);
        politik.tambahBuku(polj4);

        Penulis polp5 = new Penulis("G. Bingham Powell Jr.");
        Penulis polp5b = new Penulis("Kaare Strøm");
        Penulis polp5c = new Penulis("Russell J. Dalton");
        Buku polj5 = new Buku("Comparative Politics Today");
        polj5.tambahPenulis(polp5);
        polj5.tambahPenulis(polp5b);
        polj5.tambahPenulis(polp5c);
        politik.tambahBuku(polj5);

        // fiksi
        Kategori fiksi = new Kategori("Fiksi");
        semuaKategori.add(fiksi);

        Penulis fikp1 = new Penulis("J.K. Rowling");
        Buku fikj1 = new Buku("Harry Potter and the Sorcerer’s Stone");
        fikj1.tambahPenulis(fikp1);
        fiksi.tambahBuku(fikj1);
        
        Penulis fikp2 = new Penulis("George Orwell");
        Buku fikj2 = new Buku("1984");
        fikj2.tambahPenulis(fikp2);
        fiksi.tambahBuku(fikj2);
        
        Penulis fikp3 = new Penulis("Harper Lee");
        Buku fikj3 = new Buku("To Kill a Mockingbird");
        fikj3.tambahPenulis(fikp3);
        fiksi.tambahBuku (fikj3);

        Penulis fikp4 = new Penulis("Terry Pratchett");
        Penulis fikp4b = new Penulis("Neil Gaiman");
        Buku fikj4 = new Buku("Good Omens");
        fikj4.tambahPenulis(fikp4);
        fikj4.tambahPenulis(fikp4b);
        fiksi.tambahBuku(fikj4);

        Penulis fikp5 = new Penulis("James Patterson");
        Penulis fikp5b = new Penulis("Chris Tebbetts");
        Penulis fikp5c = new Penulis("Laura Park");
        Buku fikj5 = new Buku("Middle School: The Worst Years of My Life");
        fikj5.tambahPenulis(fikp5);
        fikj5.tambahPenulis(fikp5b);
        fikj5.tambahPenulis(fikp5c);
        fiksi.tambahBuku(fikj5);

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("=== PILIH KATEGORI ===");
            for (int i = 0; i < semuaKategori.size(); i++) {
                System.out.println((i + 1) + ". " + semuaKategori.get(i).getNamaKategori());
            }
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            int pilih = in.nextInt();
            System.out.println();

            if (pilih == 0) break;
            if (pilih < 1 || pilih > semuaKategori.size()) {
                System.out.println("Pilihan tidak valid!\n");
                continue;
            }

            Kategori dipilih = semuaKategori.get(pilih - 1);

            System.out.println("Kategori: " + dipilih.getNamaKategori());
            for (Buku b : dipilih.getdaftarbuku()) {
                System.out.printf("- %-100s %s\n", b.getJudul(), " | Penulis: "
                        + Buku.formatPenulis(b.getdaftarpenulis()));
            }

            System.out.println();
        }
        
        in.close();
    }
}