package com.tutorial;

public class Main {
	
	  public static void main(String[] args) {

	        // Operasi Aritmatika

	        int variable1 = 20;
	        int variable2 = 5;

	        int hasil;

	        // 1. penjumlahan

	        hasil = variable1 + variable2;
	        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

	        // 2. pengurangan
	        hasil = variable1 - variable2;
	        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

	        // 3. perkalian
	        hasil = variable1 * variable2;
	        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

	        // 4. pembagian
	        hasil = variable1 / variable2;
	        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);

	        float a = 20;
	        float b = 5;
	        float hasilFloat = a/b;
	        System.out.println(a + " / " + b + " = " + hasilFloat);

	        // 5. modulus (sisa pembagian)
	        hasil = variable1 % variable2;
	        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);

	    }
	}


