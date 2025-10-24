package com;

import com.polymorphism.*;

public class App {
    public static void main(String[] args) throws Exception {
        Manusia deki = new Ayah(
                "Deki",
                28,
                "Bogor",
                true,
                "Laki-laki",
                "Main Game",
                2,
                "Mobil");

        Manusia putri = new Ibu(
                "Putri",
                27,
                "Bogor",
                false,
                "Perempuan",
                "Nasi Goreng",
                "SMA");

        deki.memilikiAnak();
        deki.bekerja();
        deki.bermain();
        deki.berbicara();
        deki.memperbaikiKendaraan();

        // Casting Ayah
        if (deki instanceof Ayah) {
            ((Ayah) deki).perkenalan(
                    "Ibu Rumah Tangga",
                    "Putri");
        }

        putri.mengurusRumah();
        putri.memasak();
        putri.berbicara();
        putri.memberiNasihat();

        // Casting Ibu
        if (putri instanceof Ibu) {
            ((Ibu) putri).perkenalan(
                    "Nasi Goreng",
                    "Ibu Rumah Tangga");
        }
    }
}
