package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a= ");
        a = inputUser.nextFloat();
        System.out.print("operator= ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b= ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        switch (operator) {
            case '+':
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("pembagi nol menghasilkan tak hingga");
                } else {
                    hasil = a / b;
                    System.out.println("hasil = " + hasil);
                }
                break;
            default:
                System.out.println("operator tidak ditemukan");
                break;
        }
    }
}
