package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];
        
        arrayAngka2 = arrayAngka1;
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));
        
        ubahNilaiArray(arrayAngka1); // Panggil metode untuk mengubah array secara eksplisit
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));
        
    }
    
    // Metode untuk mengubah nilai array secara eksplisit
    public static void ubahNilaiArray(int[] arr) {
        arr[0] = 100;
    }
}
