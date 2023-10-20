package com.tutorial;

public class Main {

    public static void main(String[] args) {
        int result1 = add(5, 10);
        double result2 = add(3.5, 2.7);

        System.out.println("Hasil penjumlahan int: " + result1);
        System.out.println("Hasil penjumlahan double: " + result2);
    }

    // Overload method untuk penjumlahan int
    private static int add(int a, int b) {
        return a + b;
    }

    // Overload method untuk penjumlahan double
    private static double add(double a, double b) {
        return a + b;
    }
}
