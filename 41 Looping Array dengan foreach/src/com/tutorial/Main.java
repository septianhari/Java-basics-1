package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // Buat sebuah array dengan beberapa elemen
        String[] namaHewan = {"Kucing", "Anjing", "Burung", "Kuda"};

        // Cetak isi array sebelum perubahan
        System.out.println("Isi array sebelum perubahan:");
        for (String hewan : namaHewan) {
            System.out.println(hewan);
        }

        // Ganti elemen kedua (indeks 1) dengan nilai baru
        namaHewan[1] = "Ikan";

        // Cetak isi array setelah perubahan
        System.out.println("\nIsi array setelah perubahan:");
        for (String hewan : namaHewan) {
            System.out.println(hewan);
        }
    }
}
