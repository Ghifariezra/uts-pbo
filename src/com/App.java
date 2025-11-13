package com;

import com.services.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan pilihan: ");
        String pilihan = input.nextLine().toLowerCase();

        String[] names = { "Deki", "Putri" };
        var listItems = ObjectFactory.createObjects(names);

        PrinterService.printOut(pilihan, listItems);

        input.close();
    }
}
