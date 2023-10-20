package com.tutorial;

import java.util.Arrays;

public class Main {

	public static void main (String[] args) {
		
		int[] arrayAngka1 = {1,2,3,4,5};
		
		// merubah array menjadi String
		System.out.println("\nMerubah array menjadi string\n===========================");
		printArray(arrayAngka1);
		
		// mengkopi array
		System.out.println("\nMengkopi array\n=========================================");
		int[] arrayAngka2 = new int[5];
		printArray(arrayAngka1);
		printArray(arrayAngka2);
		System.out.println("\nMengkopi dengan loop\n====================================");
		for(int i=0; i < arrayAngka1.length;i++) {
			arrayAngka2[i] = arrayAngka1[i];
		}
		printArray(arrayAngka1);
		System.out.println(arrayAngka1);
		printArray(arrayAngka2);
		System.out.println(arrayAngka2);
		
		// mengkopi dengan copyOf
		System.out.println("\nMengkopi dengan copyOf\n==================================");
		int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 4);
		printArray(arrayAngka1);
		System.out.println(arrayAngka1);
		printArray(arrayAngka3);
		System.out.println(arrayAngka3);
		
		
		//Mengkopi dengan copyOf Range
		System.out.println("\nMengkopi dengan copyOfRange\n========================");
		int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3, 5);
		printArray(arrayAngka1);
		System.out.println(arrayAngka1);
		printArray(arrayAngka4);
		System.out.println(arrayAngka4);
		
		
		//fill array
		System.out.println("\nFill array\n===================");
		 int[] arrayAngka5 = new int[6];
		 printArray(arrayAngka5);
		 Arrays.fill(arrayAngka5, 5);
		 printArray(arrayAngka5);
		
		 
		 // komparasi array
		 System.out.println("\nkomparasi array\n===================");
		 int[] arrayAngka6 = {1,2,3,4,5};
		 int[] arrayAngka7 = {1,2,3,4,6};
		 
		 System.out.println("\nmembandingkan antara dua buah array");
		 System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
		 
		 if (Arrays.equals(arrayAngka6, arrayAngka7)) {
			 System.out.println("array ini sama");
		 }  else {
			System.out.println("array ini beda");
		}
		 
		 System.out.println("\nmengecek mana array yg lebih besar");
		 System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));
		 
		 System.out.println("\n ngcek mana index yang berbedza");
		 System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));
		 
		 // sort array
		 System.out.println("\n sort array\n=================");
		 int [] arrayAngka8 = {1,3,2,5,4,6,7,8,};
		 printArray(arrayAngka8);
		 Arrays.sort(arrayAngka8);
		 printArray(arrayAngka8);
		 
		 
		 // search array
		 System.out.println("\n search array\n=================");
		 int angka = 6;
		 int posisi = Arrays.binarySearch(arrayAngka8, angka);
		 System.out.println("angka " + angka + " ada di index " + posisi);
		 
		//
		 
	}

		private static void printArray(int[] dataArray) {
			System.out.println("array = " + Arrays.toString(dataArray));
		}
	
}
