package com.tutorial;

public class Main {

	public static void main(String[] args) {
		
//		do {
//			aksi
//		} while (kondisi);

		
		
		System.out.println("ini adalah awal program");
		
		int i = 0;
		boolean kondisi = true;
		
		
		do {
			i++;
			System.out.println("do while ke-" + i);
			
			if (i == 10) {
				kondisi = false;
			}
			
		} while(kondisi);
		
		System.out.println("ini akhir program");
		
	}
}
