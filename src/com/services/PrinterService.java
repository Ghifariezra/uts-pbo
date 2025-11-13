package com.services;

import java.util.ArrayList;
import com.polymorphism.*;

public class PrinterService {
    public static void printOut(String pilihan, ArrayList<Object> listItems) {
        for (Object obj : listItems) {
            if (obj instanceof Manusia manusia && manusia.getName().equalsIgnoreCase(pilihan)) {
                if (pilihan.equals("deki")) {
                    manusia.memilikiAnak();
                    manusia.bekerja();
                    manusia.bermain();
                    manusia.berbicara();
                    manusia.memperbaikiKendaraan();

                    if (manusia instanceof Ayah ayah) {
                        ayah.perkenalan("Ibu Rumah Tangga", "Putri");
                    }
                } else if (pilihan.equals("putri")) {
                    manusia.mengurusRumah();
                    manusia.memasak();
                    manusia.berbicara();
                    manusia.memberiNasihat();

                    if (manusia instanceof Ibu ibu) {
                        ibu.perkenalan("Nasi Goreng", "Ibu Rumah Tangga");
                    }
                }
            }
        }
    }
}
