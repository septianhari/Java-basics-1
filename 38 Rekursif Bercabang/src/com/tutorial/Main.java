package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 5; // Ganti dengan angka Fibonacci yang ingin Anda hitung
        for (int i = 0; i < n; i++) {
            int fibonacci = calculateFibonacci(i);
            System.out.print(fibonacci + " ");
        }
    }

    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
