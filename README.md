# 👤 Nama: **Ghifari Ezra Ramadhan**
# 🎓 NIM: **4524210041**

## 📋 Deskripsi Program
Tugas UTS PBO ini merupakan implementasi konsep Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java, di mana mahasiswa diminta membuat satu kelas induk beserta minimal dua kelas turunannya dengan tema pilihan dari salah satu kategori yaitu Manusia, Hewan, atau Kendaraan. Program yang dibuat harus memiliki total minimal sepuluh properti dan sepuluh method, serta menerapkan berbagai access modifier seperti private, protected, dan public. Selain itu, dalam tiga kelas yang dibuat harus terdapat penerapan constructor, overriding, dan overloading. Tujuan dari tugas ini adalah untuk menguji pemahaman mahasiswa terhadap konsep dasar OOP seperti inheritance, encapsulation, dan polymorphism, serta kemampuan dalam mengimplementasikan konsep tersebut ke dalam kode program Java yang terstruktur dan efisien.

---

## 🏗️ Struktur Proyek
```bash
UTS
|   README.md
|
+---.vscode
|       settings.json
|
+---bin
|   \---com
|       |   App.class
|       |
|       +---polymorphism
|       |       Ayah.class
|       |       Ibu.class
|       |       Manusia.class
|       |
|       \---services
|               ObjectFactory.class
|               PrinterService.class
|
+---lib
\---src
    \---com
        |   App.java
        |
        +---polymorphism
        |       Ayah.java
        |       Ibu.java
        |       Manusia.java
        |
        \---services
                ObjectFactory.java
                PrinterService.java
```

--- 

## ⚙️ Cara Menjalankan Program
1. Tetap di `root` project
2. Kompilasi dengan `javac App.java`
   ```bash
   javac -d bin .\src\com\polymorphism\*.java .\src\com\App.java
   ```
3. Jalankan dengan `java App`
    ```bash
    java -cp bin com.App
    ```

---

## 🖥️ Output Program
```bash
Deki memiliki 2 anak.
Deki sedang bekerja di kantor.
Deki sedang bermain Main Game.
Deki sedang berbicara dengan ibu.
Deki sedang memperbaiki Mobil.

=================================
Halo, nama saya Deki.
Umur saya 28 tahun.
Saya tinggal di Bogor.
Saya sedang bekerja sebagai Ibu Rumah Tangga.
Jenis kelamin saya Laki-laki.
Saya memiliki anak bernama Putri.
Saya suka bermain Main Game.
=================================

Putri sedang mengurus rumah.
Putri sedang memasak Nasi Goreng.
Putri sedang berbicara dengan ayah.
Putri memberi nasihat kepada anak-anaknya.

=================================
Halo, nama saya Putri.
Umur saya 27 tahun.
Saya tinggal di Bogor.
Saya menjadi Ibu Rumah Tangga.
Jenis kelamin saya Perempuan.
Saya memiliki keahlian masak Nasi Goreng.
Saya memiliki pendidikan terakhir SMA.
Saya suka memasak Nasi Goreng.
=================================
```