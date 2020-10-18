package com.Reva.Tugas2.Nomer2;

// Class DemoBinatang
public class DemoBinatang {
    public static void main(String[] args) {

        // Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Hantu";
        burung.makan = "Burung Hantu makan Tikus";
        burung.tidur = "Burung Hantu tidur pada siang hari";
        burung.terbang = "Burung Hantu Terbang Menggunakan Sayap";

        // Memanggil Method Burung
        System.out.println("\t\t\t*** BURUNG ***");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Piranha";
        ikan.makan = "Ikan Piranha Makan Daging";
        ikan.tidur = "Ikan Piranha Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Piranha Berenang Menggunakan Sirip dan Ekor";

        System.out.println();

        // Memanggil Method IKAN
        System.out.println("\t\t\t*** IKAN ***");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Persia";
        kucing.makan = "Kucing Persia Makanan Royal Canin dan Whiskas ";
        kucing.tidur = "Kucing Persia Pada Malam Hari";
        kucing.meong = "Kucing Persia Mengeong Saat Lapar";

        // Memanggil Method Kucing
        System.out.println("\t\t\t*** KUCING ***");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}