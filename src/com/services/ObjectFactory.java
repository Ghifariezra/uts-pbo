package com.services;

import java.util.ArrayList;
import com.polymorphism.*;

public class ObjectFactory extends BaseService {
    @Override
    public ArrayList<Object> createObjects(String[] names) {
        ArrayList<Object> listItems = new ArrayList<>();

        for (String name : names) {
            String lower = name.toLowerCase();
            switch (lower) {
                case "deki":
                    listItems.add(new Ayah(
                            name, 28, "Bogor", true, "Laki-laki",
                            "Main Game", 2, "Mobil"));
                    break;
                case "putri":
                    listItems.add(new Ibu(
                            name, 27, "Bogor", false, "Perempuan",
                            "Nasi Goreng", "SMA"));
                    break;
            }
        }

        return listItems;
    }

    @Override
    public void printOut(String pilihan, ArrayList<Object> listItems) {}
}
